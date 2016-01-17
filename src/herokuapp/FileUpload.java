package herokuapp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.junit.Test;
import org.openqa.selenium.By;


public class FileUpload extends Hooks{
	@Test
	public void fileUploadTest() throws AWTException, InterruptedException{
		driver.findElement(By.linkText("File Upload")).click();//Click on the 'File Upload' link
		driver.findElement(By.id("file-upload")).click();//Click on File Upload button
		uploadFile("K:\\git-projects\\selenium-java\\selenium-java\\src\\testdata\\fileupload.xml");
		Thread.sleep(1000);
		driver.findElement(By.id("file-submit")).click();//Click on File Submit button
	}
	
	public static void setClipboardData(String string) {
		//StringSelection is a class that can be used for copy and paste operations.
		   StringSelection stringSelection = new StringSelection(string);
		   Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
		}
	
	public static void uploadFile(String fileLocation) throws AWTException {
        	//Setting clipboard with file location
            setClipboardData(fileLocation);
            //native key strokes for CTRL, V and ENTER keys
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_V);
            robot.keyRelease(KeyEvent.VK_V);
            robot.keyRelease(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);
	}
}
