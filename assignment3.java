package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class assignment3 {
public static void main(String[] args) {
WebDriverManager.chromedriver().setup();
ChromeDriver driver = new ChromeDriver();
driver.get("https://acme-test.uipath.com/login");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.findElement(By.xpath("//input[@name='email']")).sendKeys("kumar.testleaf@gmail.com");
driver.findElement(By.xpath("//input[@id='password']")).sendKeys("leaf@12");
driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();
WebElement head = driver.findElement(By.tagName("title"));
System.out.println(head.getTagName());
driver.findElement(By.linkText("Log Out")).click();

driver.close();

	}

}
