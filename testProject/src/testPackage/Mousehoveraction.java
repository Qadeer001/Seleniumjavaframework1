package testPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import java.util.concurrent.TimeUnit;
 
/*Launch the web browser and launch our practice page https://demoqa.com/menu/
Find the required element i.e. �Music� object in our sample
Now move the mouse on �Music� option which will display the submenu list
Find the required element i.e. �Rock� object in the sub menu list
Move mouse on �Rock� option which will display one more submenu list
Find the required element i.e. �Alternative� object in submenu list
Click on �Alternative�
Close the browser to end the program*/

public class Mousehoveraction {
 
 public static WebDriver driver;
 
 public static void main(String[] args) {
 
	//Set system properties for chromedriver 
	 System.setProperty("webdriver.chrome.driver", "D:\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
 
 // Launch the URL 
        driver.get("http://demoqa.com/menu/");
        System.out.println("demoqa webpage Displayed");
        
     //Maximise browser window
 driver.manage().window().maximize();
     
 //Adding wait 
 driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
                
        //Instantiate Action Class        
        Actions actions = new Actions(driver);
        //Retrieve WebElement 'Music' to perform mouse hover 
     WebElement menuOption = driver.findElement(By.xpath(".//div[contains(text(),'Music')]"));
     //Mouse hover menuOption 'Music'
     actions.moveToElement(menuOption).perform();
     System.out.println("Done Mouse hover on 'Music' from Menu");
     
     //Now Select 'Rock' from sub menu which has got displayed on mouse hover of 'Music'
     WebElement subMenuOption = driver.findElement(By.xpath(".//div[contains(text(),'Rock')]")); 
     //Mouse hover menuOption 'Rock'
     actions.moveToElement(subMenuOption).perform();
     System.out.println("Done Mouse hover on 'Rock' from Menu");
     
     //Now , finally, it displays the desired menu list from which required option needs to be selected
     //Now Select 'Alternative' from sub menu which has got displayed on mouse hover of 'Rock'
     WebElement selectMenuOption = driver.findElement(By.xpath(".//div[contains(text(),'Alternative')]"));
     selectMenuOption.click();
     System.out.println("Selected 'Alternative' from Menu");
     
        // Close the main window 
     driver.close();
 }
 
}