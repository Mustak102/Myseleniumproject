import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "/Users/selenium/Documents/chromedriver");
		WebDriver driver = new ChromeDriver ();
		
		driver.get("https://www.expedia.com/");
		
		  Select Passengers = new Select(driver.findElement(By.id("package-1-adults-hp-package")));
		Passengers.selectByValue("5");
		//Passengers.selectByIndex(0);
		//Passengers.selectByVisibleText("6");
		
	
	}

}
