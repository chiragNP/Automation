package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DemologinPage {


	
 WebDriver wd;
 public DemologinPage(WebDriver wd) {
	this.wd=wd;
	 
 }
	 // repository of element
	 By Unmae = By .id("user-name");
	 By pword = By .id("password");
	 By login = By .id("login-button");
	 By aadcard = By.className("btn_primary btn_inventory");
	 
	// repository of method
	 public void url()
	 {
		 wd.get("https://www.saucedemo.com/");		
	 }
	 public void userName()
	 {
		 wd.findElement(Unmae).sendKeys("standard_user");
	 }
	
	 public void pasword()
	 {
		 wd.findElement(pword).sendKeys("secret_sauce");
	 }
	
	 public void clicklogin()
	 {
		 wd.findElement(login).click();
	 }
	 public void addtocard()
	 {
		 wd.findElement(aadcard).click();
	 }
	
	
}

		

	


