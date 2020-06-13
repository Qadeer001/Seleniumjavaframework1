package testPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

/*Launch the web browser and launch our practice page https://demoqa.com/tooltip-and-double-click/
Find the required element i.e. button in our sample and do right click on the element
Go to the options ‘copy’ and  click on it
Accept the alert message
Close the browser to end the program*/

public class RightclickExample {
	
	 
	 public static void main(String[] args) throws InterruptedException {
	    //Note: Following statement is required since Selenium 3.0, 
	    //optional till Selenium 2.0
	    //Set system properties for chromedriver 
		 String driverExecutablePath = "D:\\Driver\\chromedriver.exe";
		 System.setProperty("webdriver.chrome.driver", driverExecutablePath);
		 
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	 
	    // Launch the URL 
	    driver.get("https://demoqa.com/tooltip-and-double-click/");
	    System.out.println("demoqa webpage displayed");
	 
	    //Maximise browser window
	    driver.manage().window().maximize();
	 
	    //Instantiate Action Class
	    Actions actions = new Actions(driver);
	 
	    //Retrieve WebElement to perform right click
	    WebElement btnElement = driver.findElement(By.id("rightClickBtn"));
	 
	    //Right Click the button to display Context Menu&nbsp;
	    actions.contextClick(btnElement).perform();
	    System.out.println("Right click Context Menu displayed");
	    Thread.sleep(4000);
	 
	    //Following code is to select item from context menu which gets open up on right click, this differs 
	    //depending upon your application specific test case: 
	    //Select and click 'Copy me' i.e. 2nd option in Context menu 
	    WebElement elementOpen = driver.findElement(By.xpath(".//div[@id='rightclickItem']/div[1]"));  
	    elementOpen.click(); 
	 Thread.sleep(4000);
	    // Accept the Alert 
	    driver.switchTo().alert().accept();
	    System.out.println("Right click Alert Accepted");
	 Thread.sleep(4000);
	    // Close the main window 
	    driver.close();
	    
	   }
	   
	 }


