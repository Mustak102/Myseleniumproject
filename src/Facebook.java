import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		

		System.setProperty("webdriver.chrome.driver", "/Users/selenium/Documents/chromedriver");
		WebDriver driver = new ChromeDriver ();

		// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("http://www.facebook.com/");
		
		Thread.sleep(5000);
		
		//*[@aria-label="Log In"]
		
		driver.findElement(By.xpath("//*[@aria-label='Log In']")).click();

	}

}
