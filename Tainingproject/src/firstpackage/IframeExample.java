package firstpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeExample {
	
	    static WebDriver driver;
		public static void main(String[] args) throws InterruptedException{

			String driverExecutablePath = "D:\\Driver\\chromedriver.exe";
			System.setProperty("webdriver.chrome.driver", driverExecutablePath);


			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://demo.guru99.com/test/guru99home/"); 
		       // navigates to the page consisting an iframe

		       driver.manage().window().maximize();
		       Thread.sleep(4000);
		       driver.switchTo().frame("a077aa5e"); //switching the frame by ID
		       Thread.sleep(4000);
				System.out.println("********We are switch to the iframe*******");
	  		driver.findElement(By.xpath("html/body/a/img")).click();
			    //Clicks the iframe
	  		//driver.findElement(By.linkText("http://www.guru99.com/accounting.html")).click();
	    Thread.sleep(4000);
				System.out.println("*********We are done***************");
			 driver.quit();

			         
	}
	}


