// This Object is made in accordance with the name taken from the used boxes and search button. 
// It is clubbed with GoogleSearchTest.

// The two files were kept in different folders as specified in the test file . 
package pages;

import org.openqa.selenium.By; // Importing the Selenium Library
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class GoogleSearchPageObject {
	
	WebDriver driver = null; 
	
	// Check for the initialised value otherwise the test won't run. 
	By textbox_search_googleSearch = By.id("lb-tst"); // defining the elements that are utilised by the user - Textbox for Search and to click for searching about the stuff
			
	By button_search_googleSearch = By.name("btnK"); // This is taken by right-clicking on inspect and making forward with For instance we had google.com in consideration, so we right clicked on Google Search. 
	
	public GoogleSearchPageObject(WebDriver driver) { 
		
	this.driver = driver; 	// This is constructor in order to signify that the same driver is been referred when a code is written. 
	}
	
	public void setTextInSearchBox(String text) { 
		
		driver.findElement(textbox_search_googleSearch).sendKeys(text);  // command to perform google search and to write on it with input of some "TEXT "
		
	}
	
	public void clickSearchButton() {
		
		driver.findElement(button_search_googleSearch).sendKeys(Keys.RETURN); // command to click on google search button 
	}
	

}
