package testCases;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestJavaScript_ScreenshotTimestamp {
	public static WebDriver  driver;
	public static void main(String[] args) throws IOException   {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_submit_get");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.switchTo().frame("iframeResult");
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("myFunction()");
		System.out.println("Clicked on Try it");
		WebElement elm = driver.findElement(By.xpath("//button[@onclick='myFunction()']"));
		WebElement elm2 = driver.findElement(By.xpath("//input[@id='mySubmit']"));
		js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", elm2);
		js.executeScript("arguments[0].setAttribute('style', 'background: blue; border: 2px solid red;');", elm);
		captureScreenshot();
		
	} 
	public static void captureScreenshot() throws IOException {
		
		Date d = new Date();
		String filename = d.toString().replace(":", "_").replace(" ", "_")+".jpg";
		TakesScreenshot img = (TakesScreenshot)driver;
		File srcfile = img.getScreenshotAs(OutputType.FILE);
		
		File destfile = new File("./Screenshots/"+filename);
		FileUtils.copyFile(srcfile, destfile);
		System.out.println("Image Captured ");
		}
	
	
}
