package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class Skillrary_Demo {
	    @FindBy(id="course")
       	private WebElement COURSE;
	  
		@FindBy(xpath="//a[text()='Selenium Training'])[1]")
		private WebElement MOUSEOVER ;
		
	    public void mouseovering(WebDriver driver,WebElement COURSE) {
			Actions a= new Actions (driver);
			a.moveToElement(COURSE).perform();

			}

		
	
    
}
