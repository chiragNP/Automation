package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class sauceddemopage {

	WebDriver wd;
	public sauceddemopage (WebDriver wd)
	{this.wd=wd;		
		
	}	
	By unmae = By.id("user-name");
	By pword = By .id("password");
	By login = By .id("login-button");
	By addcard = By.id("add-to-cart-sauce-labs-backpack");
	By shopping = By.className("shopping_cart_badge");
	By checkout = By.id("checkout");
	By Name = By.id("first-name");
	
	public void url ()
	{
		wd.get("https://www.saucedemo.com/");
	}
	public void userName()
	 {
		 wd.findElement(unmae).sendKeys("standard_user");
	 }
	
	public void pasword()
	 {
		 wd.findElement(pword).sendKeys("secret_sauce");
	 }
	
	public void clicklogin()
	 {
		 wd.findElement(login).click();
	 }
	public void addtocart() throws Exception
	{
		wd.findElement(addcard).click();
		Thread.sleep(2000);
	}
	
	public void shoppingcart()
	{
		wd.findElement(shopping).click();
	}
	
	public void CheckOut ()
	{
		wd.findElement(checkout).click();
	}
	public void FirstName()
	{
		wd.findElement(Name).sendKeys("xyz");
	}
		
	

	

}
