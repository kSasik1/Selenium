package Demo.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radiobtn {
	public static void main(String args[])throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver", "c:/ChromeDriver/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://formy-project.herokuapp.com/radiobutton");
	WebElement R1=driver.findElement(By.id("radio-button-1"));
	R1.click();
	Thread.sleep(2000);
	WebElement R2=driver.findElement(By.cssSelector("input[value='option2']"));
	R2.click();
	Thread.sleep(2000);
	WebElement R3=driver.findElement(By.xpath("/html/body/div/div[3]/input"));
	R3.click();
	Thread.sleep(2000);
	driver.quit();
	


}
	}
