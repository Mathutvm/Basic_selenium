package Assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpath1 {

	public static void main(String[] args) throws Throwable {
		WebDriverManager. edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebDriverWait wait=new WebDriverWait(driver,10);
		driver.get("https://www.google.com/gmail/about/");
		driver.findElement(By.xpath("//a[@data-action='sign in']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("mmathumitha94@gmail.com");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		Thread.sleep(3000);
		WebElement ele = driver.findElement(By.xpath("//input[@name='Passwd']"));
		wait.until(ExpectedConditions.visibilityOf(ele));
		ele.sendKeys("mathudivy");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		Thread.sleep(3000);

	}

}
