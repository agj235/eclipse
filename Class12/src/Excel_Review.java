import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Excel_Review {

	public static void main(String[] args) throws IOException {
		FileInputStream fis= new FileInputStream("/Users/angeljimenez/desktop/TestC.xlsx");
		
		XSSFWorkbook xlWb = new XSSFWorkbook(fis);
		
		XSSFSheet xlSheet=xlWb.getSheet("Sheet1");
		XSSFRow xlRow = xlSheet.getRow(1);
		XSSFCell xlCell = xlRow.getCell(1);
		String password= xlCell.getStringCellValue();
		
		System.out.println(xlCell.getStringCellValue());
		System.out.println(xlCell.getCellTypeEnum());

		System.setProperty("webdriver.chrome.driver", "/Users/angeljimenez/Desktop/selenium-java-3.11.0/Drivers/chromedriver");
		
		WebDriver driver= new ChromeDriver();
		driver.get("http://opensource.demo.orangehrmlive.com/");
		
		driver.findElement(By.id("txtUsername")).sendKeys(xlWb.getSheetAt(0).getRow(1).getCell(0).getStringCellValue());

		driver.findElement(By.id("txtPassword")).sendKeys(password);
		
		driver.findElement(By.id("btnLogin")).click();
		String result;
		
		if(driver.findElement(By.xpath("//ing[@alt='OrangeHRM']")).isDisplayed()){
			result ="Passed";
		}else {
			result="Fail";
		}

}
}