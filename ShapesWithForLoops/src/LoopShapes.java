public class LoopShapes {

    public void printBlock1(int anz)
    {
        for(int z=0; z < anz; z++)
        {
            for(int s=0; s < anz; s++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void printBlock2(int hohe)
    {
        for(int z=0; z<hohe; z++)
        {
            for(int s=0; s<(hohe*2); s++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void printBlock3(int hohe, int breite)
    {
        for(int z=0; z<hohe; z++)
        {
            for(int s=0; s<breite; s++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void printRahmen(int anz)
    {
        for(int z=0; z < anz; z++)
        {
            for(int s=0; s < anz; s++)
            {
                if((z==0)||(z==anz-1)||(s==0)||(s==anz-1))
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public void printRahmen(int hohe, int breite)
    {
        for(int z=0; z<hohe; z++)
        {
            for(int s=0; s<breite; s++)
            {
                if((z==0) || (s==0) || (z==hohe-1) || (s==breite-1))
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public void printRahmenX(int anz)
    {
        for(int z=0; z < anz; z++)
        {
            for(int s=0; s < anz; s++)
            {
                if((z==0)||(z==anz-1)||(s==0)||(s==anz-1)||(z==s)||(z+s==anz-1))
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public void printRahmenX2(int hohe)
    {
        for(int z=0; z<hohe; z++)
        {
            for(int s=0; s<hohe; s++)
                if((z==0)||(z==hohe-1)||(s==0)||(s==hohe-1))
                {
                    System.out.print("*");
                }
                else
                {
                    if((z==s) || (z+s==hohe-1))
                    {
                        System.out.print("+");
                    }
                    else
                    {
                        System.out.print(" ");
                    }
                }
            System.out.println();
        }
    }

    public void printRahmenSlash(int hohe)
    {
        for(int z=0; z<hohe; z++)
        {
            for(int s=0; s<hohe; s++)
            {
                if((z==0)||(z==hohe-1)||(s==0)||(s==hohe-1))
                {
                    System.out.print("*");
                }
                else
                {
                    if(z+s==hohe-1)
                    {
                        System.out.print("+");
                    }
                    else
                    {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }

    public void printRahmenPLUE2(int hohe)
    {
        for(int z=0; z<hohe; z++)
        {
            for(int s=0; s <hohe; s++)
            {
                if((z==0)||(z==hohe-1)||(s==0)||(s==hohe-1))
                {
                    System.out.print("*");
                }
                else
                {
                    if(z+s==hohe-1)
                    {
                        System.out.print("+");
                    }
                    else
                    {
                        if((z+s>hohe-1)&&(z%2==0))
                        {
                            System.out.print("o");
                        }
                        else
                        {
                            System.out.print(" ");
                        }
                    }
                }
            }
            System.out.println();
        }
    }

    public void printFilledX(int anz)
    {
        for(int z=0; z<anz; z++)
        {
            for(int s=0; s<anz; s++)
            {
                if((z==0)||(z==anz-1)||(z+s==anz-1)||(z==s))
                {
                    System.out.print("*");
                }
                else
                {
                    if((z>s)&&(z+s>anz-1)||(z<s)&&(z+s<anz-1))
                    {
                        System.out.print("x");
                    }
                    else
                    {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }

    public void printBaum(int hohe)
    {
        for(int z=0; z < hohe; z++)
        {
            for(int s=0; s < (hohe*2-1); s++)
            {
                if((z+s==hohe-1) || (z+hohe-1==s) || (z==hohe-1))
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public void printBaumKugeln(int hohe)
    {
        for(int z=0; z < hohe; z++)
        {
            for(int s=0; s < (hohe*2-1); s++)
            {
                if((z+s==hohe-1)||(z+hohe-1==s)||(z==hohe-1))
                {
                    System.out.print("*");
                }
                else
                {
                    if((z+s > hohe-1)&&(z+hohe-1 > s))
                    {
                        System.out.print("o");
                    }
                    else
                    {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }

    public static void printBaumKerzen(int hohe)
    {
        for(int z=0; z<hohe; z++)
        {
            for(int s=0; s<(hohe*2-1); s++)
            {
                if((z+s==hohe-1)||(z+hohe-1==s)||(z==hohe-1))
                {
                    if((z%2==1)&&(z<hohe-1))
                    {
                        System.out.print("i");
                    }
                    else
                    {
                        System.out.print("*");
                    }
                }
                else
                {
                    if((z+s > hohe-1)&&(z+hohe-1 > s))
                    {
                        System.out.print("o");
                    }
                    else
                    {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }

    public void printDreieck1(int hohe)
    {
        for(int z=0; z<hohe; z++)
        {
            for(int s=0; s<hohe*2-1; s++)
            {
                if((z==0)||(z==s)||(z+s==hohe*2-2))
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public void printDreieck2(int hohe)
    {
        for(int z=0; z < hohe; z++)
        {
            for(int s=0; s<hohe*2-1; s++)
            {
                if((z==0)||(z==s)||(z+s==hohe*2-2))
                {
                    if(s%2==0)
                    {
                        System.out.print("o");
                    }
                    else
                    {
                        System.out.print("*");
                    }
                }
                else
                {
                    if((z>s)||(z+s>hohe*2-2))
                    {
                        System.out.print("+");
                    }
                    else
                    {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }

    public void printDreieck3(int hohe)
    {
        for(int z=0; z<hohe; z++)
        {
            for(int s=0; s<hohe*2-1; s++)
            {
                if((z==0)||(z==s)||(z+s==hohe*2-2))
                {
                    if(s%3==2)
                    {
                        System.out.print("o");
                    }
                    else
                    {
                        System.out.print("*");
                    }
                }
                else
                {
                    if((z>s)||(z+s>hohe*2-2))
                    {
                        System.out.print("+");
                    }
                    else
                    {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }

    public void printDreieck4(int hohe)
    {
        for(int z=0; z < hohe; z++)
        {
            for(int s=0; s < (hohe*2); s++)
            {
                if((z==0)||(s==0)||(z==hohe-1)||(s==2*hohe-1))
                {
                    if(((z+s)%2)==1)
                    {
                        System.out.print("+");
                    }
                    else
                    {
                        System.out.print("*");
                    }
                }
                else
                {
                    if((z==s)||(z+s==hohe*2-1))
                    {
                        System.out.print("o");
                    }
                    else
                    {
                        if((z<s)&&(z+s<hohe*2-1))
                        {
                            System.out.print("x");
                        }
                        else
                        {
                            System.out.print(" ");
                        }
                    }
                }
            }
            System.out.println();
        }
    }

    public void printFrameV1(int hohe)
    {
        for(int z=0; z<hohe; z++)
        {
            for(int s=0; s<(hohe*2-1); s++)
            {
                if((z==0)||(z==s)||(z+s==hohe*2-2))
                {
                    System.out.print("*");
                }
                else
                {
                    if((z>s)||(z+s>hohe*2-2)) //nur links || nur rechts
                    {
                        System.out.print("X");
                    }
                    else
                    {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }

    public void printFrameV2(int hohe)
    {
        for(int z=0; z<hohe; z++)
        {
            for(int s=0; s<hohe*2-1; s++)
            {
                if((z==0)||(z==s)||(z+s==(hohe*2-2)))
                {
                    if(z%2==1)
                    {
                        System.out.print("o");
                    }
                    else
                    {
                        System.out.print("*");
                    }
                }
                else
                {
                    if((z<s)&&(z+s<(hohe*2-2)))
                    {
                        System.out.print("X");
                    }
                    else
                    {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }

    public void printFrameV3(int hohe)
    {
        for(int z=0; z<hohe; z++)
        {
            for(int s=0; s<(hohe*2-1); s++)
            {
                if((z==0)||(z==s)||(z+s==(hohe*2-2)))
                {
                    if(z%2==1)
                    {
                        System.out.print("0");
                    }
                    else
                    {
                        System.out.print("*");
                    }
                }
                else
                {
                    if((z<s)&&(z+s<hohe*2-1))
                    {
                        System.out.print(" ");
                    }
                    else
                    {
                        System.out.print("x");
                    }
                }
            }
            System.out.println();
        }
    }

    public void printEck1(int anz)
    {
        for(int z = 0; z < anz; z++)
        {
            for(int s=0; s < anz; s++)
            {
                if((z+s==anz-1)||(s==anz-1)||(z==anz-1))
                {
                    System.out.print("*");
                }
                else
                {
                    if(z+s>anz-1)
                    {
                        System.out.print("x");
                    }
                    else
                    {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }

    public void printEck2(int anz)
    {
        for(int z=0; z<anz; z++)
        {
            for(int s =0; s<anz; s++)
            {
                if((z==0)||(s==0)||(z+s==anz-1))
                {
                    System.out.print("*");
                }
                else
                {
                    if(z+s<anz-1)
                    {
                        System.out.print("x");
                    }
                    else
                    {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }


}
