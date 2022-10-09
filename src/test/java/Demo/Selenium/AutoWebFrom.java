package Demo.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AutoWebFrom {
	public static void main(String args[]) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "c:/ChromeDriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://formy-project.herokuapp.com/form");
		driver.findElement(By.id("first-name")).sendKeys("Sasi");
		driver.findElement(By.id("last-name")).sendKeys("Kiran");
		driver.findElement(By.id("job-title")).sendKeys("Intern");
		driver.findElement(By.id("radio-button-3")).click();
		driver.findElement(By.id("checkbox-1")).click();
		driver.findElement(By.cssSelector("option[value='1']")).click();
		driver.findElement(By.id("datepicker")).sendKeys("07/02/2002");
		driver.findElement(By.cssSelector(".btn.btn-lg.btn-primary")).click();
		
		Thread.sleep(2000);
		
		//Identifying the Confirmation the behavior of the test
		//WebDriverWait wait= new WebDriverWait(driver, 10);		
		
		
		
		driver.quit();
		
	}

}
