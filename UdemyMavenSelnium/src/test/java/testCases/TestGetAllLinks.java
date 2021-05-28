package testCases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestGetAllLinks {

	public static void main(String[] args) {

		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.wikipedia.org");
		
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		System.out.println(allLinks.size());
	int count = 0;
	
	for( WebElement links:allLinks) {
		
		count++;
		
		System.out.println("links are : "+links.getAttribute("href")+" -->"+links.getText());
		
	}
	System.out.println("Count of all links :  "+count);
	
	
	System.out.println("Printing links from separate div");
	
	WebElement block = driver.findElement(By.xpath("//div[7]/div[3]"));
	
	List<WebElement> divlist = block.findElements(By.tagName("a"));
	System.out.println("Div links are : "+divlist.size());
	for(WebElement list :divlist) {
		
		System.out.println(list.getAttribute("href")+" -->>"+list.getAttribute("class"));
		
	}
	
	
	}
}
