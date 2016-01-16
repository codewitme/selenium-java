package herokuapp;

import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
//Drag and Drop not working
@Ignore
public class DragDrop extends Hooks{
	@Test
	public void dragDrop() throws InterruptedException{
		driver.findElement(By.linkText("Drag and Drop")).click();//Click on the 'Drag and Drop' link
		WebElement source = driver.findElement(By.id("column-a"));
		WebElement destination = driver.findElement(By.id("column-b"));
		Actions obj = new Actions(driver);
		Action dragdrop=obj.clickAndHold(source).moveToElement(destination).release(destination).build();
		dragdrop.perform();
		//obj.dragAndDrop.perform();
		Thread.sleep(2000);
	}
}
