package day5;

class Printable
{
public void print()
{
System.out.println("Print any thing");	
}
}

class  Showable extends Printable
{
public void print()
{
System.out.println("show any thing");	
}
}



public class demoOverriding {

	public static void main(String[] args) {
		Showable s= new Showable();
		s.print();
	}

}
