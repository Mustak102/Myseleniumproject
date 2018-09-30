package TestNG;



import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class TestNGBasics {
	WebDriver driver ; 
	
	//@BeforeSuite, @BeforeTest, @BeforeClass are pre-conditions 
	//@AfterSuite, @AfterTest, @AfterClass are pre-conditions 
	
	@BeforeSuite 
	
	public void Beforesuite ( ) {
		
		System.out.println("Beforesuite");
	
		
		
	}
	@BeforeTest 
	
	public void beforetest () {
	
		System.out.println("beforetest");
		
		
	}
	@BeforeClass 
	
	public void beforeClass () {
		System.out.println("beforeClass");
		
	}
	
	@BeforeMethod
	public void beforeTest( ) {
		System.out.println("beforetest");
		
	}
	
	@Test 
	
	public void testfirst() {
		System.out.println("testfirst");
		
	}
	
	@AfterMethod 
	public void aftermethod ()  {
		
		System.out.println("aftermethod");
		
	}
	
	@AfterClass
	
	public void afterclass () {
		System.out.println("afterclass");
	}
	
	@AfterTest 
	
	public void aftertest () {
		System.out.println("aftertest");
		
	}
	

}
