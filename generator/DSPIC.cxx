/**
 *  Java Grinder
 *  Author: The Naken Crew
 *   Email: mike@mikekohn.net
 *     Web: http://www.naken.cc/
 * License: GPL
 *
 * Copyright 2013 by The Naken Crew
 *
 */


#define __STDC_FORMAT_MACROS

#include <stdio.h>
#include <stdlib.h>
#include <stdint.h>
#include <inttypes.h>

#include "DSPIC.h"

int DSPIC::open(char *filename)
{
  if (Generator::open(filename) != 0) { return -1; }

  // For now we only support a specific chip
  fprintf(out, ".dspic\n");
  fprintf(out, ".include \"p30f3012.inc\"\n\n");

  // Add any set up items (stack, registers, etc)
  fprintf(out, "start:\n\n");

  return 0;
}

void DSPIC::serial_init()
{
}

void DSPIC::method_start(int local_count, const char *name)
{
  reg = 0;
  stack_count = 0;

  // main() function goes here
  fprintf(out, "%s:\n", name);
  fprintf(out, "  sub #0x%x, sp\n", local_count * 2);
}

void DSPIC::method_end(int local_count)
{
  fprintf(out, "  add #0x%x, sp\n", local_count * 2);
  fprintf(out, "  ret\n\n");
}

int DSPIC::push_integer(int32_t n)
{
  if (n > 65535 || n < -32768)
  {
    printf("Error: literal value %d bigger than 16 bit.\n", n);
    return -1;
  }

  uint16_t value = (n & 0xffff);

  if (reg < 8)
  {
    fprintf(out, "  mov #0x%02x, w%d\n", value, (reg + 1));
    reg++;
  }
    else
  {
    fprintf(out, "  mov #0x%02x, w0\n", value);
    fprintf(out, "  push w0\n");
  }

  return 0;
}

int DSPIC::push_integer_local(int index)
{
  fprintf(out, "  mov [sp+%d], w0\n", (index + 1) * 2);

  if (reg < 8)
  {
    fprintf(out, "  mov w0, w%d\n", (reg + 1));
    reg++;
  }
    else
  {
    fprintf(out, "  push w0\n");
  }

  return 0;
}

int DSPIC::push_long(int64_t n)
{
  if (n > 65535 || n < -32768)
  {
    printf("Error: literal value %" PRId64 " bigger than 16 bit.\n", n);
    return -1;
  }

  uint16_t value = (n & 0xffff);

  if (reg < 8)
  {
    fprintf(out, "  mov #0x%02x, w%d\n", value, (reg + 1));
    reg++;
  }
    else
  {
    fprintf(out, "  mov #0x%02x, w0\n", value);
    fprintf(out, "  push w0\n");
  }
  return 0;
}

int DSPIC::push_float(float f)
{
  printf("Error: float is not currently supported.\n");
  return -1;
}

int DSPIC::push_double(double f)
{
  printf("Error: double is not currently supported.\n");
  return -1;
}

int DSPIC::push_byte(char b)
{
  uint16_t value = ((int32_t)b)&0xffff;

  if (reg < 8)
  {
    fprintf(out, "  mov #0x%02x, w%d\n", value, (reg + 1));
    reg++;
  }
    else
  {
    fprintf(out, "  mov #0x%02x, w0\n", value);
    fprintf(out, "  push w0\n");
  }
  return 0;
}

int DSPIC::push_short(int16_t s)
{
  uint16_t value = s;

  if (reg < 8)
  {
    fprintf(out, "  mov #0x%02x, w%d\n", value, (reg + 1));
    reg++;
  }
    else
  {
    fprintf(out, "  mov #0x%02x, w0\n", value);
    fprintf(out, "  push w0\n");
  }
  return 0;
}

int DSPIC::pop_integer_local(int index)
{
  return 0;
}

int DSPIC::pop()
{
  return 0;
}

int DSPIC::dup()
{
  return 0;
}

int DSPIC::dup2()
{
  return 0;
}

int DSPIC::swap()
{
  return 0;
}

int DSPIC::add_integers()
{
  return 0;
}

int DSPIC::sub_integers()
{
  return 0;
}

int DSPIC::mul_integers()
{
  return 0;
}

int DSPIC::div_integers()
{
  return 0;
}

int DSPIC::neg_integer()
{
  return 0;
}

int DSPIC::shift_left_integer()
{
  return 0;
}

int DSPIC::shift_right_integer()
{
  return 0;
}

int DSPIC::shift_right_uinteger()
{
  return 0;
}

int DSPIC::and_integer()
{
  return 0;
}

int DSPIC::or_integer()
{
  return 0;
}

int DSPIC::xor_integer()
{
  return 0;
}

int DSPIC::inc_integer(int index, int num)
{
  return 0;
}

int DSPIC::jump_cond(int cond)
{
  return 0;
}

int DSPIC::jump_cond_integer(int cond)
{
  return 0;
}

int DSPIC::ret_local(int index)
{
  return 0;
}

int DSPIC::ret_integer()
{
  return 0;
}

int DSPIC::ret()
{
  return 0;
}

int DSPIC::jump(const char *name)
{
  return 0;
}

int DSPIC::call(const char *name)
{
  return 0;
}

int DSPIC::brk()
{
  return 0;
}

void DSPIC::close()
{
}

