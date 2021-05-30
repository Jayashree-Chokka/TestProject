package testCases;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestTabsAndPopups {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://www.hdfcbank.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		System.out.println("----Generating windows id from 1st window----");
		Set<String> windows  = driver.getWindowHandles();
		Iterator<String> iterator = windows.iterator();
		 String first_window = iterator.next();
		System.out.println(first_window);
		//1st window
		driver.findElement(By.xpath("//a[contains(text(),'Locate us')]")).click();
		
		
		/*int x= 100;
		 x =200;
		*/
		//2nd window
		System.out.println("----Generating windows id from 2nd window----");
		 windows  = driver.getWindowHandles();
		 iterator = windows.iterator();
		
		System.out.println(iterator.next());// 1st window
		String second_window = iterator.next();
		System.out.println(second_window);//2nd window
		
		driver.switchTo().window(second_window);
		driver.findElement(By.xpath("//span[@class='facebook']")).click();
		
		//3rd window
		System.out.println("----Generating windows id from 2nd window----");
		 windows  = driver.getWindowHandles();
		 iterator = windows.iterator();
		
		System.out.println(iterator.next());//1st window
		System.out.println(iterator.next());//2nd window
		String third_window  = iterator.next();
		System.out.println(third_window);
		
		/*while(iterator.hasNext()) {
			iterator.next();
		}*/
		driver.switchTo().window(third_window);
		System.out.println(driver.getTitle().contains("HDFC Bank"));
		
		//driver.close();//3rd window
		
		driver.switchTo().window(first_window);
		
		driver.close();
		//driver.quit();//CLosed all window
		
		

	}

}
