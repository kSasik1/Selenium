package Demo.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDown {
	public static void main(String args[]) throws InterruptedException
	
	{
		System.setProperty("webdriver.chrome.driver", "c:/ChromeDriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://formy-project.herokuapp.com/dropdown");
		WebElement DD= driver.findElement(By.id("dropdownMenuButton"));
		DD.click();
		Thread.sleep(2000);		
		WebElement O=driver.findElement(By.id("autocomplete"));
		O.click();
		Thread.sleep(2000);
		driver.quit();
	}

}
