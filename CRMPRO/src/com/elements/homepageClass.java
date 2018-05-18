package com.elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class homepageClass {
WebDriver driver;

@CacheLookup
@FindBy(xpath="/html/body/div[2]/div/div[1]/a/img")WebElement logo;
@CacheLookup
@FindBy (name="username")WebElement username;
@CacheLookup
@FindBy(name="password")WebElement password;
@CacheLookup
@FindBy(xpath="//*[@id=\"loginForm\"]/div/div/input")WebElement loginBtn;
@CacheLookup
@FindBy(xpath="/html/body/div[2]/div/a[1]/small")WebElement fogotPassword;
@CacheLookup
@FindBy(xpath="/html/body/div[2]/div/a[2]/button")WebElement signUpBtn;
@CacheLookup
@FindBy(xpath="//*[@id=\"navbar-collapse\"]/ul/li[1]/a")WebElement featuresBtn;
@CacheLookup
@FindBy(xpath="//*[@id=\"navbar-collapse\"]/ul/li[3]/a")WebElement pricingBtn;
@CacheLookup
@FindBy(xpath="//*[@id=\"navbar-collapse\"]/ul/li[4]/a")WebElement customerBtn;
@CacheLookup
@FindBy(xpath="//*[@id=\"navbar-collapse\"]/ul/li[5]/a")WebElement contactBtn;
@CacheLookup
@FindBy(xpath="/html/body/div[2]/div/div[1]")WebElement header;
@CacheLookup
@FindBy(xpath="//*[@id=\"footer\"]")WebElement footer;

public homepageClass(WebDriver driver) {
this.driver= driver;
}

public void logo() {
	logo.isDisplayed();
}

public void usernameField(String uid) {
	username.sendKeys(uid);
}

public void passwordField(String pwd) {
	password.sendKeys(pwd);
}

//public void loginButton() {
	//loginBtn.isDisplayed();
//}

public void forgotPasswordBtn() {
	fogotPassword.isDisplayed();
}

public void signUpButton() {
	signUpBtn.isDisplayed();
}


public void featuresButton() {
	featuresBtn.isDisplayed();
}

public void pricingButton() {
	pricingBtn.isDisplayed();
}

public void customerButton() {
	customerBtn.isDisplayed();
}

public void contactButton() {
	contactBtn.isDisplayed();
}

public void headerPresent() {
	header.isDisplayed();
}

public void footerPresent() {
	footer.isDisplayed();
}

public void loginButton() {
	loginBtn.click();
}
}
