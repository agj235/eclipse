package stepDefinition;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TestCase {
	
	WebDriver driver;
	
	@Given("^I have a firefox browser running$")
	public void i_have_a_firefox_browser_running()  {
	   System.setProperty("webdriver.gecko.driver", "/Users/angeljimenez/Downloads/geckodriver");
		driver = new FirefoxDriver();
		}

	@When("^i go to the website$")
	public void i_go_to_the_website()  {
	   driver.get("http://opensource.demo.orangehrmlive.com/");
	}

	@When("^I enter valid username$")
	public void i_enter_valid_username()  {
	   driver.findElement(By.id("txtUsername")).sendKeys("admin");
	}

	@When("^I enter valid password$")
	public void i_enter_valid_password() {
		   driver.findElement(By.id("txtPassword")).sendKeys("admin");

	}

	@When("^I click on the login button$")
	public void i_click_on_the_login_button()  {
		   driver.findElement(By.id("btnLogin")).click();

	}

	@Then("^I should see the logout link$")
	public void i_should_see_the_logout_link()  {
	    System.out.println("I see it");
	}

@When("^i click on recruitment tab$")
public void i_click_on_recruitment_tab()  {
   driver.findElement(By.cssSelector("#menu_recruitment_viewRecruitmentModule > b:nth-child(1)")).click();
}

@When("^I click on add button$")
public void i_click_on_add_button()  {
    driver.findElement(By.id("btnAdd")).click();
}

@When("^i enter Full name$")
public void i_enter_Full_name()  {
  driver.findElement(By.id("addCandidate_firstName")).sendKeys("John");
  driver.findElement(By.id("addCandidate_middleName")).sendKeys("Jack");
  driver.findElement(By.id("addCandidate_lastName")).sendKeys("Smith");
}

@When("^i enter email$")
public void i_enter_email() {
 driver.findElement(By.id("addCandidate_email")).sendKeys("johnsmith@gmail.com");
}

@When("^i enter contact number$")
public void i_enter_contact_number() {
  driver.findElement(By.id("addCandidate_contactNo")).sendKeys("111-111-1111");
}

@Then("^I click on save button$")
public void i_click_on_save_button()  {
   driver.findElement(By.id("btnSave")).click();
}



	@Given("^I have a chrome browser running$")
	public void i_have_a_chrome_browser_running()  {
	   System.setProperty("webdriver.chrome.driver", "/Users/angeljimenez/Downloads/chromedriver");
		driver = new ChromeDriver();
		}

@When("^i click on PIM button$")
public void i_click_on_PIM_button()  {
driver.findElement(By.cssSelector("#menu_pim_viewPimModule > b:nth-child(1)")).click();
}

@When("^I click add employee$")
public void i_click_add_employee()  {
  driver.findElement(By.id("menu_pim_addEmployee")).click();
}
@When("^i enter new Full name$")
public void i_enter_new_Full_name() {
	driver.findElement(By.id("firstName")).sendKeys("John");
	driver.findElement(By.id("middleName")).sendKeys("John");
	driver.findElement(By.id("lastName")).sendKeys("Smith");

    
}
@When("^I enter valid username\"([^\"]*)\"$")
public void i_enter_valid_username(String un)  {
   driver.findElement(By.id("txtUsername")).sendKeys(un);
}

@When("^I enter valid password \"([^\"]*)\"$")
public void i_enter_valid_password(String pwd) {
	   driver.findElement(By.id("txtPassword")).sendKeys(pwd);
}
@Given("^I have firefox browser running$")
public void i_have_firefox_browser_running() throws Throwable {
	
		   System.setProperty("webdriver.gecko.driver", "/Users/angeljimenez/Downloads/geckodriver");
			driver = new FirefoxDriver();
}

@When("^I i go to the website$")
public void i_i_go_to_the_website() throws Throwable {
   driver.get("http://opensource.demo.orangehrmlive.com/");
}

@When("^I enter valid username and password$")
public void i_enter_valid_username_and_password(DataTable data) throws Throwable {
    List<List<String>> dataT =data.raw();
    driver.findElement(By.id("txtUsername")).sendKeys(dataT.get(0).get(0));
    driver.findElement(By.id("txtPassword")).sendKeys(dataT.get(0).get(1));

}

@Then("^I i should see the logout button$")
public void i_i_should_see_the_logout_button() throws Throwable {
	driver.findElement(By.id("welcome")).click();
	System.out.println("I see it now");
}

@Then("^i enter full name$")
public void i_enter_full_name(DataTable data1) throws Throwable {
   List<List<String>> dataF= data1.raw();
   driver.findElement(By.id("addCandidate_firstName")).sendKeys(dataF.get(0).get(0));
	driver.findElement(By.id("addCandidate_middleName")).sendKeys(dataF.get(0).get(1));
	driver.findElement(By.id("addCandidate_lastName")).sendKeys(dataF.get(0).get(2));
}

@Then("^i enter user email$")
public void i_enter_user_email(DataTable email) throws Throwable {
	 List<List<String>> dataE= email.raw();
	driver.findElement(By.id("addCandidate_email")).sendKeys(dataE.get(0).get(0));
}



@When("^I enter valid \"([^\"]*)\" and \"([^\"]*)\"$")
public void i_enter_valid_and(String uName, String pwd) throws Throwable {
	driver.findElement(By.id("txtUsername")).sendKeys(uName);
	driver.findElement(By.id("txtPassword")).sendKeys(pwd);
}

@When("^i quit browser$")
public void i_quit_browser() throws Throwable {
   driver.quit();
}
//Global Hook
@Before()
public void runBrowser() {
	System.setProperty("webdriver.gecko.driver", "/Users/angeljimenez/Downloads/geckodriver");
	driver = new FirefoxDriver();
}
//LOCAL HOOK
@Before("@First")
public void goToURL() {
	driver.get("http://opensource.demo.orangehrmlive.com/");
}
//Global After Hook
@After()
public void closeBrowser() {
	driver.quit();
}
}
