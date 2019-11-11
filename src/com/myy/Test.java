package com.myy;

import java.util.Scanner;

public class Test {
	
	public static void main(String[] args) {
		boolean i=true;
		while(i){
		Scanner sc=new Scanner(System.in);
		int scope=sc.nextInt();
		char grade=scope>=90?'a':scope>=60?'b':'c';
			System.out.println(grade);
		}
    }
}
