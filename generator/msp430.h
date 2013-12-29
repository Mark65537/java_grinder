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

#ifndef _MSP430_H
#define _MSP430_H

struct msp430_t
{
  int place_holder;
};

int msp430_init(void **context, FILE *out);
void msp430_serial_init(void *context, FILE *out);
void msp430_main(void *context, FILE *out);
void msp430_close(void *context, FILE *out);

#endif
