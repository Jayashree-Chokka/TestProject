package testCases;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class TestScreenshotAshot {

	public static void main(String[] args) throws IOException {
WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.way2automation.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement elm = driver.findElement(By.xpath("//a[@class='header-logo']"));
		
		/*Screenshot screenshot = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
		ImageIO.write(screenshot.getImage(), "jpg", new File("./Screenshots/AshotImage.jpg"));
		*/
		Screenshot screenshot2 = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver, elm);
		ImageIO.write(screenshot2.getImage(), "jpg", new File("./Screenshots/AshotElementImage.jpg"));
		
		WebElement elm2 = driver.findElement(By.xpath("//*[@id=\"wrapper\"]/header/div[2]/div/div[2]"));
		
		Screenshot scr2 = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver, elm2);
		ImageIO.write(scr2.getImage(), "jpg", new File("./Screenshots/Elementshot.jpg"));
	}

}
