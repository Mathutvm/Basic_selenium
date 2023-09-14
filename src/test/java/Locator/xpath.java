package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class xpath {

	public static void main(String[] args) throws Throwable {
		WebDriverManager. edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//input[@placeholder='Email address or phone number']")).sendKeys("Hi");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[contains(@name,'pass')]")).sendKeys("Hello");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Forgotten password?']")).click();

	}	

}
