import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterRevieww {
	WebDriver driver;
	@BeforeMethod
	public void  settle() {
		
		System.setProperty("webdriver.gecko.driver", "/Users/angeljimenez/Downloads/geckodriver2");
		
		 driver = new FirefoxDriver();
		
	}
	@Test
	@Parameters({"UID", "PID"})
	public void OHRM(String UID, String PID){
driver.get("http://opensource.demo.orangehrmlive.com/");
		
		driver.findElement(By.id("txtUsername")).sendKeys(UID);

		driver.findElement(By.id("txtPassword")).sendKeys(PID);
		
		driver.findElement(By.name("Submit")).click();
		
	}
	@AfterMethod
	public void cleanup() {
		driver.quit();
	}
}
	





