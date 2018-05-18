package pageObjectClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HW9Page {
	WebDriver driver;
	
	By username = By.name("txtUsername");
	By password = By.id("txtPassword");
	By loginButton = By.id("btnLogin");
	By pimButton = By.xpath("//*[@id=\"menu_pim_viewPimModule\"]/b");
	By addEmployee = By.id("menu_pim_addEmployee");
	By firstName = By.id("firstName");
	By middleName = By.id("middleName");
	By lastName = By.id("lastName");
	By saveButton = By.id("btnSave");
	
	public HW9Page(WebDriver driver) {
		this.driver = driver;
	}
	

public void usernameField() {
	driver.findElement(username).sendKeys("admin");
	
}
public void passwordField() {
	driver.findElement(password).sendKeys("admin");

}
public void loginBtn() {
	driver.findElement(loginButton).click();

}
public void pimBtn() {
	driver.findElement(pimButton).click();

}
public void addEmployeeBtn() {
	driver.findElement(addEmployee).click();
	
}
public void firstNameField() {
	driver.findElement(firstName).sendKeys("Jack");
	
}
public void middleNameField() {
	driver.findElement(middleName).sendKeys("Nacho");

}
public void lastNameField() {
	driver.findElement(lastName).sendKeys("Black");
	
}
public void saveBtn() {
	driver.findElement(saveButton).click();
}

}