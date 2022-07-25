package com.Orangehrm_Automation;

import java.rmi.AccessException;
import java.time.Duration;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utill extends BaseClass {

	public static void waitForElementToClick(By element) {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		
		wait.until(ExpectedConditions.elementToBeClickable(element));
		
	}
	public static void fluentWait(final WebElement element) {
		Wait<WebDriver> wait=new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(10)).pollingEvery(Duration.ofSeconds(2)).ignoring(AccessException.class);
		
		wait.until(new Function<WebDriver,WebElement>(){
			
			public WebElement apply (WebDriver driver) {
				System.out.println("Checking the element availability to perform action.....");
				return element;
			}
		});
		
	}

}
