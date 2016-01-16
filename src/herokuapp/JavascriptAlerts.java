package herokuapp;

import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

public class JavascriptAlerts extends Hooks{
	@Test
	public void clickForJSPrompt() throws InterruptedException{
		driver.findElement(By.linkText("JavaScript Alerts")).click();//Click on the 'Drag and Drop' link
		driver.findElement(By.xpath(".//*[text()='Click for JS Prompt']")).click();
		Alert obj = driver.switchTo().alert();
		obj.sendKeys("Hello World");
		obj.accept();
		
	}
}
