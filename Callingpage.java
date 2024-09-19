package day2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Callingpage {

	public static void main(String[] args) {
System.setProperty("webdriver.gecko.driver","/home/student/Desktop/chirag.Se/geckodriver");
		
		WebDriver wd =new FirefoxDriver();// interface
		DemologinPage lp= new DemologinPage(wd);
		lp.url();
	}

}
