import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Homewrok8 {

	public static WebDriver driver;
	@BeforeMethod
	public void  Amazon( ) {
		System.setProperty("webdriver.chrome.driver", "/Users/angeljimenez/Downloads/chromedriver");
		driver = new ChromeDriver();
		driver.get("http://www.amazon.com");
	}
	@Test
	public void testAmazon( ) {
		Assert.assertEquals( "Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more",  "Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iPad");
		driver.findElement(By.className("nav-input")).click();
		driver.findElement(By.id("sort")).click();
		
		Select newArrival = new Select(driver.findElement(By.id("sort")));
		newArrival.selectByValue("date-desc-rank");
	
	String results = driver.findElement(By.cssSelector("#s-result-count")).getText();
		System.out.println(results);
			
		}
	@AfterMethod
	public void quitBrowser() {
		driver.quit();
	}
}
	
		
	
	


