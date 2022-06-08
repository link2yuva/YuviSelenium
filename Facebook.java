package week2.day2;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {
public static void main(String[] args) throws InterruptedException {
		
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver ();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	String pageSource = driver.getPageSource();
	System.out.println(pageSource);
	driver.findElement(By.linkText("Create new account")).click();
	driver.findElement(By.name("firstname")).sendKeys("Sharvesh");
    driver.findElement(By.name("lastname")).sendKeys("Yuvaraj");
    driver.findElement(By.name("reg_email__")).sendKeys("6473945250");
    driver.findElement(By.id("password_step_input")).sendKeys("Yuva@1525");
    
	Thread.sleep(5000);
	// SELECT CLASS - IDENTIFY 2. CREATE OBJECT FOR SELECT AND LINK 3.  CHOOSE THE OPTION
	
	Select bday = new Select (driver.findElement(By.name("birthday_day")));
	
	bday.selectByValue("7");
	
	Select month = new Select (driver.findElement(By.xpath("//select[@name='birthday_month']")));
	
	month.selectByValue("3");
   
	WebElement Year = driver.findElement(By.name("birthday_year"));
	Select yr = new Select(Year);
	yr.selectByIndex(17);
	driver.findElement(By.xpath("//label[text()='Female']")).click();
	driver.findElement(By.name("websubmit")).click();
	

	
	
	

	}

}
