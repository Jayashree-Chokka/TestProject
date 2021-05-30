package testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestSliderAndResizable_Frames {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		
		driver.findElement(By.linkText("Slider")).click();
		
		//SLider present in frame
		driver.switchTo().frame(0);
		
		WebElement elm = driver.findElement(By.xpath("//*[@id=\"slider\"]/span"));
		
		Dimension elm2 = driver.findElement(By.xpath("//div[@id='slider']")).getSize();
		int length = elm2.width/2;
		Actions action = new Actions(driver);
		
		action.dragAndDropBy(elm, length, 0).perform();
		
		System.out.println("Slider moved");
		
		//Switch to main frame/ content to access other elemnts
	    driver.switchTo().defaultContent();
	    System.out.println("Switched to default content");
		
	    
	   
		driver.findElement(By.linkText("Resizable")).click();
		
		 driver.switchTo().frame(0);
		WebElement resizable = driver.findElement(By.xpath("//div[@id='resizable']/div[3]"));
		
		action.dragAndDropBy(resizable, 200, 300).perform();
		
		driver.switchTo().parentFrame();
		System.out.println("Switched to parent frame");
		
		driver.findElement(By.linkText("Droppable")).click();
		System.out.println("Clicked on Droppable link");
		
		 driver.switchTo().frame(0);
		  WebElement drag = driver.findElement(By.id("draggable"));
		  WebElement drop = driver.findElement(By.id("droppable"));
		  
		  action.dragAndDrop(drag, drop).perform();
		  System.out.println("Element dropped");
	}

}
