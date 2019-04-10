package stepdef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class LoginStep {
	
	WebDriver driver;
	
	@Given("^Open Firefox and start the App$")
	public void open_Firefox_and_start_the_App() throws Throwable {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\manoj\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://www.facebook.com");
		
		
	    
	}

	@Then("^user enters username \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_username_and(String arg1, String arg2) throws Throwable {
		
		driver.findElement(By.xpath(".//*[@id='email']")).sendKeys(arg1);

		driver.findElement(By.xpath(".//*[@id='pass']")).sendKeys(arg2);
	   
	}

	@Then("^user should be able to login$")
	public void user_should_be_able_to_login() throws Throwable {
		
		driver.findElement(By.xpath(".//*[@id='u_0_2']")).click();
	  
	}

	@Then("^Application should be closed$")
	public void application_should_be_closed() throws Throwable {
	    driver.quit();
	}

}
