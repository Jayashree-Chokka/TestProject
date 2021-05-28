package testCases;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCheckBoxes {

	public static void main(String[] args) {

		WebDriver driver;
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://www.tizag.com/htmlT/htmlcheckboxes.php");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//driver.findElement(By.xpath("//div[4]/input[1]")).click();
		//driver.findElement(By.xpath("//div[4]/input[2]")).click();
		
		/*for(int i=1; i<=4; i++) {
			
			driver.findElement(By.xpath("//div[4]/input["+i+"]")).click();
		}*/
		
		WebElement block = driver.findElement(By.xpath("//tr/td/div[4]"));
		List<WebElement> listcheck = block.findElements(By.name("sports"));
		
		System.out.println("Count of checkboxes are : "+listcheck.size());
		
		for(WebElement list : listcheck) {
			
			list.click();
			
			
		}
	}

}
