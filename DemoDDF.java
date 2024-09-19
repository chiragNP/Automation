package day3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoDDF {

	public static void main(String[] args) throws Exception {
System.setProperty("webdriver.gecko.driver","/home/student/Desktop/chirag.Se/geckodriver");
		
		WebDriver wd =new FirefoxDriver();// interface
		wd.get("https://www.saucedemo.com/v1/");
        //.xlsx==>XSSF
		FileInputStream fis= new FileInputStream ("/home/student/Desktop/chirag.java.01/Excel.xlsx");
		XSSFWorkbook wk= new XSSFWorkbook (fis);
		XSSFSheet sh = wk.getSheet("chirag");
		
		for(int i= 0;i<=sh.getLastRowNum();i++)
				
				{
					XSSFRow rw = sh.getRow(i);
					XSSFCell un = rw.getCell(0);
					XSSFCell pw = rw.getCell(1);
					
					System.out.println("username"+ un+"pasword"+pw);
					 
					
			
				
		
			try {
				
				
				wd.get("https://www.saucedemo.com/v1/");
				wd.findElement(By.id("user-name")).sendKeys("standard_user");
				wd.findElement(By.id("password")).sendKeys("secret_sauce");
				wd.findElement(By.id("login-button")).click();
				//wd.findElement(By)
				Thread.sleep(2000);
				
				System.out.println("valid");
				
				
				
				
				
			}
			catch (Exception e){
				
				System.out.println("Invalid");
				
				
				
			}
				}
			
			
			
			
			
		
		
		
		
		
		
		
		
	}

}
