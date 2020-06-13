package testPackage;

import java.io.IOException;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class fileuploadexample {


	public static void main(String[] args) throws IOException, InterruptedException {

		System.setProperty("webdriver.chrome.driver","D:\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/upload/");

		Actions actions= new Actions(driver);

		WebElement uploadElement = driver.findElement(By.id("uploadfile_0"));


		// enter the file path onto the file-selection input field
		uploadElement.sendKeys("C:\\upload\\Sample.txt");

		//check the "I accept the terms of service" check box
		driver.findElement(By.id("terms")).click();

		Thread.sleep(4000);
		driver.close();

		// click the "UploadFile" button
		actions.moveToElement(uploadElement);
		actions.click(uploadElement).perform();


	}
}


