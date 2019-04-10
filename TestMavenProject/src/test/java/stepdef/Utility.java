package stepdef;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;



public class Utility {
	
	WebDriver driver;
	
	
	@Test
public void open_Firefox_and_start_the_App() throws Throwable {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\manoj\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://www.facebook.com");
		
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("samlalzare");
		
	
	TakesScreenshot ts=(TakesScreenshot)driver;
	 
	File source=ts.getScreenshotAs(OutputType.FILE);
	 
	FileUtils.copyFile(source, new File("./Screenshots/facebook.png"));
	 
	System.out.println("Screenshot taken");
	 driver.quit();
	 
	
	
	}

}
