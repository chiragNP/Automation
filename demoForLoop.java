package day2;

import java.util.Scanner;

public class demoForLoop {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int a=sc.nextInt();
		for (int i = 1;i<=20;i++)
		{
			System.out.println(i*a);
		}

	}

}
