package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment4 {
	public static void main(String[] args) {
WebDriverManager.chromedriver().setup();
ChromeDriver driver = new ChromeDriver();
driver.get("http://www.leafground.com/pages/radio.html");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
WebElement enabled = driver.findElement(By.xpath("//input[@id='yes']"));
System.out.println(" ARE YOU ENJOYING " + enabled.isSelected());
WebElement checked = driver.findElement(By.xpath("//input[@class='myradio']/following-sibling :: input[@id='no']"));

System.out.println("Find the Deafult Selected Radio button");

if (checked.isEnabled()) {
	
	System.out.println("checked");
}
else 
	
{
	System.out.println("Not checked");
	}


	}

}
