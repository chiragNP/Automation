package day5;
class Addition 
{
public void sum(int a ) 
{
int b= 20,sum;
sum=a+b;
System.out.println("sum==>"+sum);
}	
	

public void sum(int a,float b ) 
{
double sum;
sum=a+b;
System.out.println("sum==>"+sum);
}	



}
public class demoPolymorphis {

	public static void main(String[] args) {
	
		
		
		Addition al=new Addition();
		al.sum(50);
		al.sum(60, 80);

	}

}
