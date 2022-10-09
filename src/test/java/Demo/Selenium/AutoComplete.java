package Demo.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AutoComplete {
	public static void main(String args[]) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "c:/ChromeDriver/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://formy-project.herokuapp.com/scroll");
		WebElement name = driver.findElement(By.id("name"));
		Actions act=new Actions(driver);
		act.moveToElement(name);
		name.sendKeys("Sasi");
		Thread.sleep(2000);
		WebElement date= driver.findElement(By.id("date"));
		//act.moveToElement(date);
		date.sendKeys("03/10/22");
		Thread.sleep(2000);
		
		driver.quit();
	}

}
