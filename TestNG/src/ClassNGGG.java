import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class ClassNGGG {
	public static WebDriver driver;
	@BeforeMethod
	public void classNGmethod() {
		System.setProperty("webdriver.chrome.driver", "/Users/angeljimenez/Downloads/chromedriver");
		driver = new ChromeDriver();
		driver.get("http://opensource.demo.orangehrmlive.com/");
	}
@Test 
public void testSyntax() {
	driver.findElement(By.id("txtUsername")).sendKeys("admin");
	driver.findElement(By.id("txtPassword")).sendKeys("admin");
	driver.findElement(By.id("btnLogin")).click();
	Assert.assertEquals("DashBoard", "DashBoard");
	
	System.out.println("Test Passed");
	}

@AfterMethod
public void quitBrowser() {
	driver.quit();
}
}
