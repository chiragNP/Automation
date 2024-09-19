package day6;

interface Developer 
{
	
 void input ();
 void output ();
 
 }
interface Tester
{
	
	 void input ();
	 void output ();
	 
	 }
class Team implements Developer,Tester
{

	@Override
	public void input() {
		System.out.println("tester intput ");
		
	}

	@Override
	public void output() {
		System.out.println("tester output ");
		
	}
	


}





public class demoMultiple {

	public static void main(String[] args) {
		Tester t = new Team();
		t.output();
		
		Developer d= new Team();
		d.input();

	}

}
