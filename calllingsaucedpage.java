package day2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class calllingsaucedpage {

	public static void main(String[] args) throws Exception {
System.setProperty("webdriver.gecko.driver","/home/student/Desktop/chirag.Se/geckodriver");
		
		WebDriver wd =new FirefoxDriver();
		sauceddemopage sp =new sauceddemopage(wd);
		sp.url();
		sp.userName();
		sp.pasword();
		sp.clicklogin();
		sp.addtocart();
		sp.shoppingcart();
		sp.CheckOut();
		sp.FirstName();
		

	}

}
