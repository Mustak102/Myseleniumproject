package TestNG;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTitleTest {
	// This is a complete test of GoogleTitletest
	// Using Assert.assertEquals(title, "Google", "Title do no match");  we verified the googtitlepage 
	// Like expected and actual results 

	
	WebDriver driver; 
	@BeforeMethod
	
	public void BeforeMethod ( ) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/selenium/Documents/chromedriver");
		driver = new ChromeDriver ();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("http://www.Google.com/");
	}
	
	@Test()
	public void Googletitletest () {	
		String title = driver.getTitle();
		System.out.println(title);
		
		Assert.assertEquals(title, "Google", "Title do no match");
	}
	

	@Test()
	public void GoogleLogotest () {
		boolean b = driver.findElement(By.xpath("//*[@id='hplogo']")).isDisplayed(); 
		System.out.println(b);
		Assert.assertTrue(b);
		//b should be true thats the expected result. otherwise testng report it will show as test failed
		
	}
	
    @AfterMethod
	
	public void tearDown  () {
		
		driver.quit();
}


}
