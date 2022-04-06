

class Exc {
   public static void main(String args[])
    {
        int a=5;
        int b=0;
        try
        {
            int c=a/b;
        }
        catch(NullPointerException e)
        {
            System.out.println("Null Pointer Exception is"+e);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Arithmetic Exception is"+e);
        }
        catch(Exception e)
        {
            System.out.println("Exception is"+e);
        }
    }
}