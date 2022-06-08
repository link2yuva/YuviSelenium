package week2.day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeadEdit {
	
	public LeadEdit(WebElement elesource) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws InterruptedException {
		 WebDriverManager.chromedriver().setup();
		 //launch
		 ChromeDriver driver=new ChromeDriver();
		 //load
		 driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Priya");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Raj");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Priya Raj");
		driver.findElement(By.name("departmentName")).sendKeys("Politics");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Duration of this course is 3 yrs");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("link2priya@gmail.com");
		Select dd = new Select (driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId")));
		dd.selectByVisibleText("New York");
		driver.findElement(By.className("smallSubmit")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
driver.findElement(By.id("updateLeadForm_description")).clear();
driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("Need 70% marks to be eligible");
driver.findElement(By.xpath("//input[@value='Update']")).click();
		
		System.out.println(driver.getTitle());
		
	
		
		
		
		
		
		
		 
		 
		 }

}
