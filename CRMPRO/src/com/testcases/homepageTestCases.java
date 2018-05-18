package com.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.elements.homepageClass;



public class homepageTestCases {
	
	@Test
	public void testElements() {
		
		System.setProperty("webdriver.gecko.driver", "/Users/angeljimenez/Downloads/geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.freecrm.com/index.html");
		
		homepageClass CRM = PageFactory.initElements(driver,homepageClass.class );
		
		CRM.logo();
		CRM.usernameField("agj235");
		CRM.passwordField("1281616Aj");
		//CRM.loginButton();
		CRM.forgotPasswordBtn();
		CRM.signUpButton();
		CRM.featuresButton();
		CRM.pricingButton();
		CRM.customerButton();
		CRM.contactButton();
		CRM.headerPresent();
		CRM.footerPresent();
		CRM.loginButton();
	}

}
