package testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment3 {
	String elm= null;
    static int sum;
	public static void main(String[] args) {

		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://timesofindia.indiatimes.com/poll.cms");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println(driver.findElement(By.xpath("//span[@id='mathq2']")).isDisplayed());
		String elm = driver.findElement(By.xpath("//span[@id='mathq2']")).getText();
        String[] s = elm.split(" ");
		
		for (String s1 : s) {
			System.out.println(s1);
		}
		Assignment3 obj = new Assignment3();
		obj.addStrings(s);
		//System.out.println(s);
		
	}
	
	public static void addStrings(String[] a) {
		
		
		 Integer[] intarray=new Integer[a.length];
		 /*   int i=0;
		    for(String str:a){
		        intarray[i]=Integer.parseInt(str);//Exception in this line
		        System.out.println(i);
		        i++;
		    }*/
		  
		if(a[1].equals("+")) {
			
			int  b = Integer.parseInt(a[0]);
			int c = Integer.parseInt(a[2]);
			 sum = b+c;
			
			//int sum = (Integer) (a[0]+a[2]);
			}
		System.out.println(sum);
		//return sum;
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		// System.out.println(elm.getText());
		/*char ch[] = elm.getText().toCharArray();
		char a = ch[0];
		char b =  ch[4];
		char c = ch[2];
		char d = ch[6];
		int count = 0;
       System.out.println(a+"->"+b+"->"+c+" ->"+d);
		for (int i = 0; i < ch.length; i++) {
			count++;
			//System.out.println(ch[i]);
			//int sum = (int)ch[]
			// sum = ch[i]
		}
     System.out.println("Count of elements : "+count);
     
     char sum = (char) (a+b);
     int sum2 = (int)sum;
     System.out.println(sum2);
//driver.findElement(By.xpath("//*[@id=\"mathuserans2\"]")).sendKeys(sum);
     
    String elm1 = driver.findElement(By.xpath("//*[@id=\"mathans2\"]")).getText();
    driver.findElement(By.xpath("//*[@id=\"mathuserans2\"]")).sendKeys(elm1);
	}
	}*/
}
