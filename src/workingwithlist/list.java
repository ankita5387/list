package workingwithlist;


import java.time.Duration;
import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class list {
	WebDriver driver;
	@BeforeTest
public void launchbrowser()
{
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
	
	
}
	@Test
	public void bestsellerlist()
	{
		driver.get("http://122.170.14.195:8080/uth/gadgetsgallery/catalog/");
		
	List<WebElement> links=driver.findElements(By.tagName("a"));
		 
		 for(int count =0;count<links.size();count++)
		 {
			 System.out.println(links.get(count).getText());
			
		 }
		
	}
	
	
}
