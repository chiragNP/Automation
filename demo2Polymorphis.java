package day5;

class Multiply 
{
public void sum(int a ,int f) 
{
double Mul;
Mul=a*f;
System.out.println("sum="+Mul);
}	
	

public void sum(int a,float b ) 
{
double Mul;
Mul=a*b;
System.out.println("sum==>"+Mul);
}	



}


public class demo2Polymorphis {

	public static void main(String[] args) {
		Multiply a= new Multiply();
	a.sum(7, 3);
	a.sum(5, 8);

                                        }
}
