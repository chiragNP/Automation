package day3;

import java.util.Scanner;

public class demoDoLoop {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int n,sum=0;
		do 
		{ 
			n=sc.nextInt();
			System.out.println("enter next number");
			sum =n+sum;
			System.out.println("sum="+sum);
		}while(n!=0);	
		
          System.out.println("out of loop ");
	}

	

	}

