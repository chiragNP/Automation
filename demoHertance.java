package day4;

class Animal// parent class
{
	public void cat()
	{
		System.out.println("meow");
	}
}
class Lion extends Animal
{
	public void Lion()
	{
		System.out.println("roar");
	}
}


public class demoHertance {

	public static void main(String[] args) {
		Lion l= new Lion();
		l.cat();
		l.Lion();
		

	}

}
