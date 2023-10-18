package excercise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExtractBestsellerProducts {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://122.170.14.195:8080/uth/gadgetsgallery/catalog/");

		WebElement bestsellers = driver.findElement(By.xpath("//*[@id=\"right_sidebar\"]/div[2]/div[2]"));
		List<WebElement> bestsellerLinks = bestsellers.findElements(By.tagName("a"));

		for (int count = 0; count < bestsellerLinks.size(); count++) 
		{

			bestsellerLinks.get(count).click();

			String title = driver.getTitle();
			String prodName = driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/form/div[1]/h1[2]")).getText();//*[@id=\"content\"]/div[2]/form/div[1]/h1[2]
			String prodPrice = driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/form/div[1]/h1[1]")).getText();//*[@id="content"]/div[2]/form/div[1]/h1[1]

			
			System.out.println(title + "-" + prodName +"-"+prodPrice);

			driver.navigate().back();

			bestsellers = driver.findElement(By.xpath("//*[@id=\"right_sidebar\"]/div[2]/div[2]"));
			bestsellerLinks = bestsellers.findElements(By.tagName("a"));

		}

	}

}