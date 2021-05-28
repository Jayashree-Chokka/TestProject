package testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment3_AddNUmCapta {
	
	String elm= null;
    static int sum;
	public static void main(String[] args) {

		WebDriver driver;
		/*WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();*/
		
		WebDriverManager.firefoxdriver().ignoreDriverVersions("88.0.1").setup();
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://timesofindia.indiatimes.com/poll.cms");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println(driver.findElement(By.xpath("//span[@id='mathq2']")).isDisplayed());
		String elm = driver.findElement(By.xpath("//span[@id='mathq2']")).getText();
        String[] s = elm.split(" ");
		
		for (String s1 : s) {
			System.out.print(s1);
		}
		
		if(s[1].equals("+")) {
				
				int  b = Integer.parseInt(s[0]);
				int c = Integer.parseInt(s[2]);
				 sum = b+c;
				
				}
			System.out.print(sum);
		String key = Integer.toString(sum);
		
	  driver.findElement(By.xpath("//*[@id=\"mathuserans2\"]")).sendKeys(key);
	}

}
