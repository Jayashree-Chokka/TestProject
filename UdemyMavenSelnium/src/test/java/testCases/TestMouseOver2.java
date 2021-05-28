package testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestMouseOver2 {

	public static void main(String[] args) {
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//CLose the login popup
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		//Mouse over at Appliances
		
		WebElement elm1 = driver.findElement(By.xpath("//div[contains(text(),'Appliances')]"));
		
		Actions action1 = new Actions(driver);
		
		action1.moveToElement(elm1).perform();
		
		System.out.println("Appliances displayed");
		//Mouse over on Washing machine
		WebElement elm2 = driver.findElement(By.xpath("//a[normalize-space()='Washing Machines']"));
		
		action1.moveToElement(elm2).perform();
		
		System.out.println("Washing machines displayed");
		
		driver.findElement(By.linkText("New Launches")).click();
		
		System.out.println("New Launches clicked");

		
	}

}
