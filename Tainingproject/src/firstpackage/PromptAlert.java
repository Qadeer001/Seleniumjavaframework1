package firstpackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromptAlert {
	
	static WebDriver driver=null;
	
	public static void main(String[] args) throws InterruptedException {
		
		//JavascriptExecutor js= (JavascriptExecutor)driver;

		System.setProperty("webdriver.chrome.driver", "D:\\Driver\\chromedriver.exe");
		// Create a new instance of the chrome driver

		driver = new ChromeDriver();
		driver.manage().window().maximize();

		// Put an Implicit wait, this means that any search for elements on the page could take the time the implicit wait is set for before throwing exception

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// Launch the URL

		driver.get("https://www.toolsqa.com/handling-alerts-using-selenium-webdriver/");
		WebElement element=driver.findElement(By.xpath("//*[@id='content']/p[7]/button"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click()", element);

		Alert promptalert= driver.switchTo().alert();
		Thread.sleep(4000);
		String alerttext= promptalert.getText();
		System.out.println(alerttext);
		Thread.sleep(3000);
		promptalert.accept();

	}
}



