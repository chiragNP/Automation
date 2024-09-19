package day4;

class upgrdation
{
  public void upgrade()
  {
	  System.out.println("upgradation");
  }
}
class Student extends  upgrdation 
{
   public void student()
   
   {
	   System.out.println("student upgradation");
   }
 }
class emplyee extends Student 
{
  public void employee()	
  {
	  System.out.println("employee upgrade in new tool");
  }
}





public class demoMultilevel {

	public static void main(String[] args) {
		emplyee e1=new emplyee();
		e1.upgrade();
		e1.student();
		e1.employee();

	}

}
