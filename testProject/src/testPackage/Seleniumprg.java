package testPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
/*•	Launch the Firefox browser
•	Open website “www.DemoQA.com”
•	Print a Message to display that the website is opened successfully
•	Wait for 5 Seconds
•	Close the Browser*/

public class Seleniumprg {
	
	public static void main(String[] args) throws InterruptedException{
		
		System.setProperty("webdriver.gecko.driver", "D:\\Driver\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.demoqa.com/");
		Thread.sleep(3000);//milliseconds
		driver.close();
		
	}

}
