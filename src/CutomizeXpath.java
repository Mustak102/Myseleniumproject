import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CutomizeXpath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "/Users/selenium/Documents/chromedriver");
		WebDriver driver = new ChromeDriver ();
		
		driver.get("http://www.facebook.com/");
		
		//driver.findElement(By.xpath("//input[@name='email']")).sendKeys("mustakahmed112@yahoo.com");
		
	Thread.sleep(5000);
		
		driver.findElement(By.xpath("//*[@name='firstname']")).sendKeys("Mustak");
	//	Thread.sleep(5000);
	//	driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("Chhayarun8");
		
	//	Thread.sleep(5000);
	//	driver.findElement(By.xpath("//*[@type='submit']")).click();
		
		//*[@id="u_0_u"]
		Thread.sleep(4000);
		driver.close();
	
	}

}
