import net.mikekohn.java_grinder.CPC;

public class SpriteCPC
{
  static int Sprite[] =
  {
    0x00, 0xC0, 0xC0, 0x00, 0x00, 0xC0, 0xC0, 0xC0,
    0xC0, 0x00, 0x00, 0x00, 0x00, 0xC4, 0xC8, 0x00,
    0xC0, 0x84, 0x0C, 0x0C, 0x48, 0xC0, 0x00, 0x00
    ,0x00, 0xC4, 0xC8, 0xC0, 0x0C, 0x0C, 0x0C, 0x0C
    ,0x0C, 0x48, 0x00, 0x00, 0x00, 0xC0, 0xC0, 0xC0
    ,0x0C, 0x0C, 0x0C, 0x0C, 0x0C, 0x0C, 0xC0, 0x00
    ,0x00, 0x00, 0x00, 0x84, 0x0C, 0x0C, 0x0C, 0x0C
    ,0xCC, 0xCC, 0xC8, 0x00, 0x00, 0x00, 0x00, 0x84
    ,0x0C, 0x0C, 0x0C, 0x4C, 0x30, 0x90, 0x60, 0x00
    ,0x00, 0x00, 0x00, 0x84, 0x0C, 0x0C, 0x0C, 0x4C
    ,0x30, 0x90, 0x60, 0x00, 0x00, 0x00, 0x00, 0x84
    ,0x0C, 0x0C, 0x0C, 0x4C, 0x30, 0x90, 0x60, 0x00
    ,0x00, 0x00, 0x00, 0x84, 0x0C, 0x0C, 0x0C, 0x0C
    ,0xCC, 0xCC, 0xC8, 0x00, 0x00, 0x00, 0x00, 0xC0
    ,0x0C, 0x0C, 0xC0, 0xC0, 0x0C, 0xFC, 0xC0, 0x00
    ,0x00, 0x00, 0x00, 0x00, 0xC0, 0xC0, 0xAC, 0x48
    ,0xC0, 0xC0, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00
    ,0xC1, 0x42, 0x0C, 0x0C, 0x94, 0x68, 0xC0, 0x00
    ,0x00, 0x00, 0x00, 0x00, 0xC1, 0x42, 0x0C, 0x0C
    ,0x94, 0x3C, 0xC0, 0x00, 0x00, 0x00, 0x00, 0x00
    ,0xC0, 0xC0, 0xC0, 0xC0, 0xC4, 0x60, 0xC0, 0x00
    ,0x00, 0x00, 0x00, 0x00, 0xC1, 0x42, 0xF0, 0xF0
    ,0x94, 0x3C, 0xC0, 0x00, 0x00, 0x00, 0x00, 0x00
    ,0xC0, 0xC0, 0xC0, 0xC0, 0x81, 0x42, 0x00, 0x00
    ,0x00, 0x00, 0x00, 0x00, 0xC0, 0xD4, 0x0C, 0x0C
    ,0xE8, 0xC0, 0x00, 0x00, 0x00, 0x00, 0x00, 0xC0
    ,0xC0, 0xD4, 0x0C, 0x0C, 0x48, 0xC0, 0x00, 0x00
    ,0x00, 0x00, 0x00, 0xC0, 0xC0, 0xC0, 0xC0, 0xC0
    ,0xC0, 0xC0, 0xC0, 0x00, 0x00, 0x00, 0xC0, 0xC0
    ,0xC0, 0xD0, 0xF0, 0xF0, 0xF0, 0xC0, 0xC0, 0x00
    ,0x00, 0x00, 0xC0, 0xC0, 0xC0, 0xC0, 0xC0, 0xC0
    ,0xC0, 0xC0, 0xC0, 0x00, 0x00, 0x00, 0x00, 0xC0
    ,0xC0, 0xC0, 0xC0, 0xC0, 0xC0, 0xC0, 0xC0, 0x00
    ,0x00, 0x00, 0x00, 0x00, 0xC0, 0xC0, 0xC0, 0xC0
    ,0xC0, 0xC0, 0x00, 0x00
    };  

  static int SPRITE_HEIGHT = 23;
  static int SPRITE_WIDTH = 12;
  static int MAX_X = 79;
  
  public static void main(String args[])
  {
     char nX = 20;
     char nY = 100;
     int nXDir = 1;
     int puffer = 0x6000;
     
     for (int i=0; i< (SPRITE_HEIGHT*SPRITE_WIDTH); i++)
     {
       CPC.poke8(puffer, (char) (Sprite[i] & 0x00FF));
       puffer++;
     }
     
     while(true)
     {
       nX += nXDir;
       if(nX <= 0)
       {
         nX = 0;
         nXDir = 1;
       }
       if(nX >= (char) (MAX_X - SPRITE_WIDTH))
       {
         nX = (char) (MAX_X - SPRITE_WIDTH);
         nXDir = -1;
      }
      CPC.putSpriteMode0(CPC.getVMEM(0xC000, nX, nY), SPRITE_WIDTH, SPRITE_HEIGHT, puffer);
  }
  }
}
