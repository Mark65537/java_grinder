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

#ifndef _DSPIC_H
#define _DSPIC_H

#include "Generator.h"

class DSPIC : public Generator
{
public:
  virtual int open(char *filename);

  virtual void serial_init();
  virtual void method_start(int local_count, const char *name);
  virtual void method_end(int local_count);
  virtual int push_integer(int32_t n);
  virtual int push_integer_local(int index);
  virtual int push_long(int64_t n);
  virtual int push_float(float f);
  virtual int push_double(double f);
  virtual int push_byte(char b);
  virtual int push_short(int16_t s);
  virtual int pop_integer_local(int index);
  virtual int pop();
  virtual int dup();
  virtual int dup2();
  virtual int swap();
  virtual int add_integers();
  virtual int sub_integers();
  virtual int mul_integers();
  virtual int div_integers();
  virtual int neg_integer();
  virtual int shift_left_integer();
  virtual int shift_right_integer();
  virtual int shift_right_uinteger();
  virtual int and_integer();
  virtual int or_integer();
  virtual int xor_integer();
  virtual int inc_integer(int index, int num);
  virtual int jump_cond(int cond);
  virtual int jump_cond_integer(int cond);
  virtual int ret_local(int index);
  virtual int ret_integer();
  virtual int ret();
  virtual int jump(const char *name);
  virtual int call(const char *name);
  virtual int brk();
  virtual void close();

private:
  int reg;            // count number of registers are are using as stack
  int stack_count;    // count how many things we put on the stack
};

#endif
