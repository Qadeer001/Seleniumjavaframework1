package firstpackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Flyinhomepage {
	
	public static void main(String[] args){
		
		System.setProperty("webdriver.chrome.driver", "D:\\Driver\\chromedriver.exe");
		//initialize chrome driver
		WebDriver driver= new ChromeDriver();
		//JavascriptExecutor js= (JavascriptExecutor)driver;
		//maximize the chrome browser
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.flyin.com/?lng=en");
		driver.findElement(By.xpath("//input[@id='roundFrom']")).sendKeys("bangalore");
		driver.findElement(By.xpath("//input[@id='roundTo']")).sendKeys("Hyderabad");
		driver.findElement(By.xpath("//input[@id='rThdateF']")).click();
		driver.switchTo().alert();
		//driver.findElement(By.xpath("//select[@class='pika-select pika-select-month']//select[@value='2']"));
		String date="12-September-2020";
		String datearr[]=date.split("-");//{12,September,2020};
		String day=datearr[0];
		String month=datearr[1];
		String Year=datearr[2];
		
		Select monthselect= new Select(driver.findElement(By.className("pika-select pika-select-month")));
		monthselect.selectByVisibleText(month);
		Select Yearselect= new Select(driver.findElement(By.className("pika-label")));
		Yearselect.selectByVisibleText(Year);
		
		
		
		
		
	}

}
