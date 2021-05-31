package testCases;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment6_Naukri {

	public static void main(String[] args) {
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		System.out.println("----Generating windows id from 1st window----");

		Set<String> windows = driver.getWindowHandles();
		Iterator<String> iterate = windows.iterator();
		String first_window = iterate.next();// 1st window or main window

		System.out.println(first_window);

		System.out.println("----Generating windows id from 2nd window----");
		windows = driver.getWindowHandles();
		iterate = windows.iterator();

		System.out.println(iterate.next());// 1st window
		String second_window = iterate.next();
		System.out.println(second_window);// 2nd window

		driver.switchTo().window(second_window);

		System.out.println(driver.getTitle());
		System.out.println(driver.getTitle().contains("Ice"));
		
		System.out.println("----Generating windows id from 3rd window----");
		windows = driver.getWindowHandles();
		iterate = windows.iterator();

		System.out.println(iterate.next());// 1st window
		System.out.println(iterate.next());
		
		String third_window = iterate.next();
		
		System.out.println(third_window);
		driver.switchTo().window(third_window);
		System.out.println(driver.getTitle());
		System.out.println(driver.getTitle().contains("Sopra"));
		
		//driver.close();
		
		driver.quit();
		


	}

}
