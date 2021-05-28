package testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment2 {

	public static void main(String[] args) {

		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://qa.way2automation.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Jayashree");

		WebElement elm = driver.findElement(By.xpath("(//input[@value='Submit'])[2]"));
		// input[@value='Submit'])[1]
		// *[@id=\"load_form\"]/div[1]/div[2]/input
		System.out.println(elm.isDisplayed());

		driver.findElement(By.xpath("//input[@name='city']")).sendKeys("Bangalore");
		driver.findElement(By.xpath("(//input[@name='username'])[2]")).sendKeys("jay");

		/*WebDriverWait wait = new WebDriverWait(driver, 30);

		wait.until(ExpectedConditions.elementToBeClickable(elm));
*/		elm.click();

		System.out.println("Clicked on Submit");

		// driver.close();

	}

}
