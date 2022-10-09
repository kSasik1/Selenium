package Demo.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchWindow {
	public static void main(String args[]) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "c:/ChromeDriver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://formy-project.herokuapp.com/switch-window");
		WebElement N1=driver.findElement(By.id("new-tab-button"));
		N1.click();
		String oH=driver.getWindowHandle();
		for(String Oh: driver.getWindowHandles()) {
			driver.switchTo().window(Oh);
		}
		Thread.sleep(2000);
		driver.switchTo().window(oH);
		Thread.sleep(2000);
		
		driver.quit();
	}
}
