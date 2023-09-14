package endtoendgeneric;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import generic_libraries.WebDriver_Utilities;
import io.github.bonigarcia.wdm.WebDriverManager;

public class End_End {

	public static void main(String[] args) {
		WebDriver_Utilities utilities =new WebDriver_Utilities();
			WebDriverManager. edgedriver().setup();
			WebDriver driver=new EdgeDriver();
			driver.manage().window().maximize();
			utilities.implicitWait(driver, 10);
			driver.get("https://www.skillrary.com");
		    driver.findElement(By.xpath("//a[text()=' GEARS ']")).click();
		    driver.findElement(By.xpath("(//a[text()=' SkillRary Demo APP'])[2]")).click();
		    utilities.childWindow(driver);
		    WebElement course = driver.findElement(By.id("course"));
		    utilities.mouseovering(driver, course);
		    driver.findElement(By.xpath("(//a[text()='Selenium Training'])[1]")).click();
		    WebElement plus = driver.findElement(By.id("add"));
		    utilities.doubleclicking(driver, plus);
		    driver.findElement(By.xpath("//button[text()=' Add to Cart']")).click();
		    utilities.alterPopUpOk(driver);
		    
	}

}
