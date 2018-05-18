package class1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class firstclass {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "/Users/angeljimenez/Downloads/chromedriver");
		WebDriver hello=new ChromeDriver();
		
		hello.get("https://www.google.com");
		
	}

}
