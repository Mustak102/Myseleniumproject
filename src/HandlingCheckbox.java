import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingCheckbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// checkbox do not have a special class like dropdown 
		

		System.setProperty("webdriver.chrome.driver", "/Users/selenium/Documents/chromedriver");
		WebDriver driver = new ChromeDriver ();
		
		driver.get("https://www.expedia.com/");
		
		//*[@id='partialHotelBooking-hp-package']
		//to verify whether by default checkbox is selected; Expected result should be false 
		System.out.println(driver.findElement(By.xpath("//*[@id='partialHotelBooking-hp-package']")).isSelected());
		// clicking on Checkbox 
		driver.findElement(By.xpath("//*[@id='partialHotelBooking-hp-package']")).click();
		//After clicking on checkbox; verifying the checkbox selection  
		System.out.println(driver.findElement(By.xpath("//*[@id='partialHotelBooking-hp-package']")).isSelected()); 
	}

}