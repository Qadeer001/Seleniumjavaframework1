package testPackage;


import java.util.Set;

import java.util.concurrent.TimeUnit;
 
import org.openqa.selenium.Alert;
 
import org.openqa.selenium.By;
 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
 
public class Alertboxpractise1 {
	
     public static WebDriver driver;
	 
	 public static void main(String[] args) throws InterruptedException {
	 
	 // Create a new instance of the chrome driver
	 
		 System.setProperty("webdriver.chrome.driver", "D:\\Driver\\chromedriver.exe");
		 // Create a new instance of the chrome driver
		 
		         driver = new ChromeDriver();
		         driver.manage().window().maximize();
		 
	 
	         // Put an Implicit wait, this means that any search for elements on the page could take the time the implicit wait is set for before throwing exception
	 
	         driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 
	         // Launch the URL
	 
	         driver.get("http://demoqa.com/automation-practice-switch-windows/");
	 
	         // Click on the Button "Alert Box"
	 
	         driver.findElement(By.xpath("//button[@id='alert']")).click();
	 
	         // Switch to JavaScript Alert window
	 
	         Alert myAlert = driver.switchTo().alert();
	         
	         String Text= myAlert.getText();
	         
	         System.out.println("Alert Text is " +Text);
	         
	         Thread.sleep(4000);
	 
	         // Accept the Alert
	 
	         myAlert.accept();
	         
	         Thread.sleep(4000);
	 
	         // Close Original window
	 
	         driver.close();
	 
	 }
	 
	}


