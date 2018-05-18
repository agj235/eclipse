package newPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class UsingDataProviders {
	WebDriver driver;

		
	
	@Test(dataProvider="Credentials")
	
	public void OHRM(String UID, String PID) throws InterruptedException{
		System.setProperty("webdriver.gecko.driver", "/Users/angeljimenez/Downloads/geckodriver2");
		
		 driver = new FirefoxDriver();
		driver.get("http://opensource.demo.orangehrmlive.com/");
		
		driver.findElement(By.id("txtUsername")).sendKeys(UID);

		driver.findElement(By.id("txtPassword")).sendKeys(PID);
		
		driver.findElement(By.name("Submit")).click();
		Thread.sleep(5000);
		driver.quit();
	}

	@DataProvider(name= "Credentials")
	public Object[][] testData(){
		
		Object[][] data= new Object[3][2];
		
	// 1 set
		data[0][0]= "Admin";
		data[0][1]= "admin";
	//2set
		data[1][0]= "User";
		data[1][1]="user";
	//3 set
		data[2][0]="Test";
		data[2][1]="test";
		
		return data;
		
	}
}


