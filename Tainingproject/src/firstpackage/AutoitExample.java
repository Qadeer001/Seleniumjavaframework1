package firstpackage;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AutoitExample {
	
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Driver\\chromedriver.exe");
		//initialize chrome driver
		WebDriver driver= new ChromeDriver();
		//maximize the chrome browser
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//launch the website
		driver.get("http://tinyupload.com/");
		Thread.sleep(4000);
		Actions actions= new Actions(driver);
		
		WebElement choosebtn=driver.findElement(By.name("uploaded_file"));
		actions.moveToElement(choosebtn);
		actions.click(choosebtn).perform();
		
		/*JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click", choosebtn);*/
		//choosebtn.sendKeys(Keys.RETURN);
		//input[@name='uploaded_file']
		Runtime.getRuntime().exec("D:\\fileupload1.exe");
		Thread.sleep(3000);
		//driver.close();
		
		
	}

}
