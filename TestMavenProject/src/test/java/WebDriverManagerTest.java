import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverManagerTest {

	public static void main(String[] args) 
	
	{
		WebDriver driver;
		
System.setProperty("webdriver.chrome.driver",
		"C:\\Users\\manoj\\Desktop\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.get("http://www.wordpress.com");

		
	}

}
