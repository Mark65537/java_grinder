
public class NakenLogo
{
  public static int[] pattern =
  {
    // Pattern 0
    0x00000000, 0x00000000, 0x00000000, 0x00000000,
    0x00000000, 0x00000000, 0x00000000, 0x00000000,
    // Pattern 1
    0x00000000, 0x00000000, 0x00000000, 0x00000000,
    0x00111111, 0x00111111, 0x00111111, 0x00111111,
    // Pattern 2
    0x00000000, 0x00000000, 0x00000000, 0x00000000,
    0x11111111, 0x11111111, 0x11111111, 0x11111111,
    // Pattern 3
    0x00000000, 0x00000000, 0x00000000, 0x00000000,
    0x11000000, 0x11000000, 0x11000000, 0x11000000,
    // Pattern 4
    0x00111111, 0x00111111, 0x00111111, 0x00111111,
    0x00111111, 0x00111111, 0x00111111, 0x00111111,
    // Pattern 5
    0x11111111, 0x11111111, 0x11111111, 0x11111111,
    0x11111111, 0x11111111, 0x11111111, 0x11111111,
    // Pattern 6
    0x11000000, 0x11000000, 0x11000000, 0x11000000,
    0x11000000, 0x11000000, 0x11000000, 0x11000000,
    // Pattern 7
    0x11111111, 0x11111233, 0x11111233, 0x11111234,
    0x11111234, 0x11111534, 0x11111234, 0x11111234,
    // Pattern 8
    0x11111111, 0x33333678, 0x66666333, 0x11111153,
    0x1111119a, 0x1111119a, 0x1111119a, 0x111111b3,
    // Pattern 9
    0x11111111, 0x1111111b, 0xc1111263, 0xd1112337,
    0x6c19a3c1, 0x3c153411, 0x6c1b3c11, 0x419a6c11,
    // Pattern 10
    0x11111111, 0x3336d811, 0x3d3333d8, 0x11119a3d,
    0x111111b3, 0x11111126, 0x1111111b, 0x11111115,
    // Pattern 11
    0x11111111, 0x111b3e11, 0x11123411, 0x81196d11,
    0x4111a6c1, 0xd81153e1, 0x3e1123e1, 0x34119ad1,
    // Pattern 12
    0x11111111, 0x111233e1, 0x11153341, 0x119a6ad8,
    0x1196453c, 0x1153c264, 0x11b681ad, 0x19a411b3,
    // Pattern 13
    0x11111111, 0x11112341, 0x111153e1, 0x1111b3c1,
    0x11196d11, 0x11123411, 0x11153e11, 0xc11bd811,
    // Pattern 14
    0x11111111, 0x23333333, 0x23333333, 0x23411111,
    0x23411111, 0x23411111, 0x23411111, 0x236da6da,
    // Pattern 15
    0x11111111, 0x33331123, 0x33331123, 0x11111123,
    0x11111123, 0x11111123, 0x11111123, 0x6ad31123,
    // Pattern 16
    0x11111111, 0x33333336, 0x33333333, 0x31111119,
    0x31111111, 0x31111111, 0x31111111, 0x3111111b,
    // Pattern 17
    0x11111111, 0x71111233, 0x3d811233, 0xa3e11234,
    0x23411234, 0x23d11234, 0x53411234, 0x33c11236,
    // Pattern 18
    0x11111111, 0x36333333, 0x66666636, 0x11111111,
    0x11111111, 0x11111111, 0x11111111, 0xd363d33d,
    // Pattern 19
    0x11111111, 0x41153333, 0x31123666, 0x11123411,
    0x11123e11, 0x11153411, 0x11123411, 0x81153411,
    // Pattern 20
    0x11111111, 0x33367111, 0x66633d81, 0x1119a3d8,
    0x11111b3e, 0x1111123d, 0x111119a6, 0x111119a3,
    // Pattern 21
    0x11111111, 0x11111111, 0x11111111, 0x11111111,
    0x11111111, 0x11111111, 0xc1111111, 0xc1111111,
    // Pattern 22
    0x11111111, 0x53333333, 0x23333333, 0x53311111,
    0x53311111, 0x53311111, 0x53311111, 0x53366666,
    // Pattern 23
    0x11111111, 0xd811133d, 0x33e119a3, 0x23d81123,
    0x133c1115, 0x136c1111, 0x26d11111, 0x3d811111,
    // Pattern 24
    0x11111111, 0x11111111, 0xe1111112, 0x6c11119a,
    0x3d1111b3, 0xa3e1123d, 0x266c9a6c, 0x153db3e1,
    // Pattern 25
    0x11111111, 0xb3411111, 0x3d811111, 0x3c111111,
    0x41111111, 0x11111111, 0x11111111, 0x11111111,
    // Pattern 26
    0x11111536, 0x11111233, 0x11111564, 0x11111234,
    0x11111534, 0x11111234, 0x11111234, 0x11111534,
    // Pattern 27
    0x666a6336, 0x33363678, 0x11111111, 0x11111111,
    0x11111111, 0x11111111, 0x11111111, 0x11111111,
    // Pattern 28
    0xc19a3811, 0x119a6c11, 0x111b3c11, 0x11153411,
    0x1119a3c1, 0x11112337, 0x11111263, 0x1111111b,
    // Pattern 29
    0x11111115, 0x11111115, 0x1111111b, 0x11111196,
    0x111111b3, 0x11119a3d, 0x36a633d8, 0xa336d811,
    // Pattern 30
    0x33111b3c, 0x3311153c, 0x33111264, 0x6c1119a4,
    0x411111b6, 0x81111153, 0x1111119a, 0x1111119a,
    // Pattern 31
    0x123e1123, 0x1b6c1196, 0x9bd8119b, 0x9341111b,
    0xb3e11112, 0x6d811119, 0x34111111, 0x3e111111,
    // Pattern 32
    0xe19a4111, 0x4123e111, 0xd853c111, 0x37bd8111,
    0x37641111, 0xa33e1111, 0xb3dc1111, 0x53d11111,
    // Pattern 33
    0x23333333, 0x23411111, 0x23411111, 0x23411111,
    0x23411111, 0x23411111, 0x23333333, 0x23333333,
    // Pattern 34
    0x33631123, 0x11111123, 0x11111123, 0x11111123,
    0x11111123, 0x11111123, 0x33331123, 0x36331123,
    // Pattern 35
    0x33333333, 0x33333337, 0x3111153d, 0x411111b3,
    0x4111119a, 0x41111119, 0x41111111, 0x41111111,
    // Pattern 36
    0x6e111233, 0x11111234, 0x81111234, 0xd8111234,
    0x34111234, 0x63e11234, 0x53681233, 0x1b341233,
    // Pattern 37
    0x33333336, 0x11111111, 0x11111111, 0x11111111,
    0x11111111, 0x11111111, 0x66666666, 0x33333333,
    // Pattern 38
    0x81153411, 0x11123411, 0x11123411, 0x11153411,
    0x11123411, 0x11123411, 0xd8123333, 0x68123333,
    // Pattern 39
    0x111111a3, 0x111119a3, 0x11111966, 0x11111234,
    0x11111a3e, 0x1119b3d1, 0x33333d81, 0x333d7111,
    // Pattern 40
    0xc1111111, 0xc1111111, 0x81111111, 0x11111111,
    0x11111111, 0x11111111, 0x11111111, 0x11111111,
    // Pattern 41
    0x53333333, 0x53311111, 0x53311111, 0x53311111,
    0x53311111, 0x53311111, 0x53333333, 0x53333333,
    // Pattern 42
    0x33711111, 0x2a3e1111, 0x12338111, 0x19338111,
    0x19338111, 0x9a341111, 0x33d81111, 0xd7811111,
    // Pattern 43
    0x19333411, 0x11233111, 0x11933111, 0x11933111,
    0x11933111, 0x11933111, 0x11963111, 0x1196d111,
    // Pattern 44
    0x00111111, 0x00111111, 0x00111111, 0x00111111,
    0x00ffffff, 0x00ffffff, 0x00ffffff, 0x00ffffff,
    // Pattern 45
    0x11111111, 0x11111111, 0x11111111, 0x11111111,
    0xffffffff, 0xffffffff, 0xffffffff, 0xffffffff,
    // Pattern 46
    0x11000000, 0x11000000, 0x11000000, 0x11000000,
    0xff000000, 0xff000000, 0xff000000, 0xff000000,
    // Pattern 47
    0x00ffffff, 0x00ffffff, 0x00ffffff, 0x00ffffff,
    0x00ffffff, 0x00ffffff, 0x00ffffff, 0x00ffffff,
    // Pattern 48
    0xffffffff, 0xffffffff, 0xffffffff, 0xffffffff,
    0xffffffff, 0xffffffff, 0xffffffff, 0xffffffff,
    // Pattern 49
    0xff000000, 0xff000000, 0xff000000, 0xff000000,
    0xff000000, 0xff000000, 0xff000000, 0xff000000,
    // Pattern 50
    0xffffffff, 0xffffffff, 0xffffffff, 0xffffffff,
    0xffffffff, 0xfffe1bff, 0xfffc1bff, 0xfffc1bff,
    // Pattern 51
    0xffffffff, 0xfffc1ac1, 0xfffe119b, 0xfffc196f,
    0xfffe15ff, 0xfffc1bff, 0xfffe1bff, 0xfffc1bff,
    // Pattern 52
    0xffffffff, 0x112affff, 0x78196ffd, 0xffc1bffc,
    0xffe1bffd, 0xffe15fff, 0xffe1bffd, 0xffe15f68,
    // Pattern 53
    0xffffffff, 0xd711112a, 0x11998819, 0x1bffffc1,
    0xa6ffffe1, 0xffd77811, 0xc1111981, 0x19a6ffe1,
    // Pattern 54
    0xfffc1bff, 0xfffe1bff, 0x6ffc1bf6, 0xbffe1bdc,
    0x5ffc1bc1, 0xbffe1111, 0x5ffc1111, 0xbffc15fc,
    // Pattern 55
    0xffffffff, 0x6c126fff, 0xc126ff6c, 0x12fff6e1,
    0x5ffffd81, 0xbffffd19, 0x9afff411, 0x15fff419,
    // Pattern 56
    0xffffffff, 0x78119bff, 0x1997115f, 0x26fffc1b,
    0xafff6412, 0x27777719, 0x11111119, 0x6fffffff,
    // Pattern 57
    0xffffffff, 0xffc1ff11, 0xffc1197a, 0xffe19af6,
    0xffe15fff, 0xafc1bfff, 0xafc1bfff, 0xffe1bfff,
    // Pattern 58
    0xffffffff, 0x12afffff, 0x8126ffff, 0x6c1bffff,
    0xfe1bffff, 0xfe15ffff, 0xfe15ffff, 0xfe15ffff,
    // Pattern 59
    0xffffffff, 0xfffd7111, 0xffd11978, 0xffc15fff,
    0xffdbffff, 0xfffffda7, 0xffdc1111, 0xfdc19a6f,
    // Pattern 60
    0xffffffff, 0x12afff67, 0x1196ffe1, 0x681bfd89,
    0xfe1bfd81, 0x811bffe1, 0x1815fff7, 0xfe1bffff,
    // Pattern 61
    0xffffffff, 0x81112aff, 0x9871196f, 0xafffc1bf,
    0xafffffff, 0x199affff, 0x811112ff, 0xf6d7115f,
    // Pattern 62
    0xffffffff, 0xfe1f7111, 0xfc111a71, 0xfe19aff4,
    0xfc15fffd, 0xfe1bfffd, 0xfc1bfffd, 0xfe1bfffd,
    // Pattern 63
    0xffffffff, 0x5fdf119a, 0x11127819, 0x11bfffc1,
    0x19afffe1, 0x896fffe1, 0x196fffe1, 0x126fffe1,
    // Pattern 64
    0xffffffff, 0xffffffff, 0xafffffff, 0xbfffffff,
    0xbfffffff, 0x5fffffff, 0x5fffffff, 0xbfffffff,
    // Pattern 65
    0xfffc1bff, 0xfffe1bff, 0xfffc1bff, 0xfffe1bff,
    0xffffffff, 0xffffffff, 0xffffffff, 0xffffffff,
    // Pattern 66
    0xffe1bf41, 0xffe15f41, 0xffe15f6c, 0xffe1bffd,
    0xffffffff, 0xffffffff, 0xffffffff, 0xffffffff,
    // Pattern 67
    0x96fff6c1, 0x9afff411, 0x19728111, 0xc1112a41,
    0xffffffff, 0xffffffff, 0xffffffff, 0xffffffff,
    // Pattern 68
    0xbffe1bfd, 0x5ffc1bff, 0x5ffe1bff, 0x2ffc1bff,
    0xffffffff, 0xffffffff, 0xffffffff, 0xffffffff,
    // Pattern 69
    0x11bffd81, 0x419affc1, 0xdc15ffdc, 0xfd11bfff,
    0xffffffff, 0xffffffff, 0xffffffff, 0xffffffff,
    // Pattern 70
    0xaffffd7b, 0x26ff6c15, 0x1997819a, 0x781115ff,
    0xffffffff, 0xffffffff, 0xffffffff, 0xffffffff,
    // Pattern 71
    0xffc1bfff, 0x6fe1bfff, 0xffc1bfff, 0xffe1bfff,
    0xffffffff, 0xffffffff, 0xffffffff, 0xffffffff,
    // Pattern 72
    0xfe15ffff, 0xfe1bffff, 0xfe1bffff, 0xfe15ffff,
    0xffffffff, 0xffffffff, 0xffffdaa7, 0xffff4111,
    // Pattern 73
    0xffffffff, 0xffffffff, 0xffffffff, 0xffffffff,
    0xffffffff, 0xffffffff, 0xaa7a7aaa, 0x11111111,
    // Pattern 74
    0xf419afff, 0xf419afff, 0xf6819778, 0xff671119,
    0xffffffff, 0xffffffff, 0xa6ffffff, 0x9affffff,
    // Pattern 75
    0x6c1bfd7b, 0x4115fd19, 0x1115ffe1, 0xa412fff7,
    0xffffffff, 0xffffffff, 0xffffffff, 0xffffffff,
    // Pattern 76
    0xffff419f, 0xafff412f, 0x127819bf, 0x81119aff,
    0xffffffff, 0xffffffff, 0xffffffff, 0xffffffff,
    // Pattern 77
    0xfe1bfffd, 0xfc1bfffd, 0xfe1bfffd, 0xfc1bfffd,
    0xffffffff, 0xffffffff, 0xffffffff, 0xffffffff,
    // Pattern 78
    0x896fffe1, 0x19afffe1, 0x896fffe1, 0x196fffe1,
    0xffffffff, 0xffffffff, 0xffffffff, 0xffffffff,
    // Pattern 79
    0xbfffffff, 0x5fffffff, 0x5fffffff, 0xbfffffff,
    0xffffffff, 0xffffffff, 0xffffffff, 0xffffffff,

  };

  public static short[] image =
  {
    0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000,
    0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000,
    0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000,
    0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000,
    0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000,
    0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000,
    0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000,
    0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000,
    0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000,
    0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000,
    0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000,
    0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000,
    0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000,
    0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000,
    0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000,
    0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000,
    0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000,
    0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000,
    0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000,
    0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000,
    0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000,
    0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000,
    0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000,
    0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000,
    0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000,
    0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000,
    0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000,
    0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000,
    0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000,
    0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000,
    0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000,
    0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000,
    0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000,
    0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000,
    0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000,
    0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000,
    0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000,
    0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000,
    0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000,
    0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000,
    0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000,
    0x0000, 0x0000, 0x0001, 0x0002, 0x0002, 0x0002, 0x0002, 0x0002,
    0x0002, 0x0002, 0x0002, 0x0002, 0x0002, 0x0002, 0x0002, 0x0002,
    0x0002, 0x0002, 0x0002, 0x0002, 0x0002, 0x0002, 0x0003, 0x0000,
    0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000,
    0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000,
    0x0000, 0x0000, 0x0004, 0x0005, 0x0005, 0x0005, 0x0005, 0x0005,
    0x0005, 0x0005, 0x0005, 0x0005, 0x0005, 0x0005, 0x0005, 0x0005,
    0x0005, 0x0005, 0x0005, 0x0005, 0x0005, 0x0005, 0x0006, 0x0000,
    0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000,
    0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000,
    0x0000, 0x0000, 0x0004, 0x0005, 0x0005, 0x0005, 0x0005, 0x0005,
    0x0005, 0x0005, 0x0005, 0x0005, 0x0005, 0x0005, 0x0005, 0x0005,
    0x0005, 0x0005, 0x0005, 0x0005, 0x0005, 0x0005, 0x0006, 0x0000,
    0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000,
    0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000,
    0x0000, 0x0000, 0x0004, 0x0007, 0x0008, 0x0009, 0x000a, 0x000b,
    0x000c, 0x000d, 0x000e, 0x000f, 0x0010, 0x0011, 0x0012, 0x0013,
    0x0014, 0x0015, 0x0016, 0x0017, 0x0018, 0x0019, 0x0006, 0x0000,
    0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000,
    0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000,
    0x0000, 0x0000, 0x0004, 0x001a, 0x001b, 0x001c, 0x001d, 0x001e,
    0x001f, 0x0020, 0x0021, 0x0022, 0x0023, 0x0024, 0x0025, 0x0026,
    0x0027, 0x0028, 0x0029, 0x002a, 0x002b, 0x0005, 0x0006, 0x0000,
    0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000,
    0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000,
    0x0000, 0x0000, 0x0004, 0x0005, 0x0005, 0x0005, 0x0005, 0x0005,
    0x0005, 0x0005, 0x0005, 0x0005, 0x0005, 0x0005, 0x0005, 0x0005,
    0x0005, 0x0005, 0x0005, 0x0005, 0x0005, 0x0005, 0x0006, 0x0000,
    0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000,
    0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000,
    0x0000, 0x0000, 0x002c, 0x002d, 0x002d, 0x002d, 0x002d, 0x002d,
    0x002d, 0x002d, 0x002d, 0x002d, 0x002d, 0x002d, 0x002d, 0x002d,
    0x002d, 0x002d, 0x002d, 0x002d, 0x002d, 0x002d, 0x002e, 0x0000,
    0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000,
    0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000,
    0x0000, 0x0000, 0x002f, 0x0030, 0x0030, 0x0030, 0x0030, 0x0030,
    0x0030, 0x0030, 0x0030, 0x0030, 0x0030, 0x0030, 0x0030, 0x0030,
    0x0030, 0x0030, 0x0030, 0x0030, 0x0030, 0x0030, 0x0031, 0x0000,
    0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000,
    0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000,
    0x0000, 0x0000, 0x002f, 0x0030, 0x0030, 0x0030, 0x0030, 0x0030,
    0x0032, 0x0030, 0x0030, 0x0030, 0x0030, 0x0030, 0x0030, 0x0030,
    0x0030, 0x0030, 0x0030, 0x0030, 0x0030, 0x0030, 0x0031, 0x0000,
    0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000,
    0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000,
    0x0000, 0x0000, 0x002f, 0x0030, 0x0030, 0x0033, 0x0034, 0x0035,
    0x0036, 0x0037, 0x0038, 0x0039, 0x003a, 0x0030, 0x003b, 0x003c,
    0x003d, 0x003e, 0x003f, 0x0040, 0x0030, 0x0030, 0x0031, 0x0000,
    0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000,
    0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000,
    0x0000, 0x0000, 0x002f, 0x0030, 0x0030, 0x0041, 0x0042, 0x0043,
    0x0044, 0x0045, 0x0046, 0x0047, 0x0048, 0x0049, 0x004a, 0x004b,
    0x004c, 0x004d, 0x004e, 0x004f, 0x0030, 0x0030, 0x0031, 0x0000,
    0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000,
    0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000,
    0x0000, 0x0000, 0x002f, 0x0030, 0x0030, 0x0030, 0x0030, 0x0030,
    0x0030, 0x0030, 0x0030, 0x0030, 0x0030, 0x0030, 0x0030, 0x0030,
    0x0030, 0x0030, 0x0030, 0x0030, 0x0030, 0x0030, 0x0031, 0x0000,
    0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000,
    0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000,
    0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000,
    0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000,
    0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000,
    0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000,
    0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000,
    0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000,
    0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000,
    0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000,
    0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000,
    0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000,
    0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000,
    0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000,
    0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000,
    0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000,
    0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000,
    0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000,
    0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000,
    0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000,
    0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000,
    0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000,
    0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000,
    0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000,
    0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000,
    0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000,
    0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000,
    0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000,
    0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000,
    0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000,
    0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000,
    0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000,
    0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000,
    0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000,
    0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000,
    0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000,
    0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000,
    0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000,
    0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000,
    0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000,
    0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000, 0x0000,
  };

  public static short[] palette =
  {
    0x000, 0xe80, 0x4a0, 0x0ce, 0xace, 0x2a2, 0x2cc, 0xaaa,
    0xea4, 0xa80, 0x0ca, 0x0c4, 0xeaa, 0x4ce, 0xcac, 0x0ee,
  };
}

