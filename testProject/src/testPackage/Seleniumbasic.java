package testPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seleniumbasic {

	public static void main(String[] args) throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver", "D:\\Driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();//launch the chrome browser
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");// will launch the website
		Thread.sleep(3000);
		driver.close();
		
		
	}
	
	
}
