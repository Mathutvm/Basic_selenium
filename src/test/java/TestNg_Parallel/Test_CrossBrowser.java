package TestNg_Parallel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_CrossBrowser {
	@Parameters({"browsername"})
@Test
public void facebook(String browser) {
	WebDriver driver;
	if(browser.equals("edge")) {
		WebDriverManager. edgedriver().setup();
		 driver=new EdgeDriver();
	}else {
		WebDriverManager. chromedriver().setup();
		 driver=new ChromeDriver();
	}
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
	driver.get("https://www.facebook.com/");
}
}
