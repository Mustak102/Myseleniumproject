import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomizeXpath3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//	find elements using xpath traverse back to parent method 
		
		//*[@id="email"]
		
		System.setProperty("webdriver.chrome.driver", "/Users/selenium/Documents/chromedriver");
		WebDriver driver = new ChromeDriver ();
		
		driver.get("http://www.facebook.com/");
		
		// clicking on log in buttton
		// success 
		
		driver.findElement(By.xpath("//*[text()='Log In']/parent::label")).click();
		
	}

}
