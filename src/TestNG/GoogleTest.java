package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import org.testng.annotations.Test;

public class GoogleTest {

//      (priority=? groups= ?)
//		Priority = Priorities the @test cases by its number 1,2,3 =first , second , third in test case execution order
//		In TestNG report groups help orgranise test cases by group 
//      Creating Testng report at 14:35 min in the     https://www.youtube.com/watch?v=NqN3JNpZZiY	

	
	
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
	
	@Test (priority =2, groups= "title ")
	public void Googletitletest () {	
		String title = driver.getTitle();
		System.out.println(title);
	}

	@Test (priority=3, groups = "Logo")
	public void GoogleLogotest () {
		boolean b = driver.findElement(By.xpath("//*[@id='hplogo']")).isDisplayed(); 
		System.out.println(b);
	}
	
	@Test (priority =1, groups ="Mailbox")
	public void Googlemailtitletest () {
		driver.findElement(By.xpath("//*[@id='gbw']/div/div/div[1]/div[1]/a")).click();
		String title2 = driver.getTitle();
		System.out.println(title2);
	}
	
	@Test (groups="test")
	public void test1 () {
		System.out.println("test1");
	}
	
	@Test (groups="test")
	public void test2 () {
		System.out.println("test2");
	}	
	
	@Test (groups="test")
	public void test3 () {
		System.out.println("test3");
	}
	@AfterMethod
	
	public void aftermethod  () {
		
		driver.quit();
		
	}
}
