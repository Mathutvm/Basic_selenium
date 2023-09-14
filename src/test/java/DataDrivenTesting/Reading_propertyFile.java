package DataDrivenTesting;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
public class Reading_propertyFile {

	public static void main(String[] args) throws Throwable {
		Properties p= new Properties();
		FileInputStream fis= new FileInputStream(".\\src\\test\\resources\\Data.properties");
		p.load(fis);
		String APPURL = p.getProperty("url");
	    String USER = p.getProperty("username");
	    String PASSWORD = p.getProperty("password");
	    WebDriverManager. edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get(APPURL);
		driver.findElement(By.id("email")).sendKeys(USER);
		driver.findElement(By.id("pass")).sendKeys(PASSWORD);
	}

}
