/**
 *  Java Grinder
 *  Author: Michael Kohn
 *   Email: mike@mikekohn.net
 *     Web: http://www.mikekohn.net/
 * License: GPL
 *
 * Copyright 2014 by Michael Kohn
 *
 */

#include <stdio.h>
#include <stdlib.h>
#include <stdint.h>

#include "MC68000.h"

#define REG_STACK(a) (reg)
#define LOCALS(i) (i * 4)

// ABI is:
// d0 - top of stack
// d1
// d2
// d3
// d4
// d5 - bottom of stack
// d6
// d7
// a0
// a1
// a2
// a3
// a4
// a5 Pointer to heap
// a6 Link register
// a7 Stack Pointer

MC68000::MC68000() :
  reg(0),
  reg_max(6),
  stack(0),
  is_main(0)
{

}

MC68000::~MC68000()
{

}

int MC68000::open(char *filename)
{
  if (Generator::open(filename) != 0) { return -1; }

  // For now we only support a specific chip
  fprintf(out, ".680x0\n");

  // Set where RAM starts / ends
  // FIXME - Not sure what to set this to right now
  fprintf(out, "ram_start equ 0\n");
  fprintf(out, "ram_end equ 0x8000\n");

  return 0;
}

int MC68000::start_init()
{
  // Add any set up items (stack, registers, etc).
  //fprintf(out, ".org ???\n");
  fprintf(out, "start:\n");

  return 0;
}

int MC68000::insert_static_field_define(const char *name, const char *type, int index)
{
  fprintf(out, "%s equ ram_start+%d\n", name, (index + 1) * 4);
  return 0;
}

int MC68000::init_heap(int field_count)
{
  fprintf(out, "  ;; Set up heap and static initializers\n");
  fprintf(out, "  move.l #ram_start+%d, &ram_start\n", (field_count + 1) * 2);
  return 0;
}

int MC68000::insert_field_init_boolean(char *name, int index, int value)
{
  value = (value == 0) ? 0 : 1;

  fprintf(out, "  mov.l #%d, %s\n", value, name);
  return 0;
}

int MC68000::insert_field_init_byte(char *name, int index, int value)
{
  fprintf(out, "  mov.l #%d, %s\n", value, name);
  return 0;
}

int MC68000::insert_field_init_short(char *name, int index, int value)
{
  fprintf(out, "  mov.l #%d, %s\n", value, name);
  return 0;
}

int MC68000::insert_field_init_int(char *name, int index, int value)
{
  fprintf(out, "  mov.l #%d, %s\n", value, name);
  return 0;
}

int MC68000::insert_field_init(char *name, int index)
{
  return -1;
}

void MC68000::method_start(int local_count, const char *name)
{
}

void MC68000::method_end(int local_count)
{
}

int MC68000::push_integer(int32_t n)
{
  return -1;
}

int MC68000::push_integer_local(int index)
{
  return -1;
}

int MC68000::push_ref_local(int index)
{
  return push_integer_local(index);
}

int MC68000::push_long(int64_t n)
{
  return -1;
}

int MC68000::push_float(float f)
{
  return -1;
}

int MC68000::push_double(double f)
{
  return -1;
}

int MC68000::push_byte(int8_t b)
{
  return -1;
}

int MC68000::push_short(int16_t s)
{
  return -1;
}

int MC68000::pop_integer_local(int index)
{
  return -1;
}

int MC68000::pop_ref_local(int index)
{
  return pop_integer_local(index);
}

int MC68000::pop()
{
  return -1;
}

int MC68000::dup()
{
  return -1;
}

int MC68000::dup2()
{
  return -1;
}

int MC68000::swap()
{
  return -1;
}

int MC68000::add_integer()
{
  return -1;
}

int MC68000::sub_integer()
{
  return -1;
}

int MC68000::mul_integer()
{
  return -1;
}

int MC68000::div_integer()
{
  return -1;
}

int MC68000::mod_integer()
{
  return -1;
}

int MC68000::neg_integer()
{
  return -1;
}

int MC68000::shift_left_integer()
{
  return -1;
}

int MC68000::shift_right_integer()
{
  return -1;
}

int MC68000::shift_right_uinteger()
{
  return -1;
}

int MC68000::and_integer()
{
  return -1;
}

int MC68000::or_integer()
{
  return -1;
}

int MC68000::xor_integer()
{
  return -1;
}

int MC68000::inc_integer(int index, int num)
{
  return -1;
}

int MC68000::jump_cond(const char *label, int cond)
{
  return -1;
}

int MC68000::jump_cond_integer(const char *label, int cond)
{
  return -1;
}

int MC68000::return_local(int index, int local_count)
{
  return -1;
}

int MC68000::return_integer(int local_count)
{
  return -1;
}

int MC68000::return_void(int local_count)
{
  return -1;
}

int MC68000::jump(const char *name)
{
  return -1;
}

int MC68000::call(const char *name)
{
  return -1;
}

int MC68000::invoke_static_method(const char *name, int params, int is_void)
{
  return -1;
}

int MC68000::put_static(const char *name, int index)
{
  return -1;
}

int MC68000::get_static(const char *name, int index)
{
  return -1;
}

int MC68000::brk()
{
  return -1;
}

int MC68000::new_array(uint8_t type)
{
  return -1;
}

int MC68000::insert_array(const char *name, int32_t *data, int len, uint8_t type)
{
  if (type == TYPE_BYTE)
  { return insert_db(name, data, len, TYPE_INT); }
    else
  if (type == TYPE_SHORT)
  { return insert_dw(name, data, len, TYPE_INT); }
    else
  if (type == TYPE_INT)
  { return insert_dc32(name, data, len, TYPE_INT); }

  return -1;
}

int MC68000::push_array_length()
{
  return -1;
}

int MC68000::push_array_length(const char *name, int field_id)
{
  return -1;
}

int MC68000::array_read_byte()
{
  return -1;
}

int MC68000::array_read_short()
{
  return -1;
}

int MC68000::array_read_int()
{
  return -1;
}

int MC68000::array_read_byte(const char *name, int field_id)
{
  return -1;
}

int MC68000::array_read_short(const char *name, int field_id)
{
  return -1;
}

int MC68000::array_read_int(const char *name, int field_id)
{
  return -1;
}

int MC68000::array_write_byte()
{
  return -1;
}

int MC68000::array_write_short()
{
  return -1;
}

int MC68000::array_write_int()
{
  return -1;
}

int MC68000::array_write_byte(const char *name, int field_id)
{
  return -1;
}

int MC68000::array_write_short(const char *name, int field_id)
{
  return -1;
}

int MC68000::array_write_int(const char *name, int field_id)
{
  return -1;
}

#if 0
void MC68000::close()
{
}
#endif


