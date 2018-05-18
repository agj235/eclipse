package pageObjectClass;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class testCaseEx {
	
	@Test
	public void testLogin() {
		
		System.setProperty("webdriver.chrome.driver", "/Users/angeljimenez/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://opensource.demo.orangehrmlive.com/");
		
		pageClass loginEx = new pageClass(driver);
		
		loginEx.username();
		loginEx.password();
		loginEx.clickLogin();
		loginEx.clickRecruitment();
		loginEx.clickAdd();
		loginEx.firstName();
		loginEx.lastName();
		loginEx.email();
		loginEx.contactNumber();
		loginEx.commentBox();
		loginEx.saveButton();
	}

}
