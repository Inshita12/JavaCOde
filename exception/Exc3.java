import java.io.*;
import java.util.*;

class Exc3
{
    public static void main(String args[])
    {
        try
        {
            System.out.println("Hii");
            System.out.println("Hello");
            int c=3/0;
            System.out.println("Hello");
        }
        catch(ArithmeticException e)
        {
            System.out.println("Arithmetic Exception is"+e);
        }
        finally
        {
            System.out.println("Finally executed");
        }
    }
}