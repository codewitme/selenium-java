package herokuapp;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

@Ignore
public class ContextClick extends Hooks {
	@Before
	public void beforeTest(){
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://medialize.github.io/jQuery-contextMenu/demo.html");
		
	}
	@Test
	public void contextClick() throws InterruptedException{
		WebDriverWait wait = new WebDriverWait(driver, 5);
		WebElement element=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(".//span[text()='right click me']")));
		Actions actions = new Actions(driver);
		actions.contextClick(element).build().perform();
		driver.findElement(By.xpath(".//span[text()='Paste']")).click();
		Alert alert=driver.switchTo().alert();
		String textEdit = alert.getText();
		Assert.assertEquals(textEdit, "clicked: paste");
		alert.accept();
	}
}
