package herokuapp;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class Dropdowns extends Hooks{
	@Test
	public void selectItemByText(){
		driver.findElement(By.linkText("Dropdown")).click();//Click on the 'Dropdown' link
		Select obj = new Select(driver.findElement(By.id("dropdown")));//Create a object of the Select class
		obj.selectByVisibleText("Option 2");//Select by visible text
	}
	
	@Test
	public void selectItemByIndex(){
		driver.findElement(By.linkText("Dropdown")).click();//Click on the 'Dropdown' link
		Select obj = new Select(driver.findElement(By.id("dropdown")));//Create a object of the Select class
		obj.selectByIndex(1);////Select by index
	}
}
