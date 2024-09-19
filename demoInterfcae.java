package day6;
interface printable 
{
void print ();

}

class showable implements printable
{

	@Override
	public void print() {
		System.out.println("print");
		
	}
	
}

public class demoInterfcae {

	public static void main(String[] args) {
		
		printable p = new showable();
		p.print();
		
		
		
	}

}
