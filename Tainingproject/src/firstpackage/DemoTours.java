package firstpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.*;

public class DemoTours {
	
			public class firsttestngfile {
		    public String baseUrl = "http://demo.guru99.com/test/newtours/";
		    String driverPath = "D:\\Driver\\chromedriver.exe";
		    public WebDriver driver ; 
		     
		  public static void main(String[] args) {
			
			  public void verifyHomepageTitle() {
			       
			      System.out.println("launching firefox browser"); 
			      System.setProperty("webdriver.gecko.driver", driverPath);
			      driver = new ChromeDriver();
			      driver.get(baseUrl);
			      String expectedTitle = "Welcome: Mercury Tours";
			      String actualTitle = driver.getTitle();
			      Assert.assertEquals(actualTitle, expectedTitle);
			      driver.close();
		}
		  
		  }
			}
		
	}

}
