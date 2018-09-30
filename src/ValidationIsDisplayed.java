import org.apache.http.util.Asserts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidationIsDisplayed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
System.setProperty("webdriver.chrome.driver", "/Users/selenium/Documents/chromedriver");
WebDriver driver = new ChromeDriver ();
driver.get("https://us.makemytrip.com/");
	//System.out.println("Before clicking on Multiciy");
	//results should be true
System.out.println(driver.findElement(By.xpath("//*[@id='top_content']/div[2]/div[2]/div[2]/div[1]/div[7]/span/span[4]/a")).isDisplayed());
   
driver.findElement(By.xpath("//*[@id='trip_type']/label[3]")).click();
System.out.println("After clicking on Multiciy");
	//Results should be false 
System.out.println(driver.findElement(By.xpath("//*[@id='top_content']/div[2]/div[2]/div[2]/div[1]/div[7]/span/span[4]/a")).isDisplayed());
     /* notes Purpose of using Isdisplayed Method to see whether an element is visible mode or not but element/object must be present in the webpage but in  
     if you want to validate the existence object in web page or code base use .size() method 
     Modified / fake xpath for practice ;verify no elements present in webpage */
int count =  driver.findElements(By.xpath("//*[@id='top_content']/div[2]/div[2]/div[2]/div[1]/div[7]/span/span[4]/a")).size();
System.out.println(count);
	// modifying the expath / fake xpath 
int count1 =driver.findElements(By.xpath("//*[@id='top_content']/div[2]/div[2]/div[1]/div[7]/span/span[4]/a")).size();
System.out.println(count1);
	// using Isdisplayed for fake xpath ; should display error 
//driver.findElement(By.xpath("//*[@id='top_content']/div[2]/div[2]/div[1]/div[7]/span/span[4]/a")).isDisplayed();
	//get text method

System.out.println(driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div/div/div[2]/h2[2]")).getText());
	
	
	}

}
