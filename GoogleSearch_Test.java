// This file is the main file as all the objects made in the GoogleSearch_Object(by_name) and GoogleSearch_Object(by_id) are run in this. 
// The files can be found under POM_Model Project.
// The GoogleSearch_Object file was kept under Folder Pages and This file was kept under Folder Test. 

package test;

import org.openqa.selenium.WebDriver;           // Importing the Selenium Library 
import org.openqa.selenium.chrome.ChromeDriver; // importing the chromedriver in order to perfrom the test on chrome browser.

import pages.GoogleSearchPageObject;            // Importing the essentinal and basic object made.

public class GoogleSearchPageTest {
	
	private static WebDriver driver = null;       
	
	public static void main(String[] args) {
		
		googleSearchTest();                       // Calling the function.
		
	}
	
	public static void googleSearchTest() { 
		
		System.getProperty("webdriver.chrome.driver", "C:\\Users\\Gaurav\\java_workspace\\SeleniumJavaFramework\\Driver\\ChromeDriver\\chromedriver.exe");// This is the location of my chrome driver. You can change it and use //, it can be found at https://chromedriver.chromium.org/. 
    
		driver = new ChromeDriver();
		
		
		GoogleSearchPageObject searchPageObj = new GoogleSearchPageObject(driver); // Object definition 
		
		driver.get("https://google.com");  
		
		searchPageObj.setTextInSearchBox("Montreal"); // Specifying the text required to run during the test. 
		
		searchPageObj.clickSearchButton();
		
		driver.close(); // Close the web browser 
	}

}
