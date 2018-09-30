import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Customizexpath1 {
	
	// find elements using xpath siblings method 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "/Users/selenium/Documents/chromedriver");
		WebDriver driver = new ChromeDriver ();
		
		driver.get("http://www.Google.com/");
		
		
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("Mustakahmed112@yahoo.com");
		
		// failure in below step 
	//	driver.findElement(By.xpath("//*[@id=\"email\"]/td[1]/following-sibling::td[2]")).sendKeys("Chhayarun8");

		

	}

}
