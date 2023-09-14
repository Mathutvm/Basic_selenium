package webelement;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Verificationenable {

	public static void main(String[] args) {
		WebDriverManager. edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("mathu");
		driver.findElement(By.name("pass")).sendKeys("sghk");
		WebElement button=driver.findElement(By.xpath("//button[@name='login']"));
				if(button.isEnabled()) {
					System.out.println("pass");
					button.click();
					
				}else {
					System.out.println("fail");
				}
		

	}

}
