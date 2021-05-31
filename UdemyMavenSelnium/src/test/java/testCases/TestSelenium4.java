package testCases;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
//import org.openqa.selenium.WindowType;
public class TestSelenium4 {

	public static void main(String[] args) throws IOException {
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		/*	driver.switchTo().newWindow(WindowType.TAB);
			driver.navigate().to("https://www.crmpro.com");
	*/
			WebElement logo= driver.findElement(By.xpath("/html/body/div[1]/div[2]/div"));
					File file=((TakesScreenshot)logo).getScreenshotAs(OutputType.FILE);
					File destFile = new File("C:\\Users\\DURGA\\Desktop\\Udemy\\elmscreeshot.jpg");
					FileUtils.copyFile(file,destFile);
	}
	

}
