import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRMLogin {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/angeljimenez/Desktop/selenium-java-3.11.0/Drivers/chromedriver");
		
		WebDriver driver= new ChromeDriver();
		driver.get("http://opensource.demo.orangehrmlive.com/");
		
		driver.findElement(By.id("txtUsername")).sendKeys("admin");

		driver.findElement(By.id("txtPassword")).sendKeys("admin");
		
		driver.findElement(By.name("Submit")).click();
		
		driver.findElement(By.linkText("PIM")).click();
		
		driver.findElement(By.partialLinkText("Add Emp")).click();
		
		driver.findElement(By.id("firstName")).sendKeys("John");
		
		driver.findElement(By.id("lastName")).sendKeys("Smith");
		
		driver.findElement(By.name("employeeId")).clear();

		driver.findElement(By.name("employeeId")).sendKeys("00098");
		
		driver.findElement(By.id("btnSave")).click();
	}
public void SignIn() {
	
}
}
