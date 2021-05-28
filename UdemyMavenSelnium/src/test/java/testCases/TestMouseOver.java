package testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestMouseOver {

	public static void main(String[] args) {

		
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.name("q")).sendKeys("Way2Automation");

		driver.findElement(By.xpath("//div[2]/center/input[1]")).click();

		driver.findElement(By.xpath("(//h3[@class='LC20lb DKV0Md'])[1]")).click();
		
		WebElement elm = driver.findElement(By.xpath("//a[contains(text(),'Resources')]"));
		//ul[@role='menu'])[8]
		
		Actions menu = new Actions(driver);
		
		menu.moveToElement(elm).perform();
		
		driver.findElement(By.linkText("Practice site 1")).click();
		
		
		
	}

}
