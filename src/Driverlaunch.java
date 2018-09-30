import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Driverlaunch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "/Users/selenium/Documents/geckodriver");
		WebDriver driver = new FirefoxDriver ();
		
		driver.get("https://www.youtube.com/watch?v=_LNuWPWMiQg");
		
		driver.quit();

	}

}
