package day4;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class demoHDF01 {

	public static void main(String[] args) throws Exception {
		
System.setProperty("webdriver.gecko.driver","/home/student/Desktop/chirag.Se/geckodriver");
		
		WebDriver wd =new FirefoxDriver();// interface
		wd.get("https://www.saucedemo.com/v1/");
		FileInputStream fis= new FileInputStream ("/home/student/Desktop/chirag.java.01/Excel.xlsx");
		XSSFWorkbook wk= new XSSFWorkbook (fis);
		XSSFSheet sh = wk.getSheet("chirag");
		
		for(int i= 0;i<=sh.getLastRowNum();i++)
			
		{
			XSSFRow rw = sh.getRow(i);
			XSSFCell un = rw.getCell(0);
			XSSFCell pw = rw.getCell(1);
		//	for in
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
	}

	}
}
