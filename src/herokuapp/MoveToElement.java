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
public class MoveToElement extends Hooks{

	@Before
	public void beforeTest(){
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://newtours.demoaut.com/");
		
	}
	@Test
	public void moveToElement() throws InterruptedException{
		WebElement link= driver.findElement(By.linkText("Home"));
		Actions actions=new Actions(driver);
		actions.moveToElement(link).build().perform();
		Thread.sleep(5000);
	}
}
