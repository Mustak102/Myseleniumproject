import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "/Users/selenium/Documents/chromedriver");
		WebDriver driver = new ChromeDriver ();
		
		driver.get("https://login.salesforce.com/");

	//	driver.findElement(By.cssSelector("#username")).sendKeys("mustak");
		
		driver.findElement(By.cssSelector("input[class='input r4 wide mb16 mt8 username']")).sendKeys("mustak");
		
		driver.findElement(By.cssSelector("input[id='password']")).sendKeys("12345");
		driver.findElement(By.cssSelector("input[name='Login']")).click();

	}

}
