package Demo.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {
	public static void main(String args[]) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "c:/ChromeDriver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://formy-project.herokuapp.com/fileupload");
		WebElement FU=driver.findElement(By.id("file-upload-field"));
		FU.sendKeys("C:/Users/sasikiraDownloads/Ex_Files_Cucumber_EssT/Exercise Files/Ch03/03_03/End/cucumbercourse/pom.xml");
		Thread.sleep(2000);
		driver.quit();
		
	}
}
