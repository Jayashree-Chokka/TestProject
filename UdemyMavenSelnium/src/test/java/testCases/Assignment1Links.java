package testCases;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment1Links {

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

		List<WebElement> allLinks = driver.findElements(By.tagName("a"));

		System.out.println("Count of all links are : " + allLinks.size());

		for (WebElement links : allLinks) {

			System.out.println(links.getText() + " -->" + links.getAttribute("href"));
		}

	}

}
