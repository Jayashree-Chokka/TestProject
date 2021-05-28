package testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBrowserResize {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://google.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Dimension size = driver.manage().window().getSize();
		System.out.println(size);

		Dimension size2 = new Dimension(200, 300);

		driver.manage().window().setSize(size2);
		Thread.sleep(5000);
		Dimension size3 = new Dimension(500, 500);

		driver.manage().window().setSize(size3);
		System.out.println("New window size " + driver.manage().window().getSize());
		
		
		

	}

}
