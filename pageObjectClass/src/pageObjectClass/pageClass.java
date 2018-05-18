package pageObjectClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class pageClass {
	WebDriver driver;
	
	By usernameField = By.name("txtUsername");
	By passwordField = By.id("txtPassword");
	By loginButton = By.id("btnLogin");
	By recruitment = By.xpath("//*[@id=\"menu_recruitment_viewRecruitmentModule\"]/b");
	By addButton = By.id("btnAdd");
	By firstName = By.name("addCandidate[firstName]");
	By lastName = By.name("addCandidate[lastName]");
	By email = By.id("addCandidate_email");
	By contactNo = By.id("addCandidate_contactNo");
	By comment = By.id("addCandidate_comment");
	By saveButton = By.id("btnSave");
	/*
	 * the below piece of code is a constructor
	 * constructor does not return a value
	 * it has the same name as the class name
	 */
	
	public pageClass(WebDriver driver) {
		this.driver = driver;
	}
	
	
	public void username() {
		driver.findElement(usernameField).sendKeys("admin");
	}
	
	
	public void password() {
		driver.findElement(passwordField).sendKeys("admin");
	}
	
	public void clickLogin() {
		driver.findElement(loginButton).click();
	}
	public void clickRecruitment() {
		driver.findElement(recruitment).click();
	}
	public void clickAdd() {
		driver.findElement(addButton).click();
	}
	
	public void firstName() {
		driver.findElement(firstName).sendKeys("Kanye");
		}
	
	public void lastName() {
		driver.findElement(lastName).sendKeys("West");
	}
	
	public void email() {
	driver.findElement(email).sendKeys("IAMGOD@gmail.com");
	}
	
	public void contactNumber() {
		driver.findElement(contactNo).sendKeys("1111111111");
	}
	
	public void commentBox() {
		driver.findElement(comment).sendKeys("CAN'T STOP ME");
	}
	
	public void saveButton() {
		driver.findElement(saveButton).click();
	}
}
