package com.firstproject;
import java.util.Scanner;

public class sumeven {

	public static void main(String[] args) {
		Scanner sumeven = new Scanner(System.in);
		int i=0;
		int sum=0;
        int n= sumeven.nextInt();
        while(i<=n) {
        	if(i%2==0) {
        		sum=sum+i;
        		
        	}
        	i=i+1;   
        }
        System.out.print(sum);
     
	}

}
