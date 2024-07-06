package Questions;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MouseHower {
WebDriver driver;
Actions actions;

	
	@BeforeTest
	public void bt() {
		
		driver=new ChromeDriver();
		driver.get("https://www.ebay.com/");
		
		driver.manage().window().maximize();
	}
	
	@Test
	public void main() {
		 // Create an instance of Actions class
         actions = new Actions(driver);

     
		// Hover over "Electronics" link
        WebElement electronicsLink = driver.findElement(By.linkText("Electronics"));
        actions.moveToElement(electronicsLink).perform();
        
        // Adding some wait to observe the action
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}  
	
	
        @Test
        public void test2() {
        	  // Hover over "Fashion" link
            WebElement fashionLink = driver.findElement(By.linkText("Fashion"));
            actions.moveToElement(fashionLink).perform();

            // Adding some wait to observe the action
            driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
            
        }
        
        @Test
        public void test3() {

            // Hover over "Refurbished" link
            WebElement refurbishedLink = driver.findElement(By.linkText("Refurbished")) ;
            actions.moveToElement(refurbishedLink).perform();

            // Adding some wait to observe the action
            driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);


        }

      

	@AfterTest
	public void at() {
		
		//close the browser
		driver.quit();
		
	}
}