package day3;

import java.util.Scanner;

public class demoArrya {

	public static void main(String[] args) {
		Scanner add=new Scanner(System.in);
		System.out.println("enter size of array");
		int s=add.nextInt();
		System.out.println("enter value");
		int arr []=new int [s];
		for (int i=0;i<s;i++)
		{
			arr[i]=add.nextInt();
		}
		for (int i=0;i<s;i++)
		{
			System.out.println(arr[i]);
		}
	}

}
