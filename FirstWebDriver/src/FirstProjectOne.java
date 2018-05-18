import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstProjectOne {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/angeljimenez/Desktop/selenium-java-3.11.0/Drivers/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().fullscreen();
		
		driver.get("http://www.facebook.com");
		
		driver.findElement(By.id("email")).sendKeys("admin");
		
		driver.findElement(By.id("pass")).sendKeys("admin");
		
		driver.findElement(By.id("u_0_2")).click();
		
		
	}

}
