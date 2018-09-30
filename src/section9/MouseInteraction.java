package section9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class MouseInteraction {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "/Users/selenium/Documents/chromedriver");
		WebDriver driver = new ChromeDriver ();
		
		driver.get("https://www.amazon.com/");
		
	
		
		Actions a= new Actions(driver);
		
	a.moveToElement(	driver.findElement(By.xpath("//*[@id='nav-link-shopall']/span[2]"))).build().perform();
	
	//*[@id='nav-link-shopall']/span[2]
		
		//driver.findElement(By.xpath("//*[@id='nav-link-accountList']"));
	
		
		
		Thread.sleep(3000L);
		
		driver.quit();
		
	}

}
