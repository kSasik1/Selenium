package Demo.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExec {
	public static void main(String args[]) throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver", "c:/ChromeDriver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://formy-project.herokuapp.com/modal");
		WebElement N1= driver.findElement(By.id("modal-button"));
		N1.click();
		WebElement N2=driver.findElement(By.id("close-button"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		Thread.sleep(2000);
		js.executeScript("arguments[0].click();",N2);
		driver.quit();
		
		
	}
}
