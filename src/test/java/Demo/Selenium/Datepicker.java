package Demo.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Datepicker {
	public static void main(String args[]) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","c:/ChromeDriver/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://formy-project.herokuapp.com/datepicker");
		WebElement D1=driver.findElement(By.id("datepicker"));
		D1.sendKeys("07/02/2002");
		Thread.sleep(2000);
		D1.sendKeys(Keys.RETURN);
		driver.quit();
		
		
	}

}
