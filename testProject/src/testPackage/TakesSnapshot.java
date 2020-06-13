package testPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class TakesSnapshot {
	
	static WebDriver driver;
		
	    public static void main(String[] args)throws Exception{
		
		System.setProperty("webdriver.chrome.driver", "D:\\Driver\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com/");
		
		File f=(File) ((TakesScreenshot)driver)
				.getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile
		(f, new File("D:\\homepagefacebook + .png"));
		
  
	    }	
		
	}

	
		
		
	

