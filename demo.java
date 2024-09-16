package day1;

import java.util.Scanner;

public class demo {

	public static void main(String[] args) {
		Scanner add=new Scanner(System.in);
		System.out.println("enter number");
		int number;
		number=add.nextInt();
		if(number%2==0)
		{
			System.out.println("Even");
		}
		else
		{
			System.out.println("Odd");
		}
		

	}

}
