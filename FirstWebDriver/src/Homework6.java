import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Homework6 {

	public static void main(String[] args) {
////Homework 6
	//	1) 	Navigate to the following website
	//http://toolsqa.com/automation-practice-switch-windows/
	//2)Click on the New Browser Window button and verify “QA Automaion Tool Tuturial" text is present in the child window.
		//3)Click on New Browser Tab button and verify ToolsQA Image is present in the child window
		//4)Take screenshots of open child windows
		System.setProperty("webdriver.gecko.driver", "/Users/angeljimenez/Downloads/geckodriver2");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://toolsqa.com/automation-practice-switch-windows/");
		String parent = driver.getWindowHandle();
		
		driver.findElement(By.id("button1")).click();
		
		Set<String> allWindows = driver.getWindowHandles();
		int count = allWindows.size();
		System.out.println("Total windows " +count);
		
		for(String child:allWindows) {
			if(!parent.equalsIgnoreCase(child)) {
				driver.switchTo().window(child);
				System.out.println("Child object window switched...");
				System.out.println("waiting for 30 seconds...");

			WebDriverWait wait = new WebDriverWait(driver,30);
			
			WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("amatrix-top-wrap")));
			
			if(element.isDisplayed()) {
				System.out.println("pass");
			} else {
					System.out.println("fail");
			}
		/*
		 * Iterator<String> !1=childWindow.iterator();
		 * while(!1.hasNext()) {
		 * 
		 * String childNextWindow = !1.next();
		 * 
		 * if(!parentWindow.eqaulsIgnoreCase(childNextWindow)) {
		 * driver.switchTo().window(childNextWindow).close();
		 * Thread.sleep(5000)
		 * System.out.println("Child Window Closed");
		 * }
		 * Driver.switchTo().window(parentWindow);
		 * 
		 */
	}

}
}
}