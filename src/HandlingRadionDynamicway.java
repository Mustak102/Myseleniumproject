import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingRadionDynamicway {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/selenium/Documents/chromedriver");
		WebDriver driver = new ChromeDriver ();
		
		driver.get("http://www.echoecho.com/htmlforms10.htm");
		
	int count =(driver.findElements(By.xpath("//input[@name='group1']")).size());
	
	for (int i=0; i< count; i++)

	{
	String product =	driver.findElements(By.xpath("//input[@name='group1']")).get(i).getAttribute("value");
		
		if (product.equals("Cheese"));
		
		{
	
	driver.findElements(By.xpath("//input[@name='group1']")).get(i).click();
	
	
	}
}
}
}



