import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssSelector {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/angeljimenez/Desktop/selenium-java-3.11.0/Drivers/chromedriver");
		WebDriver driver= new ChromeDriver();
		driver.get("http://opensource.demo.orangehrmlive.com/");
		
		driver.findElement(By.cssSelector("input[id='txtUsername']")).sendKeys("admin");
		driver.findElement(By.cssSelector("input[id='txtPassword']")).sendKeys("admin");	
		//driver.findElement(By.cssSelector("input[id='btn"))}

}
}
