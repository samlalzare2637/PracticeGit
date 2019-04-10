import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DynamicWebTableHandle {

	
	
	
	public static void main(String[] args) throws InterruptedException {
		

		WebDriver driver;
	  
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\manoj\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.crmpro.com/");
		

        driver.findElement(By.xpath(".//*[@id='loginForm']/div/input[1]")).sendKeys("india2637");
        driver.findElement(By.xpath(".//*[@id='loginForm']/div/input[2]")).sendKeys("usa123");
        
       Thread.sleep(2000);
        driver.findElement(By.xpath(".//*[@id='loginForm']/div/div/input")).click();
        
       driver.switchTo().frame("mainpanel");
       
       Thread.sleep(2000);
       
       driver.findElement(By.xpath("//a[contains(text(),'Contacts')]")).click();
       
       
      /*  String before_xpath = ".//*[@id='vContactsForm']/table/tbody/tr[";
       String After_xpath="]/td[2]/a";
       
       for(int i=4;i<=6;i++) {
    	   
    	  String name = driver.findElement(By.xpath(before_xpath+i+After_xpath)).getText();
    	 System.out.println(name);
    	 
    	 if(name.contains("sam l"))
    	 {
    		 
    		 driver.findElement(By.xpath("//*[@id='vContactsForm']/table/tbody/tr["+i+"]/td[1]/input")).click();
    		 
    	 }
    	   
    	   
       }*/
       
       driver.findElement(By.xpath("//a[contains(text(),'manoj lalzare')]/parent::td//preceding-sibling::td//input[@name='contact_id']")).click();
       
       
		driver.close();
       }
	
	}
	


