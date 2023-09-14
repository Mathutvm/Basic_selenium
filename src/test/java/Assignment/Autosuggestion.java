package Assignment;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Autosuggestion {

	public static void main(String[] args) throws Throwable {
		WebDriverManager. edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//textarea[@type='search']")).sendKeys("mobile");
		 List<WebElement> list = driver.findElements(By.xpath("//li[@data-view-type='1']"));
		 Thread.sleep(4000); 
		 for (WebElement li : list) { System.out.println(li.getText());
		 } 
		 Thread.sleep(4000); driver.quit(); 
		
		;
		
	}

}
