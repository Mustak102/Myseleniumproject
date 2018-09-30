package Section10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ebaylinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "/Users/selenium/Documents/chromedriver");
		WebDriver driver = new ChromeDriver ();
		
		driver.get("https://www.ebay.com/");
		
		String Beforeclicking;
				
			System.out.println(driver.getTitle());
		
		Beforeclicking = driver.getTitle();
		
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		//*[@id='glbfooter']
		
		WebElement footer = driver.findElement(By.xpath("//*[@id='glbfooter']"));
		
		System.out.println(footer.findElements(By.tagName("a")).size());
		
		for ( int i = 0; i <footer.findElements(By.tagName("a")).size();i++) 
		{
			
		if (footer.findElements(By.tagName("a")).get(i).getText().contains("Site map"))
		{
			footer.findElements(By.tagName("a")).get(i).click();
		break;
		}}
		String Afterclicking; 
		
		System.out.println(driver.getTitle());
		Afterclicking = driver.getTitle();
		
		if (Afterclicking != Beforeclicking ) {
			
			
			
			System.out.println("Title change Pass");
			
			
		}	else {
				
				System.out.println("Title did not change Fail");
				
				
			}
				
				
		}
	
	
	}
	

		
	

