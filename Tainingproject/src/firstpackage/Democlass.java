package firstpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Democlass {
	
	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.gecko.driver", "D:\\Driver\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.shop.demoqa.com");
		Thread.sleep(3000);
		driver.close();
	}

}
