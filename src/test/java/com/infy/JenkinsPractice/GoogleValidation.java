package com.infy.JenkinsPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GoogleValidation {

	@Test
public void validateGoogle() {
	WebDriver driver=new EdgeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.co.in/");
	String name=driver.findElement(By.xpath("//a[@aria-label='Gmail ']")).getText();
	Assert.assertEquals(name, "Gmail");
}
}
