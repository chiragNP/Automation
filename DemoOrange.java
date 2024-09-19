package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DemoOrange {
	WebDriver wd;
	 public DemoOrange(WebDriver wd) {
		this.wd=wd;
		 
	}
	 
	 By Unmae2 = By.xpath("//input[@name='username']");
//	 By pword2 = By.name("password");
//	 By login2 = By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button");
//	 
//	 
	// repository of method
		 public void url2()
		 {
			 
			 wd.get("https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index");
			
		 }
		 public void userName()
		 {
			 wd.findElement(Unmae2).sendKeys("Admin");
		 }
		
//		 public void pasword2()
//		 {
//			 wd.findElement(pword2).sendKeys("admin123");
//		 }
//		
//		 public void clicklogin2()
//		 {
//			 wd.findElement(login2).click();
//		 }
		

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
