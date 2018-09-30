import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingJavaAlertPopup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// only for java Alert not for web based alert 
		
		System.setProperty("webdriver.chrome.driver", "/Users/selenium/Documents/chromedriver");
		WebDriver driver = new ChromeDriver ();
		
		driver.get("http://www.tizag.com/javascriptT/javascriptalert.php");
		
		
		driver.findElement(By.xpath("/html/body/table[3]/tbody/tr[1]/td[2]/table/tbody/tr/td/div[4]/form/input")).click();
		
		System.out.println(driver.switchTo().alert().getText());
		
		driver.switchTo().alert().accept();
		
		
		
	

	}

}
