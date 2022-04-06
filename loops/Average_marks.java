package com.firstproject;
import java.util.Scanner;
public class Average_marks {

	public static void main(String[] args) {
    Scanner average=new Scanner(System.in);
    String name= average.next();
    char c= name.charAt(0);
    int m1=average.nextInt();
    int m2=average.nextInt();
    int m3=average.nextInt();
    int average_marks=(m1+m2+m3)/3;
    System.out.println(c);

    System.out.print(average_marks);

	}

}
