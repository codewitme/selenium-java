package herokuapp;

import java.util.List;

import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Checkbox extends Hooks{
	@Test
	public void selectAllChecbox(){
		driver.findElement(By.linkText("Checkboxes")).click();//Click on the 'Checkboxes' link
		List<WebElement> checkboxes=driver.findElements(By.xpath(".//*[@type='checkbox']"));
		for(WebElement checkbox:checkboxes){//Get the list of all the checkboxes
			if(!checkbox.isSelected()){//Click on those checkboxes that are not selected
				checkbox.click();
			}
		}
	}
	@Test
	public void unselectAllChecbox(){
		driver.findElement(By.linkText("Checkboxes")).click();//Click on the 'Checkboxes' link
		List<WebElement> checkboxes=driver.findElements(By.xpath(".//*[@type='checkbox']"));
		for(WebElement checkbox:checkboxes){
			if(checkbox.isSelected()){
				checkbox.click();//Click on those checkboxes that are  selected
			}
		}
	}

}
