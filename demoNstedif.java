package day2;

public class demoNstedif {

	public static void main(String[] args) {
		int age = 50,weigth= 60;
		if (age>18 & age<60)
		{
			if (weigth>40 & weigth<100)
			{
				System.out.println("can donate blood");
			}
			else
			{
				System.out.println("weight is not upto");
			}
		}else  
		{
			System.out.println("can not donate blood");
		}

	}

}
