import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FacebookClass {

	public static void main(String[] args) throws IOException {
		Properties myProp = new Properties();

		FileInputStream src = new FileInputStream(
				"/Users/angeljimenez/eclipse-workspace/Class12/src/configFile/myFile.properties");

		myProp.load(src);
		if (myProp.getProperty("browser").equalsIgnoreCase("Firefox")) {
			System.setProperty("webdriver.gecko.driver", "/Users/angeljimenez/Downloads/geckodriver2");
			WebDriver driver = new FirefoxDriver();

			driver.get(myProp.getProperty("url"));
			driver.findElement(By.id("email")).sendKeys(myProp.getProperty("username"));
			driver.findElement(By.id("pass")).sendKeys(myProp.getProperty("password"));
			driver.findElement(By.id("u_0_2")).click();
		} else {
			System.setProperty("webdriver.chrome.driver", "/Users/angeljimenez/Downloads/chromedriver");
			WebDriver driver = new ChromeDriver();
			
			driver.get(myProp.getProperty("url"));
			driver.findElement(By.id("email")).sendKeys(myProp.getProperty("username"));
			driver.findElement(By.id("pass")).sendKeys(myProp.getProperty("password"));
			driver.findElement(By.id("u_0_2")).click();
		}
	}

}
