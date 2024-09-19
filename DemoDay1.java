import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoDay1 {

	public static void main(String[] args) throws Exception {
System.setProperty("webdriver.gecko.driver","/home/student/Desktop/chirag.Se/geckodriver");
		
		WebDriver wd =new FirefoxDriver();// interface
		wd.get("https://www.saucedemo.com/v1/");
		wd.findElement(By.id("user-name")).sendKeys("standard_user");
		wd.findElement(By.id("password")).sendKeys("secret_sauce");
		wd.findElement(By.id("login-button")).click();
		Thread.sleep(2000);
		
	}

}
