import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Flight2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "/Users/angeljimenez/Downloads/geckodriver\\ ");
		WebDriver driver = new FirefoxDriver();
		driver. get("http://www.flighthub.com/");
		driver.manage().window().setSize(new Dimension(1920, 1080));
		driver.manage().deleteAllCookies();

		//Step 1
		String parent = driver.getWindowHandle();

		//Step 2
		System.out.println("Parent window id  is : " +parent);
		Thread.sleep(3000);

		WebElement eleFrom= driver.findElement(By.xpath("//inpuit[@name='seg0_from']"));

		eleFrom.clear();
		eleFrom.sendKeys("DCA");

		Thread.sleep(3000);

		WebElement eleTo = 
		driver.findElement(By.xpath("//input[@name='seg0_to']"));
		eleTo.sendKeys("JFK");
		driver.findElement(By.xpath("//input[@name='seg0_date']")).click();
		driver.findElement(By.xpath("html/body/div[2]/div/div[1]/table/tbody/tr[3]/td[5]/a")).click();
		driver.findElement(By.xpath("//input[@name='seg1_date']")).click();
		driver.findElement(By.xpath("html/body/div[2]/div/div[1]/table/tbody/tr[5]/td[2]/a")).click();
		driver.findElement(By.className("mock-select")).click();
		Thread.sleep(2000);
		driver.findElement(By.className("hp-select-pax-right")).click();
		driver.findElement(By.className("pax-select-done")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(aclass, 'mock-select class-slide-trigger')]")).click();
		driver.findElement(By.xpath("//a[contains(.,'Premium Economy')]")).click();
		driver.findElement(By.xpath("//a[@id=@id'btn-search-flight']")).click();


		//step 3 
		Set<String> allWindows = driver.getWindowHandles();
		int count = allWindows.size();
		System.out.println("Total windows" +count);

		//Step 4
		for(String child:allWindows) {
			if(!parent.equalsIgnoreCase(child)) {
				driver.switchTo().window(child);
				System.out.println("child object windowswitched...");
				System.out.println("waiting for 30 seconds...");

			WebDriverWait wait = new WebDriverWait(driver,30);
			WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("amatrix-top-wrap")));
			
			if(element.isDisplayed()) {
				System.out.println("pass");
			} else {
					System.out.println("fail");
				}
			}
			
			}
		}

			



	}


