package com.Orangehrm_Automation;

public class WaitsExample extends BaseClass {

	public static void main(String[] args) throws Exception {
		launchBrowser("chrome");
		
		// driver.manage().timeout().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https:opensource-demo.orangehrmlive.com/");
		LoginTestCase.login("Admin","admin123");
		
		//try {
			//if(driver.findElement(By.id(null)))
		
		
		

	}

}
