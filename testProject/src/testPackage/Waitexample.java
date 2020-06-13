package testPackage;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
 
import org.openqa.selenium.By;
 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
 
import org.openqa.selenium.support.ui.ExpectedConditions;
 
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waitexample {
	
	 
	 public static WebDriver driver;
	 
	 public static void main(String[] args) throws InterruptedException {
	 
	 // Create a new instance of the chrome driver
	       System.setProperty("webdriver.chrome.driver", "D:\\Driver\\chromedriver.exe");
	        driver = new ChromeDriver();
	        driver.manage().window().maximize();
	 
	        // Put an Implicit wait, this means that any search for elements on the page could take the time the implicit wait is set for before throwing exception
	 
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 
	        // Launch the URL
	 
	        driver.get("http://demoqa.com/automation-practice-switch-windows/");
	 
	        // Click on the Button "Timing Alert"
	 
	        //driver.findElement(By.name("Timing Alert")).click();
	        driver.findElement(By.id("timingAlert")).click();
	 
	        System.out.println("Timer JavaScript Alert is triggered but it is not yet opened");
	 
	        // Create new WebDriver wait
	 
	        WebDriverWait wait = new WebDriverWait(driver, 10);
	 
	        // Wait for Alert to be present
	 
	        Alert myAlert = wait.until(ExpectedConditions.alertIsPresent());
	 
	        System.out.println("Either Pop Up is displayed or it is Timed Out");
	 
	        // Accept the Alert
	 
	        myAlert.accept();
	        Thread.sleep(4000);
	 
	        System.out.println("Alert Accepted");
	 
	        // Close the main window
	 
	        driver.close();
	 
	 }
	 
	}


