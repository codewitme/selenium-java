package herokuapp;

import java.util.List;
import java.util.Set;

import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
@Ignore
public class MultipleWindow extends Hooks{
	@Test
	public void handleMultipleWindows(){
		driver.findElement(By.linkText("Multiple Windows")).click();//Click on the 'Multiple Windows' link
		String parentWindow=driver.getWindowHandle();//Getting the handle of the main window
		driver.findElement(By.linkText("Click Here")).click();//Click on the link 'Click Here'
		Set<String> windows= driver.getWindowHandles();//Get the list of handles currently opened by the webdriver.
		for(String window:windows){
			driver.switchTo().window(window);//Switch the driver window and verify the window name
			if(driver.getTitle().equalsIgnoreCase("New Window")){
				break;//Break off the loop if the window name matches 'New Window'
			}
		}
		driver.close();//Close the new window
		driver.switchTo().window(parentWindow);//Switch back to the parent window and close it
		driver.close();
	}
}
