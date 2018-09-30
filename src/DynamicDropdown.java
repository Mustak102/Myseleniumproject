import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class DynamicDropdown {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/selenium/Documents/chromedriver");
		WebDriver driver = new ChromeDriver ();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");

		driver.get("https://www.expedia.com/");
		
		
	//#1    // *[@id='package-departing-hp-package']
	//clicking on departing date
	driver.findElement(By.xpath("//*[@id='package-departing-hp-package']")).click();
	Thread.sleep(10000);
	
//	//*[@id='package-departing-wrapper-hp-package']/div/div/div[2]/table/tbody/tr[5]/td[7]/button
//	//selecting departing date 
	//*[@id='package-departing-wrapper-hp-package']/div/div/div[3]/table/tbody/tr[4]/td[5]/button
	driver.findElement(By.xpath("//*[@id='package-departing-wrapper-hp-package']/div/div/div[2]/table/tbody/tr[5]/td[7]/button")).click();
	Thread.sleep(5000);
//	
//	//#3   clicking on returning date 
//	//*[@id='package-returning-hp-package']	
	driver.findElement(By.xpath("//*[@id='package-returning-hp-package']")).click();
//	Thread.sleep(5000);
//	
//	//#4   Selecting Returning date 
//	//*[@id='package-departing-wrapper-hp-package']/div/div/div[3]/table/tbody/tr[4]/td[5]/button
//	
//	//*[@id='package-returning-wrapper-hp-package']/div/div/div[2]/table/tbody/tr[5]/td[5]/button
	driver.findElement(By.xpath("//*[@id='package-departing-wrapper-hp-package']/div/div/div[3]/table/tbody/tr[4]/td[5]/button/[2]")).click();
	Thread.sleep(5000);
//	
         
	
	driver.quit();
	}

}
