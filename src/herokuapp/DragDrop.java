package herokuapp;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
@Ignore
public class DragDrop extends Hooks{
	
	@Before
	public void beforeTest(){
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://jqueryui.com/droppable/");
		
	}
	@Test
	public void dragDrop() throws InterruptedException{
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.className("demo-frame")));
		WebElement Sourcelocator = driver.findElement(By.id("draggable"));
		WebElement Destinationlocator = driver.findElement(By.id("droppable"));
		dragAndDrop(Sourcelocator,Destinationlocator);
		String actualText=Destinationlocator.findElement(By.tagName("p")).getText();
		Assert.assertEquals(actualText, "Dropped!");
	}
	
	 public void dragAndDrop(WebElement sourceElement, WebElement destinationElement)
	    {
		 	Actions actions= new Actions(driver);
		 	actions.dragAndDrop(sourceElement, destinationElement).build().perform();
	    }
}
