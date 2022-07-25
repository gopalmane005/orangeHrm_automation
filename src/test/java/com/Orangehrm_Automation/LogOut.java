package com.Orangehrm_Automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LogOut extends BaseClass {

	public static void main(String[] args) {
		launchBrowser("chrome");
		driver.get("https://opensource-demo.orangehrmlive.com/");
		LoginTestCase.login("Admin", "admin123");
		driver.findElement(By.id("welcome")).click();
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.linkText("Logout"))));
		driver.findElement(By.linkText("Logout")).click();
		}

}
