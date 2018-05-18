import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WHATHEHEHE {
	//annotation in TestNG
	//@BeforeSuite
	//@AfterSuite
	//@BeforeTest
	//@AfterTest
	//@BeforeClass
	//@AfterClass
	//@BeforeMethod
	//@AfterMethod and @Test
	@Test
	public void classNGmethod() {
		System.setProperty("webdriver.chrome.driver", "/Users/angeljimenez/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
	}

}
