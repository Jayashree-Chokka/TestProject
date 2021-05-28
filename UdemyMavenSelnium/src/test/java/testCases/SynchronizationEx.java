package testCases;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SynchronizationEx {

	public static void main(String[] args) {
		
		
		WebDriver driver;
		
		WebDriverManager.chromedriver().setup();
		//WebDriverManager.firefoxdriver().setup();

		 driver = new ChromeDriver();
		 driver.get("https://www.facebook.com");
		 
		 driver.findElement(By.id("email")).sendKeys("JayaMs");
		 driver.findElement(By.id("pass")).sendKeys("ABS");
         driver.findElement(By.name("login")).click();
         
         //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
         
         /*WebDriverWait wait = new WebDriverWait(driver, 10);
         wait.until(ExpectedConditions.presenceOfElementLocated(By.id("pass")));
         wait.until(ExpectedConditions.invisibilityOfElementLocated(By.name("login")));
         */
         
         
         Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
        		.withTimeout(10, TimeUnit.SECONDS)
        		.pollingEvery(5, TimeUnit.SECONDS)
        		.ignoring(NoSuchElementException.class);
         
         
         
       /*  Wait<WebDriver> wait1 = new FluentWait<WebDriver>(driver)
        		
        		.withMessage("Fluent wait")
        		.pollingEvery(Duration.ofSeconds(10))
        		.ignoring(NoSuchElementException.class);
         */
         System.out.println("Login clicked");
		
		

	}

}
