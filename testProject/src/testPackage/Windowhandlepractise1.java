package testPackage;

import java.util.Set;

import java.util.concurrent.TimeUnit;
 
import org.openqa.selenium.By;
 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Windowhandlepractise1 {

	 public static WebDriver driver;
	 
	 public static void main(String[] args) throws InterruptedException {
	 
		 System.setProperty("webdriver.chrome.driver", "D:\\Driver\\chromedriver.exe");
	 // Create a new instance of the chrome driver
	 
	         driver = new ChromeDriver();
	         driver.manage().window().maximize();
	 
	         // Put an Implicit wait, this means that any search for elements on the page could take the time the implicit wait is set for before throwing exception
	 
	         driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 
	         // Launch the URL
	 
	         driver.get("https://demoqa.com/automation-practice-switch-windows/");
	 
	         // Store and Print the name of the First window on the console
	 
	         String handle= driver.getWindowHandle();
	         
	 
	         System.out.println(handle);
	 
	         // Click on the Button "New browser Window"
	 
	         driver.findElement(By.xpath("//button[@id='button1']")).click();
	         
	 
	         // Store and Print the name of all the windows open	              
	 
	         Set handles = driver.getWindowHandles();
	 
	         System.out.println(handles);
	 
	         // Pass a window handle to the other window
	 
	         for (String handle1 : driver.getWindowHandles()) {
	 
	          System.out.println(handle1);
	 
	          driver.switchTo().window(handle1);
	          
	 
	          }
	         Thread.sleep(4000);
	         // Closing Pop Up window
	 
	         driver.close();
	 
	         // Close Original window
	         Thread.sleep(4000);  
	         driver.quit();
	 
	 }
	 
	}
	
	

