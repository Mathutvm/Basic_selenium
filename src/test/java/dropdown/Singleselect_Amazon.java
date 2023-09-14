package dropdown;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Singleselect_Amazon {

	public static void main(String[] args) throws Throwable {
		WebDriverManager. edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://www.amazon.in/");
		WebElement dropdown = driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
		Select s=new Select( dropdown);
		Thread.sleep(4000);
		s.selectByIndex(4);
		Thread.sleep(4000);
		s.selectByValue("search-alias=stripbooks");
		Thread.sleep(4000);
		s.selectByVisibleText("Kindle Store");
		List<WebElement> value = s.getOptions();
		System.out.println(value.size());
		for(WebElement b: value ) {
			System.out.println(b.getText());
		}
		driver.quit();
		
		
	}
}