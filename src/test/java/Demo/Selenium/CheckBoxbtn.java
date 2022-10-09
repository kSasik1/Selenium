package Demo.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxbtn {
public static void main(String args[]) throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver", "c:/ChromeDriver/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://formy-project.herokuapp.com/checkbox");
	WebElement C1= driver.findElement(By.id("checkbox-1"));
	C1.click();
	Thread.sleep(2000);
	
	WebElement C2=driver.findElement(By.cssSelector("input[value='checkbox-2']"));
	C2.click();
	Thread.sleep(2000);
	
	WebElement C3=driver.findElement(By.xpath("/html/body/div/div[3]/div/div/input"));
	C3.click();
	Thread.sleep(2000);
	driver.quit();
	
	
}
}
