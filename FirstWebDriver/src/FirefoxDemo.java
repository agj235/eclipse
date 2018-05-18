

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class FirefoxDemo {
	

	public static void main(String[] args) {
		//SPECIFY DRIVER EXE PATH
		System.setProperty("webdriver.gecko.driver", "/Users/angeljimenez/Downloads/geckodriver2");
		//OPENS NEW FIREFOX WINDOW
		WebDriver driver = new FirefoxDriver();
		//NAVIGATES TO SYNTAXTECHS.COM
		driver.get("http://Syntaxtechs.com");
		// GETS AND PRINT PAGE TITLE
		System.out.println(driver.getTitle());
		//CLOSE BROWSER
		//driver.quit();
	}

}
