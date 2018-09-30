package explicitimplicitwait;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ImplictiExplictwait {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/selenium/Documents/chromedriver");
		WebDriver driver = new ChromeDriver ();
		
	//	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	
	driver.get("https://alaskatrips.poweredbygps.com/g/pt/hotels?MDPCID=ALASKA-US.TPS.BRAND.hotels.HOTEL");
	
	
	driver.findElement(By.xpath("//*[@id='H-destination']")).sendKeys("NYC");
	
	//*[@id='H-searchButtonExt1']
	driver.findElement(By.xpath("//*[@id='H-searchButtonExt1']")).click();
	
	Thread.sleep(5000L);
	
//	WebDriverWait d = new WebDriverWait (driver, 20);
// below is the 	Wrong way to "Driver.findelemnets not necessary when used explicit wati 
	//d.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[@id='1623381']/div[2]/div/a"))));
	
	WebDriverWait d=new WebDriverWait(driver,20);
     // below is the correct way starts from "By.xpath
	d.until(ExpectedConditions.elementToBeClickable((By.xpath("//*[@id='1623381']/div[2]/div/a"))));
	
	driver.findElement(By.xpath("//*[@id='1623381']/div[2]/div/a")).click();
	
	

	}

}
