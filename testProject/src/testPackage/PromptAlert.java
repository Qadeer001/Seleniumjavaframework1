package testPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromptAlert {
	
	public static void main(String[] args) {
		WebDriver driver=null;
		
		 System.setProperty("webdriver.chrome.driver", "D:\\Driver\\chromedriver.exe");
		 // Create a new instance of the chrome driver
		 
		         driver = new ChromeDriver();
		         driver.manage().window().maximize();
		 
		         // Put an Implicit wait, this means that any search for elements on the page could take the time the implicit wait is set for before throwing exception
		 
		         driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
		         // Launch the URL
		 
		         driver.get("https://www.toolsqa.com/handling-alerts-using-selenium-webdriver/");
                driver.findElement(By.xpath("//*[@id='content']/p[7]/button")).click();
              
	}
	
	
	
	
	
	

}
