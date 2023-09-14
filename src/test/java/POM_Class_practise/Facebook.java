package POM_Class_practise;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import POM.Fb_Loginpage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {

	public static void main(String[] args) {
		WebDriverManager. edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com/");
		Fb_Loginpage fblogin=new Fb_Loginpage(driver);
		fblogin.emailTextField("mathu");
		fblogin.passwordTextField("mitha");
		fblogin.loginButton();

	}

}
