package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.GoogleSearchPage;

public class GoogleSearchPages {
	
	private static WebDriver driver = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		googleSearch();

	}

	
	
	public static void googleSearch() {
		
		System.getProperty("webdriver.chrome.driver", "C:\\Users\\Gaurav\\java_workspace\\SeleniumJavaFramework\\Driver\\ChromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		
		// go to google.com
		driver.get("https://www.google.com");
		
		//enter text in search textbox
		driver.findElement(By.name("q")).sendKeys("Gaurav Markan");
		
		GoogleSearchPage.textbox_search(driver).sendKeys("Gaurav Markan");
		
		
		GoogleSearchPage.button_search(driver).sendKeys(Keys.RETURN);
		
		
		// Click on search button 
		//driver.findElement(By.name("btnK")).click();
		
		// close browser
		driver.close();
		
		System.out.println("test Completed Successfully");
		
	}
	
	
}
