package generic_libraries;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public  class WebDriver_Utilities {

	
		//1.mouseover
		public void mouseovering(WebDriver driver,WebElement ele) {
			Actions a= new Actions (driver);
			a.moveToElement(ele).perform();
			}

	//2.doubleclicking
		public void doubleclicking(WebDriver driver,WebElement ele) {
			Actions a= new Actions (driver);
			a.doubleClick(ele).perform();
}
		//3.drag and drop
		public void draganddrop(WebDriver driver, WebElement ele1,WebElement ele2) {
			Actions a=new Actions(driver);
			a.dragAndDrop(ele1, ele2).perform();
		}
		//4.Rightclick
		public void Rightclicking(WebDriver driver,WebElement ele) {
			Actions a=new Actions(driver);
			a.contextClick(ele).perform();
		}
		
		//5.implicit wait
		public void implicitWait(WebDriver driver,int time) {
			driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
		}
		
		//6.Explicit wait for visibility of element 
		public void ExplicitWait(WebDriver driver,int time ,WebElement ele) {
			WebDriverWait wait=new WebDriverWait(driver,time);
			wait.until(ExpectedConditions.visibilityOf(ele));
				
		}
		//7.ExplicitWait for element to be clickable
		public void ExplicitWait1(WebDriver driver,int time ,WebElement ele) {
			WebDriverWait wait=new WebDriverWait(driver,time);
			wait.until(ExpectedConditions.elementToBeClickable(ele));
		}
		//8.Handling parent window
		public void ParentWindow(WebDriver driver) {
			String parent = driver.getWindowHandle();
			driver.switchTo().window(parent);
		}
		
		//9.Handlingchild window 
		public void childWindow(WebDriver driver) {
			Set<String> child = driver.getWindowHandles();
			for(String b : child) {
				driver.switchTo().window(b);
		}
		}

          //10. handling Frames
		
		public void Frames(WebDriver driver,String value) {
			driver.switchTo().frame(value);
		}

         //11. handling frames
		
		public void Frames (WebDriver driver) {
			driver.switchTo().defaultContent();
			
		}

      //12.clicking on ok in alter pop up
		 public void alterPopUpOk(WebDriver driver) {
			 driver.switchTo().alert().accept();
		 }

		 
		 //13.clicking on ok in alter pop up 
		 public void alterPopupDismiss(WebDriver driver ) {
			 driver.switchTo().alert().dismiss();
		 }
		 
		 
		 //14.handling dropdown
		 public void dropDown(WebElement ele,String text) {
			 Select s= new Select(ele);
			 s.selectByVisibleText(text);
			 
		 }
		 
}



			
			
		
		
		
		
		