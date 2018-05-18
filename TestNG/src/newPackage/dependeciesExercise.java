package newPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class dependeciesExercise {
WebDriver driver;
	@Test
	public void startBrowser() {
		System.setProperty("webdriver.chrome.driver", "/Users/angeljimenez/Downloads/chromedriver");
		driver= new ChromeDriver();
		driver.get("http://qa.syntaxlive.com/home/");
	}
	@Test
public void validCredentials() {
	driver.findElement(By.id("edit-name")).sendKeys("editor");
	driver.findElement(By.id("edit-pass")).sendKeys("Welcome1");
	driver.findElement(By.id("edit-submit")).click();
	}
@Test
public void postArticle() {
	
}
}
