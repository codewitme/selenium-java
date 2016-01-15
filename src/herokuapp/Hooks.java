package herokuapp;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Hooks {
	static WebDriver driver;
	@Before
	public void beforeTest(){
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://the-internet.herokuapp.com/");
		
	}
	@After
	public void afterTest(){
		System.out.println("AfterTest");
		driver.close();
		driver.quit();
	}

}
