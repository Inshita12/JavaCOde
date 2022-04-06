import java.io.*;
import java.util.*;
class Exc4
{
    public static void main(String args[])
    {
        try
        {
            System.out.println("Hii");
            System.out.println("Hello");
            try
            {
                int c=1/0;
            }
            catch(NullPointerException e)
            {
                System.out.println(e);
            }
        }
        catch(ArithmeticException e)
        {
            System.out.println("Arithmetic Exception is"+e);
        }
    }
}