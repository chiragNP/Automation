package day6;

abstract class Sports
{
 abstract void cricket();
 public void Kabaddi()
 {
	 System.out.println("Kabddi");
 }
 
}
class Game extends Sports{

	@Override
	void cricket() {
		System.out.println("cricket");
		
	}
	
}


public class demoAbstraction {

	public static void main(String[] args) {
		Game g= new Game();
		g.cricket();
		g.Kabaddi();
		
		Sports s= new Game();
		s.cricket();
		s.Kabaddi();
	}

}
