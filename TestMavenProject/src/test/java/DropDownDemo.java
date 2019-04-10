import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropDownDemo {

	
	@Test
	public  void testcase1() 
	{
WebDriver driver;
		
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\manoj\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://seleniumpractise.blogspot.com/");
		
		Select tools = new Select(driver.findElement(By.xpath(".//*[@id='tools1']")));
		
		List actuallist= new ArrayList();
	
		List<WebElement> mytools =tools.getOptions();
		
		for(WebElement ele:mytools)
		{
			String data =ele.getText();
			actuallist.add(data);
			System.out.println(actuallist);
		}
	
    List temp = new ArrayList();
    
    temp.addAll(actuallist);
    Collections.sort(temp);
    
   // Assert.assertTrue(actuallist.equals(temp));
    
    System.out.println(temp);
    
	}

}
