import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class ChromeDemo {

	public static void main(String[] args) {
		//SPECIFY DRIVER EXE PATH
		System.setProperty("webdriver.chrome.driver", "/Users/angeljimenez/Downloads/chromedriver");
		//OPENS NEW CHROME WINDOW
		WebDriver driver= new ChromeDriver();
		//NAVIGATES TO SYTAXTECHS.COM
		driver.get("http://Syntaxtechs.com");
		//GETS AND PRINT PAGE TITLE
		System.out.println(driver.getTitle());
		//CLOSE BROWSER
		driver.quit();
	}

}
