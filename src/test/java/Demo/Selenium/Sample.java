package Demo.Selenium;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {
	public static void main(String args[]) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://moodle.kluniversity.in/login/index.php");
		WebElement element = driver.findElement(By.id("username"));
		element.sendKeys("190030786");
		
		WebElement ele=driver.findElement(By.id("password"));
		ele.sendKeys("Chaitu@123");
		element.submit();
		Thread.sleep(2000);
		driver.quit();
		
		
		
	}
}
