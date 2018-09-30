import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Helloworld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.gecko.driver", "/Users/selenium/Documents/geckodriver");
		WebDriver driver = new FirefoxDriver ();
		
		driver.get("http://www.qaclickacademy.com/");
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getPageSource());
		System.out.println(driver.getCurrentUrl());
		//driver.quit(); 
	}

}
