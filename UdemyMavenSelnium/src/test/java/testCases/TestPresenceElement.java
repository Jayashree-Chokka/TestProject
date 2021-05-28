package testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestPresenceElement {
	public static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.wikipedia.org");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		// isDisplayed - checks the visibilty of the Element
		// if element not hidden returns true otherwise it returns false

		System.out.println(driver.findElement(By.xpath("//*[@id=\"js-link-box-en\"]/strong")).isDisplayed());
		System.out.println(isElementPresent(By.id("//*[@id=\"js-link-box-en\"]/strong1235")));
		System.out.println(driver.findElement(By.id("searchLanguage")).isDisplayed());

	}

	public static boolean isElementPresent(By by) {
		
		/*try {
			driver.findElement(By.xpath(by));
			return true;
		} catch (Exception e) {
		return false;
		}*/
		
		
		int size = driver.findElements(by).size();
		if (size == 0) {
			return false;
		}
		else return true;
	}

}
