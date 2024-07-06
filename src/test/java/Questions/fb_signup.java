package Questions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class fb_signup {
	
	WebDriver driver;
	
	@BeforeTest
	
	//entering url of browser and declaring driver
	public void bt() {
		driver= new ChromeDriver();
		
		driver.get("https://www.facebook.com/signup");
		
		driver.manage().window().maximize();
		
	}
	
	@Test
	//enetering details to signup
	public void enteringDetails() {
		
		//entered firstname , lastname, email, password
		driver.findElement(By.name("firstname")).sendKeys("Istiyak");
		driver.findElement(By.name("lastname")).sendKeys("shaikh");
		driver.findElement(By.name("reg_email__")).sendKeys("sistiyak317@gmail.com");
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("sistiyak317@gmail.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("Ishu@7745");
		
		//selecting day of birth
		
		WebElement day = driver.findElement(By.name("birthday_day"));
		Select date_of_Birth=new Select(day);
		date_of_Birth.selectByValue("16");
		
		
		
		//selecting month of birth
		
		WebElement month = driver.findElement(By.name("birthday_month"));
		Select Month_of_birth = new Select(month);
		Month_of_birth.selectByValue("11");
		
		
		//selecting year of birth
		
		WebElement year = driver.findElement(By.name("birthday_year"));
		Select year_of_birth = new Select(year);
		year_of_birth.selectByValue("1999");
		
		
		//clicking on gender
		
		WebElement gender=driver.findElement(By.xpath("(//*[@type=\"radio\"])[2]"));
		gender.click();
		
		//clicking on submit button
		
		driver.findElement(By.name("websubmit")).click();
		
		

		
	}
	
	@AfterTest
	//to close the browser
	public void at() {
		driver.quit();
	}

}
