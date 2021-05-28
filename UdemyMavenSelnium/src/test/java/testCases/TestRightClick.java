package testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestRightClick {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://deluxe-menu.com/popup-mode-sample.html");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement img  = driver.findElement(By.xpath("//img[@src='data-samples/images/popup_pic.gif']"));
	    Actions action  = new Actions(driver);
	    action.contextClick(img).perform();
	    System.out.println("Right click performed");
	    
	    WebElement elm1 = driver.findElement(By.xpath("//td[contains(text(),'Product Info')]"));
	  //td[contains(text(),'Product Info')]
	    WebElement elm2 = driver.findElement(By.xpath("//td[@id='dm2m2i1tdT']"));
	    		
	    action.moveToElement(elm1).perform();
	    Thread.sleep(3000);
	    action.moveToElement(elm2).perform();
	    
	    driver.findElement(By.xpath("//td[@id='dm2m3i1tdT']")).click();
	    
	    System.out.println("How to SetUP clicked ");
	    
	    
	
	}

}
