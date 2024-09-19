package day3;

import java.util.Scanner;

public class demoWhileLoop {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int n,sum=0;
		while((n=sc.nextInt())!=0)
		{
			System.out.println("enter next number");
			sum =n+sum;
			System.out.println("sum="+sum);
			
		}
          System.out.println("out of loop ");
	}

	}


