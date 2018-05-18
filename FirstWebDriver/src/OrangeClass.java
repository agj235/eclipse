import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OrangeClass {

public void Signin() {
	System.setProperty("webdriver.chrome.driver", "/Users/angeljimenez/Downloads/chromedriver");
	
	WebDriver driver= new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.manage().window().fullscreen();
	driver.get("http://opensource.demo.orangehrmlive.com/");
	driver.findElement(By.id("txtUsername")).sendKeys("admin");
	driver.findElement(By.id("txtPassword")).sendKeys("admin");
	driver.findElement(By.name("Submit")).click();
	System.out.println(driver.getCurrentUrl());
	driver.findElement(By.linkText("PIM")).click();
	driver.findElement(By.partialLinkText("Add Emp")).click();
	driver.findElement(By.id("firstName")).sendKeys("Joaquin");
	driver.findElement(By.id("lastName")).sendKeys("Torres");
	driver.findElement(By.id("btnSave")).click();
	//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	String profileURL =driver.getCurrentUrl();
	
	System.out.println("This is the url" + profileURL );
	
	
	
	driver.findElement(By.id("personal_optGender_1")).click();
	
	driver.findElement(By.id("btnSave")).click();
	driver.findElement(By.id("personal_DOB")).clear();
	driver.findElement(By.id("personal_DOB")).sendKeys("1974-04-30");
	
	Select getMarital = new Select (driver.findElement(By.id("personal_cmbMarital")));
	getMarital.selectByValue("Single");
	
	WebElement nationality = driver.findElement(By.id("personal_cmbNation"));
	
	Select country = new Select(nationality);
	country.selectByValue("149");
	driver.findElement(By.id("btnSave")).click();
	
	List<WebElement> nationalityList = country.getOptions();
	int totalNationality= nationalityList.size();
	System.out.println(totalNationality);

for(WebElement eleLoop:nationalityList) {
	String nationalityName = eleLoop.getText();
	System.out.println(nationalityName);
	//WebDriverWait wait = new WebDriverWait(driver,30);
	//WebDriverElement element

	TakesScreenshot orange = (TakesScreenshot)driver;
	orange.getScreenshotAs(OutputType.FILE);
	
}
}
}
