package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	public static void main(String[] args) throws InterruptedException {
		// Setup browser
		WebDriverManager.chromedriver().setup();
		//Open the browser
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		// Identify the locator 
		WebElement eleUsername = driver.findElement(By.id("username"));
		// Action
		eleUsername.sendKeys("DemoSalesManager");
		// Identify Second locator
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf(11486)");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Priya");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Raj");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Priya Raj");
		driver.findElement(By.name("departmentName")).sendKeys("Computer Science");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("3 yrs course");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("link2priya@gmail.com");
		
		WebElement ele = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select states = new Select (ele);
		states.selectByVisibleText("New York");
		driver.findElement(By.className("smallSubmit")).click();
		Thread.sleep(10000);
		driver.close();
		
		
		
	}

}
