package org.javajenkin;

import java.util.Scanner;

public class LargestOfThreeNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* to find largest of three numbers:
		 * take 3 variables check each variable with other two variables 
		 * use logical operators */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value of a: ");
		int a = sc.nextInt();
		
		System.out.println("enter the value of b: ");
		int b = sc.nextInt();
		
		System.out.println("enter the value of c: ");
		int c = sc.nextInt();
		
		if ((a>b) && (a>c))
		{
			System.out.println("a is the largest number");
		}
		
		else if ((b>a) && (b>c)) 
		{
			System.out.println("b is the largest number");
		}
		
		else
		{
			System.out.println("c is the largest number");
		}
		
		sc.close();

	}

}
