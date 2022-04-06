import java.io.*;
import java.util.*;

class Exc5
{
    public static void main(String args[])
    {
        try
        {
            System.out.println("Hii");
            int c=2/0;
        }
        /*catch(ArithmeticException e)
        {
            System.out.println("Arihmetic Exception is"+e);
        }*/
        catch(NullPointerException e)
        {
            System.out.println("NullPointerException is"+e);
        }
        finally
        {
            try{
            String s=null;
            int len=s.length();
            }
            catch(NullPointerException e)
            {
                System.out.println("NullPointerException is"+e);
            }

        }
    }
}