package pageObjectClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HW9Test {
	
	@Test
	public void testAddEmployee() {
		
		System.setProperty("webdriver.chrome.driver", "/Users/angeljimenez/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://opensource.demo.orangehrmlive.com/");
		
		HW9Page addEmployee = new HW9Page(driver);
		
		addEmployee.usernameField();
		addEmployee.passwordField();
		addEmployee.loginBtn();
		addEmployee.pimBtn();
		addEmployee.addEmployeeBtn();
		addEmployee.firstNameField();
		addEmployee.middleNameField();
		addEmployee.lastNameField();
		addEmployee.saveBtn();
	}

}
