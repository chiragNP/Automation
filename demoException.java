package day6;

public class demoException {

	public static void main(String[] args) throws Exception {
		int a=58,b=0,c;
		try 
		{
		c=a/b;
		System.out.println(c);
		 }
		
		
		
		catch (Exception e)
		{
			System.out.println("number not divisible by 0");
			Thread.sleep(2000);
		} System.out.println("Invaid input ");
	}

}
