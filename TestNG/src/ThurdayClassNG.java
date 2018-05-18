import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ThurdayClassNG {
	WebDriver driver;
	@BeforeMethod
	public void selectBrowser( ) {
		System.setProperty("webdriver.chrome.driver", "/Users/angeljimenez/Downloads/chromedriver");
		driver = new ChromeDriver();
		driver.get("http://qa.syntaxlive.com/home/");
	}
	@Test
	public void openWindow( ) {
		driver.findElement(By.id("edit-name")).sendKeys("editor");
		driver.findElement(By.id("edit-pass")).sendKeys("Welcome1");
		driver.findElement(By.id("edit-submit")).click();
		
		//driver.findElement(By.id("navbar")).
	}
@Test 
public void createArticle() {
	
}
}
