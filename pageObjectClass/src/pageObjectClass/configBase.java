package pageObjectClass;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class configBase extends Base{
	
	@Test
	public void login() {
		driver.findElement(By.name("username")).sendKeys("agj235");
		driver.findElement(By.name("password")).sendKeys("1281616Aj");
		driver.findElement(By.cssSelector("input.btn")).click();
	}

}
