package com.Orangehrm_Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.github.dockerjava.api.model.Driver;

public class DropDownExamples extends BaseClass {

	public static void main(String[] args) throws Exception {
		launchBrowser("chrome");
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		LoginTestCase.login("Admin", "admin123");
		driver.findElement(By.id("menu_pim_viewPimModule")).click();
		// locate empl status dropdown 
		WebElement empStatusDropDown=driver.findElement(By.id(null));
		
	

	}

}
