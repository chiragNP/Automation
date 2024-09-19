package day4;

class collages
{
  public void collage()
  {
	  System.out.println("collages2");
  }
}
class streams extends  collages 
{
   public void stream2 ()
   
   {
	   System.out.println("BMS");
   }
 }
class  boys extends  collages
{
   public void boy2()
   
   {
	   System.out.println("Boys02");
   }
 }






public class demoHybird {

	public static void main(String[] args) {
		
	
		
		boys c=new boys();
		c.collage();
		c.boy2();
		

		streams s= new streams();
		s.collage();
		s.stream2();
	
		
		
		
		
		
		
	}

}
