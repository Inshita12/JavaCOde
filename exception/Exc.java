import java.io.*;
import java.util.*;

class Exc {
    public static void main(String args[]) {
        int a = 10;
        int b = 0;
        int arr[] = new int[10];
        String s1 = null;

        try {
            int c = a / b;
            System.out.println("c=" + " " + c);
        }
        catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception" + e);
        }
        try {
            for (int i = 0; i <= 10; i++) {
                arr[i] = 0;
            }
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBound Exception" + e);
        }
        try {
            System.out.println("Length of string is" + s1.length());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException" + e);
        }
        String s = "J110";
        try {
            int i = Integer.parseInt(s);
        } catch (NumberFormatException e) {
            System.out.println("Number Format Exception is" + e);
        }
        System.out.println("Enter your name");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        System.out.println("Enter your roll no");
      
        

    }
}