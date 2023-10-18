package excercise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class menulinks {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://122.170.14.195:8080/uth/gadgetsgallery/catalog/");

		WebElement menu = driver.findElement(By.xpath("//*[@id=\"top_menu\"]"));
		List<WebElement> mainMenu = menu.findElements(By.tagName("a"));

		for (int count = 0; count < mainMenu.size(); count++) {

			mainMenu.get(count).click();
			Thread.sleep(1000);
			System.out.println(driver.getTitle()+"->"+driver.getCurrentUrl());

			driver.navigate().back();
			Thread.sleep(1000);

			menu = driver.findElement(By.xpath("//*[@id=\"top_menu\"]"));
			mainMenu = menu.findElements(By.tagName("a"));
		}
	}
}
