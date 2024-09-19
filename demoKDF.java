package day4;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class demoKDF {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.gecko.driver","/home/student/Desktop/chirag.Se/geckodriver");				
				WebDriver wd =new FirefoxDriver();// interface
				wd.get("https://www.saucedemo.com/v1/"); //.xlsx==>XSSF
				
				FileInputStream fis= new FileInputStream ("/home/student/Desktop/chiragJava/Excel.xlsx");
				XSSFWorkbook wk= new XSSFWorkbook (fis);
				XSSFSheet sh = wk.getSheet("KDF");
				
				for(int i=0;i<=sh.getLastRowNum();i++)
				{
				String Key=sh.getRow(i).getCell(i).toString();
				switch (Key)				
				{
					case "url":
					wd.get("https://www.saucedemo.com/");
					break;
					
					case "username":
					wd.findElement(By.id("user-name")).sendKeys("standard_user");
					break;
					
					case "password":
					wd.findElement(By.id("user-name")).sendKeys("standard_user");
					break;
					
					case "login":
						wd.findElement(By.id("login-button")).click();
						break;
						
					case "clklogout":
						wd.findElement(By.id("react-burger-menu-btn")).click();
						break;	
						
					case "logout":
						wd.findElement(By.id("logout_sidebar_link")).click();
						break;	
						}
				
				System.out.println(Key);
				}
				}	

}
	
	

	
