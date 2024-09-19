package day5;



class company
{
  public void CEO()
  {
	  System.out.println("Ower of the company");
  }
}
class Manger extends  company 
{
   public void ProjectManger ()
   
   {
	   System.out.println("Handing the whole Project");
   }
 }
class  CodeTeam extends  company
{
   public void Tester()
   
   {
	   System.out.println("Testing the software");
   }
 }


public class demoHybrid {

	public static void main(String[] args) {
		
		Manger m = new Manger();
		m.CEO();
		m.ProjectManger();

		CodeTeam ct= new CodeTeam();
		ct.CEO();
		ct.Tester();
		
		
		

	}

}
