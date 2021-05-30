package testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestKeyBoardActions {

	public static void main(String[] args) {
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.name("q")).sendKeys("selenium");//+Keys.ENTER);
		
		Actions action = new Actions(driver);
		//action.sendKeys(Keys.ENTER).perform();
		
		driver.findElement(By.xpath("/html/body/div[1]/div[2]")).click();
		
		action.sendKeys(Keys.chord(Keys.CONTROL+"a")).perform();
		action.sendKeys(Keys.chord(Keys.CONTROL+"c")).perform();
		
		driver.findElement(By.name("q")).click();
		action.sendKeys(Keys.chord(Keys.CONTROL+"v")).perform();
		
		System.out.println("Copy paste done");

	}

}
