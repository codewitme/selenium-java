package herokuapp;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleWindowsCiti extends Hooks{

	@Before
	public void beforeTest(){
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.online.citibank.co.in/");
		
	}
	
	@Test
	public void VerifyLogin(){
	
		String pWindow=driver.getWindowHandle();
		//Click to generate multiple windows
		driver.findElement(By.xpath(".//*[@class='hidden-phone']/*[@alt='LOGIN NOW']")).click();
		//Get all windows in a string array object
		Set<String> windowHandles=driver.getWindowHandles();
		String title=driver.getTitle();
		//Iterate through all the windows
		for(String windowHandle:windowHandles){
			title=driver.switchTo().window(windowHandle).getTitle();
			//...contd. until desired window is found
			if(title.equals("Citibank India")){
				//driver.switchTo().window(windowHandle);
				
				driver.close();
				break;
			}
			
		}
		driver.switchTo().window(pWindow);
		
		
	}
}
