package day6;


abstract class company
{
  abstract void gov();
    public void privates()
{
	System.out.println("privates");
}

}
    
    	class employee extends company{

			@Override
			void gov() {
				System.out.println("gov");
				
			}
    		
    	}
 



public class demoAbstraction2 {

	public static void main(String[] args) {
		employee e= new employee();
		e.gov();
		e.privates();
		

	}

}
