package testCases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestDroDown {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver =  new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.wikipedia.org");
		WebElement elm = driver.findElement(By.id("searchLanguage"));
		Select select = new Select(elm);
		//select.selectByVisibleText("Eesti");
		System.out.println("Selected");
		/*List<WebElement> list = select.getOptions();
		int count = 0;
		for(WebElement vars:list) {
			
			count++;
			System.out.println(vars.getText());
			
		}
		System.out.println(count);
	*/
		
		//Alternate code
		
		List<WebElement> allOptions = driver.findElements(By.tagName("option"));
		
		System.out.println("Count of All Options are : "+allOptions.size());
		
		
		
		for (int i=0; i<allOptions.size();i++) {
			
			System.out.println("Values is : "+allOptions.get(i).getAttribute("value")+" -->"+
					"Options are : "+allOptions.get(i).getText());
			//System.out.println(allOptions.get(i).getText());
		}
	}
}
