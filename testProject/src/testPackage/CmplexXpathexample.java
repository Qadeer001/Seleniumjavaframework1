package testPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CmplexXpathexample {
	
public static void main(String[] args){
	
	 System.setProperty("webdriver.chrome.driver", "D:\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/v1");
		driver.findElement(By.linkText("addcustomerpage.php")).click();
		driver.findElement(By.xpath("//input[@name='name']//following::input[1]")).sendKeys("Ahmed");
}

}
