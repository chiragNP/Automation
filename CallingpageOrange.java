package day2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CallingpageOrange {

	public static void main(String[] args) {
System.setProperty("webdriver.gecko.driver","/home/student/Desktop/chirag.Se/geckodriver");
		
		WebDriver wd =new FirefoxDriver();// interface
		DemoOrange lp = new DemoOrange(wd);
		lp.url2();
		lp.userName();
//		lp.pasword2();
//		lp.clicklogin2();
	}

}
