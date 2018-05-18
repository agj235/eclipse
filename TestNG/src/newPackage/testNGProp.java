package newPackage;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class testNGProp {
	WebDriver driver;

	
		@Test
		public void propNG(String browserName) throws IOException {
			Properties myProp = new Properties();
			FileInputStream src = new FileInputStream ("/Users/angeljimenez/eclipse-workspace/TestNG/src/NGprop/properties/NGProp");
			myProp.load(src);

				System.setProperty("webdriver.chrome.driver", "/Users/angeljimenez/Downloads/chromedriver");
				driver = new ChromeDriver();
				driver.get(myProp.getProperty("url"));	
				
			
			driver.findElement(By.id("txtUsername")).sendKeys(myProp.getProperty("username"));
			driver.findElement(By.id("txtPassword")).sendKeys(myProp.getProperty("password"));
			driver.findElement(By.id("btnLogin")).click();


			
		}

	

	}


