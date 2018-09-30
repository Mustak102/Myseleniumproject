*** asserttverification



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class asserttverification {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "/Users/selenium/Documents/chromedriver");
		WebDriver driver = new ChromeDriver ();
		
		driver.get("https://us.makemytrip.com/");
		
		
		//driver.findElement(By.xpath("//*[@id='trip_type']/label[3]")).click();
		
	/*typing departure city 
		
	driver.findElement(By.xpath("//*[@id='top_content']/div[2]/div[2]/div[2]/div[1]/div[5]/div[2]/span[1]/input")).sendKeys("Sylhet, Bangladesh (ZYL)");

	//clicking on date 
	driver.findElement(By.xpath("//*[@id='top_content']/div[2]/div[2]/div[2]/div[1]/div[7]/span/span[2]/a/span[1]")).click();
	
	//selecting date 
	driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[1]/table/tbody/tr[4]/td[6]/a")).click(); */
	}

}

*** Browserlaunch

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browserlaunch {
    
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        System.setProperty("webdriver.chrome.driver", "/Users/selenium/Documents/chromedriver");
        WebDriver driver = new ChromeDriver ();
        
        // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        
        driver.get("http://www.expedia.com/");
        driver.findElement(By.xpath("//*[@id='package-departing-hp-package']")).click();
        //*[@id='package-departing-hp-package']
    }
    
}



***class



