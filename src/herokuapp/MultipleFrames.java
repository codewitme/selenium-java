package herokuapp;

import java.util.Set;

import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
@Ignore
public class MultipleFrames extends Hooks{
	@Test
	public void handleMultipleFrames(){
		driver.findElement(By.linkText("Nested Frames")).click();//Click on the 'Nested Frames' link
		driver.switchTo().frame("frame-top");//Navigate to the middle frame through the top frame
		driver.switchTo().frame("frame-middle");
		String middle=driver.findElement(By.id("content")).getText();
		System.out.println(middle);
		driver.switchTo().defaultContent();//Switch to the default content to switch to parent frames
		driver.switchTo().frame("frame-bottom");
	}
}
