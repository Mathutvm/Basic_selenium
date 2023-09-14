package dropdown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Multiselect_skillary {

	public static void main(String[] args) throws Throwable {
		WebDriverManager. edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://demoapp.skillrary.com/");
		WebElement dropDown = driver.findElement(By.xpath("//select[@id='cars']"));
		Select s=new Select(dropDown);
		Thread.sleep(4000);
		s.selectByIndex(0);
		Thread.sleep(4000);
		s.selectByValue("199");
		Thread.sleep(4000);
		s.deselectByIndex(0);
		Thread.sleep(4000);
		s.deselectByValue("199");
		Thread.sleep(4000);
		System.out.println(s.isMultiple());
		List<WebElement> value = s.getAllSelectedOptions();
		
		for(WebElement b: value ) {
			System.out.println(b.getText());
		}
		
	}

}
