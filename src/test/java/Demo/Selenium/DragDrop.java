package Demo.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class DragDrop {
	public static void main(String args[]) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "c:/ChromeDriver/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://formy-project.herokuapp.com/dragdrop");
		WebElement img=driver.findElement(By.id("image"));
		WebElement dra=driver.findElement(By.id("box"));
		Actions act=new Actions(driver);
		Thread.sleep(2000);
		act.dragAndDrop(img, dra).build().perform();
		Thread.sleep(2000);
		
		driver.quit();
	}
}
