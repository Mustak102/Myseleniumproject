package Section10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendar {

	public static void main(String[] args) {
		
		
		// lecture 84 to 87
		System.setProperty("webdriver.chrome.driver", "/Users/selenium/Documents/chromedriver");
		WebDriver driver = new ChromeDriver ();
		
		driver.get("https://www.expedia.com/");
		
		//*[@id='package-departing-hp-package']
		
		driver.findElement(By.xpath("//*[@id='package-departing-hp-package']")).click();
		
	
	
		while(driver.findElement(By.xpath("//*[@id='package-departing-wrapper-hp-package']/div/div/div[2]/table/caption")).getText().contains("Apr 2018")) {
		
		driver.findElement(By.xpath("//*[@id='package-departing-wrapper-hp-package']/div/div/button[2]")).click();
		
		}
		int count = driver.findElements(By.className("datepicker-cal-date")).size();
		
		
		for (int i =0 ; i <count ; i++) {
			
	String text = driver.findElements(By.className("datepicker-cal-date")).get(i).getText();
			
			if (text.equalsIgnoreCase("26")){
				driver.findElements(By.className("datepicker-cal-date")).get(i).click();
				break;
				
			}
					
			
		}
			
		
		
		
		
		
		
		
		
	}

}
