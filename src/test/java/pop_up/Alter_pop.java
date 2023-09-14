package pop_up;

import java.util.concurrent.TimeUnit; 
import org.openqa.selenium.Alert; 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.edge.EdgeDriver; 
import io.github.bonigarcia.wdm.WebDriverManager; 

public class Alter_pop {

	public static void main(String[] args) throws Throwable {
		WebDriverManager. edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://demoapp.skillrary.com/product.php?product=selenium-training");
		driver.findElement(By.xpath("//button[text()=' Add to Cart']")).click();
		Alert a1=driver.switchTo().alert();
		Thread.sleep(3000);
		System.out.println(a1.getText());
		a1.accept();
		
	}
}