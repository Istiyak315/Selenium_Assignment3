package Questions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DatePicker {
	WebDriver driver ;
	WebDriverWait wait;
	
	@BeforeTest
	public void bt() {
		driver=new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Datepicker.html");
		
		driver.manage().window().maximize();
		
	     wait = new WebDriverWait(driver,Duration.ofSeconds(10));
	    
	}
	
	@Test
	
	public void main() {
		
		driver.findElement(By.id("datepicker1")).click();
	 	

	 	wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.className("ui-datepicker-calendar"))));

	 	String actualmonth = driver.findElement(By.className("ui-datepicker-month")).getText();
	 	
	 	String actualyear = driver.findElement(By.className("ui-datepicker-year")).getText();
	 	
	 	
	 	
	 	//loop will stop when date is sep 2020
	 	while(!(actualmonth.equals("September")&&actualyear.equals("2020"))) {
	 		
	 		driver.findElement(By.xpath("//a[@data-handler='prev']")).click();
	 		
	 		
	 		 actualmonth = driver.findElement(By.className("ui-datepicker-month")).getText();
	 		
	 		 actualyear = driver.findElement(By.className("ui-datepicker-year")).getText();

	 	}
	}
	 	
	
	@AfterTest
	public void at() {

		//close the browser
		driver.quit();
		
		
	}
	

}
