import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Chromebrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "/Users/selenium/Documents/chromedriver");
		WebDriver driver = new ChromeDriver ();

		// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("http://www.facebook.com/");
		
		//System.out.println(driver.getTitle());
		//System.out.println(driver.getPageSource());
		//System.out.println(driver.getCurrentUrl());
		//*[@id="email"]
		
		driver.findElement(By.xpath("//*[@class='inputtext']")).sendKeys("testselenium123452017@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Chhayarun8");
		
		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//*[@id='u_0_2']
		//*[@id="u_0_5"]
		driver.findElement(By.xpath("//*[@id='u_0_2']")).click();
		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		driver.switchTo().alert().accept();
		
		// clicking on element/ link using  Linktext 
		// driver.findElement(By.linkText("Forgot account?")).click();
		
		// clicking on element/ link using  partial  Linktext 
	//	driver.findElement(By.partialLinkText("Forgot")).click();
	//	driver.findElement(By.id("loginbutton")).click();
		
	//	Alert alert = driver.switchTo().alert();
	//	alert.accept();
	//	driver.switchTo().alert();
		
	//	driver.findElement(By.id("logoutMenu")).click();
		
		//userNavigationLabel
		
		

}
}
