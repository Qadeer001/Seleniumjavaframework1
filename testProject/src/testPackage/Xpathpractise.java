package testPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathpractise {
	
	public static void main(String[] args){
		
		System.setProperty("webdriver.chrome.driver", "D:\\Driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/v1/");
		
		String str1=driver.findElement(By.xpath("//*[contains(text(),'UserID')]")).getText();
		System.out.println(str1);
		driver.findElement(By.xpath("//input[@name='uid']")).sendKeys("abc");
		driver.findElement(By.xpath("//input[@name='uid']")).clear();
		//String str=driver.findElement(By.xpath("//*[contains(@id,'message')]")).getText();
		//System.out.println(str);
		String s=driver.findElement(By.xpath("//label[starts-with(@id,'message')]")).getText();
		System.out.println(s);
		//using text function
		String Text=driver.findElement(By.xpath("//*[text()='Password']")).getText();
		System.out.println(Text);
		//driver.findElement(By.xpath("//*[@type='submit' or @name='btnLogin']")).click();
		//driver.findElement(By.xpath("//*[@type='submit' and @name='btnLogin']")).click();
		//driver.findElement(By.xpath("//*[@type='submit' or @name='btnReset']")).click();
		driver.findElement(By.xpath("//*[@name='btnReset']")).click();
		System.out.println("Reset clicked");
		driver.findElement(By.xpath("//*[contains(text(),'here')]")).click();
		driver.findElement(By.xpath("//*[contains(@href,'guru99.com')]")).click();
				
		
	}

}
