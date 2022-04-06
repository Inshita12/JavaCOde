package com.firstproject;

import java.util.Scanner;

public class celtofah {
	
	public static void celsiustofarhrenheit(int s,int e ,int w) {
		for(int i=s;i<=e;i=i+w) {
		int celsius=(int)((5.0/9)*(i-32));
		System.out.println(i+" " +celsius);
		}
	}
}

public static void main(String[] args) {
	Scanner s =new Scanner(System.in);
	int s=s.nextInt();
	int e=s.nextInt();
	int w=s.nextInt();
	celsiustofarhrenheit(s,e,w);
}