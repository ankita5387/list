package workingwithlist;

import java.time.Duration;
import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class categorylist {
	WebDriver driver;
	@BeforeTest
public void launchbrowser()
{
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
	
	
}
	@Test
	public void bestsellerlist() throws InterruptedException 	
	{
		driver.get("http://122.170.14.195:8080/uth/gadgetsgallery/catalog/");
		WebElement bestseller=driver.findElement(By.xpath("//*[@id=\"left_sidebar\"]/div[1]/div[2]"));
	List<WebElement> catlinks=bestseller.findElements(By.tagName("a"));
		 
		 for(int count =0;count<catlinks.size();count++)
		 {
			 System.out.println(catlinks.get(count).getText());
			 catlinks.get(count).click();
			 Thread.sleep(1000);
			 System.out.println(driver.getTitle());
			
			 driver.navigate().back();

			 bestseller=driver.findElement(By.xpath("//*[@id=\"left_sidebar\"]/div[1]/div[2]"));
			 catlinks=bestseller.findElements(By.tagName("a"));
			 
		 }
		
	}
	
	
}
