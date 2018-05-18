package newPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parametersXML {
	WebDriver driver;
	@Test
	@Parameters({"username","password","First Name", "Middle Name", "Last Name", "Email","Contact No", "Comment"})
	
	public void param( String userID, String password, String FName, String MName, String LName,String eMail,String contact, String comment) {
	System.setProperty("webdriver.chrome.driver", "/Users/angeljimenez/Downloads/chromedriver");
	driver = new ChromeDriver();
	
	driver.get("http://opensource.demo.orangehrmlive.com/index.php/auth/login");
	driver.findElement(By.id("txtUsername")).sendKeys("admin");
	driver.findElement(By.id("txtPassword")).sendKeys("admin");
	driver.findElement(By.id("btnLogin")).click();
	driver.findElement(By.xpath("//*[@id=\"menu_recruitment_viewRecruitmentModule\"]/b")).click();
	driver.findElement(By.id("btnAdd")).click();
	driver.findElement(By.id("addCandidate_firstName")).sendKeys("Angel");
	driver.findElement(By.id("addCandidate_middleName")).sendKeys("Gabriel");
	driver.findElement(By.id("addCandidate_lastName")).sendKeys("Jimenez");
	driver.findElement(By.id("addCandidate_email")).sendKeys("agj235@gmail.com");
	driver.findElement(By.id("addCandidate_contactNo")).sendKeys("7036268327");
	driver.findElement(By.id("addCandidate_comment")).sendKeys("Bonjour");
	driver.findElement(By.id("btnSave")).click();
	
	String url = driver.getCurrentUrl();
	System.out.println("This is the URL " +url);
	}

}
