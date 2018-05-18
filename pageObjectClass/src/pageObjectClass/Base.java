package pageObjectClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base {

	
	public static WebDriver driver;

@BeforeMethod
public void setup() {
	System.setProperty("webdriver.gecko.driver", "/Users/angeljimenez/Downloads/geckodriver2");
	driver = new FirefoxDriver();
	driver.get("https://www.freecrm.com/index.html");
}
@AfterMethod
public void quitBrowser() {
	driver.quit();
}
}
