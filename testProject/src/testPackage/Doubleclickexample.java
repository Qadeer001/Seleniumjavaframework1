package testPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

/*Launch the web browser and launch our practice page https://demoqa.com/tooltip-and-double-/click
Find the required element i.e. button in our sample and do double click on the element
Accept the alert message
Close the browser to end the program*/

public class Doubleclickexample {
	
	public static void main(String[] args) throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver", "D:\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		Actions actions= new Actions(driver);
		
		driver.get("https://demoqa.com/tooltip-and-double-click/");
		
		WebElement btnelement=driver.findElement(By.xpath("//button[@id='doubleClickBtn']"));
		actions.doubleClick(btnelement).perform();
				
		
		Thread.sleep(4000);
		driver.switchTo().alert().accept();
		
		
		driver.close();
	}

}
