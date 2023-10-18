package excercise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class selectmotorola {
public static void main(String[] args) {
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://122.170.14.195:8080/uth/gadgetsgallery/catalog/");

		WebElement manufacturers = driver.findElement(By.name("manufacturers_id"));
		List<WebElement> manuValues = manufacturers.findElements(By.tagName("option"));
		
		for (int count = 1; count < manuValues.size(); count++) {

			String manuText = manuValues.get(count).getText();

			if (manuText.equalsIgnoreCase("Sony")) {

				manuValues.get(count).click();
				
				System.out.println(driver.getTitle()+"->"+driver.getCurrentUrl());
				break;
			}

		}

	}

}








/*package exercises;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectSamsungManufacturer {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost/uth/gadgetsgallery/catalog/index.php");

		WebElement manufacturers = driver.findElement(By.name("manufacturers_id"));
		List<WebElement> manuValues = manufacturers.findElements(By.tagName("option"));

		for (int count = 1; count < manuValues.size(); count++) {

			String manuText = manuValues.get(count).getText();

			if (manuText.equalsIgnoreCase("Samsung")) {

				manuValues.get(count).click();
				
				System.out.println(driver.getTitle()+"->"+driver.getCurrentUrl());
				break;
			}

		}

	}

}*/