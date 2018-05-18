package com.project;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.testng.annotations.Test;



public class MavenExample {
	@Test
	public void mavenTest() {
		
		System.setProperty("phantomjs.binary.path", "/Users/angeljimenez/Downloads/phantomjs-2.1.1-macosx/bin/phantomjs");
		WebDriver driver = new PhantomJSDriver();
		driver.get("https://www.google.com");
		driver.findElement(By.xpath("//a[contains(.,'Gmail')]")).click();
	
	String title = driver.getCurrentUrl();
	System.out.println(title);
	
	}

}