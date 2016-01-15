package herokuapp;

import java.util.List;

import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
@Ignore
public class MouseHovers extends Hooks {
	@Test
	public void hoverMouseOnEachProfile() throws InterruptedException{
		Actions action;
		driver.findElement(By.linkText("Hovers")).click();//Click on the 'Hovers' link
		List<WebElement> figures=driver.findElements(By.className("figure"));//Gets all the elements in a list
		for(WebElement figure:figures){//Iterating through all the elements
		 action=new Actions(driver);
		 action.moveToElement(figure).build().perform();
		 Thread.sleep(2000);//Waiting to view the simulation(not needed)
		}
	}

}
