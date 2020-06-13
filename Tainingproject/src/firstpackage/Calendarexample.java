package firstpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendarexample {
	
	public static void main(String[] args) throws InterruptedException{
	    //invoke chrome driver
		System.setProperty("webdriver.chrome.driver", "D:\\Driver\\chromedriver.exe");
		//initialize chrome driver
		WebDriver driver= new ChromeDriver();
		//maximize the chrome browser
		driver.manage().window().maximize();
		//launch the website
		driver.get("http://demo.guru99.com/test/");
		//find date and time element by using xpath
		WebElement dob= driver.findElement(By.xpath("//input[@name='bdaytime']"));
		//entering the date in date field in below format without slashes
		dob.sendKeys("09041990");
		//press tab after entering date then the date will be set in the date fields in the date format ie 09/04/1990
		dob.sendKeys(Keys.TAB);
		//entering the time in the time field without any format
		dob.sendKeys("0235");
		Thread.sleep(4000);
		//click submit button
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		//closing browser
		
		driver.close();
	}

}
