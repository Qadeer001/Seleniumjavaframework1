package firstpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ComplexXpaths {
public static void main(String[] args) throws InterruptedException{
//Practising Xpath
	System.setProperty("webdriver.chrome.driver","D:\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://demo.guru99.com/v1/");
	//driver.findElement(By.xpath("//input[@name='uid']")).sendKeys("mngr251495");
	//driver.findElement(By.xpath("//*[contains(@name,'pass')]")).sendKeys("jedybeq");
	driver.findElement(By.xpath("//input[@name='uid']")).click();
	driver.findElement(By.xpath("//*[contains(@name,'pass')]")).click();
	//driver.findElement(By.xpath("//*[contains(@type,'sub')]")).click();
	driver.findElement(By.xpath("//*[@type='submit' or @name='btnLogin']")).click();
	
	//*[@type='reset' or @name='btnReset']- xpath for Reset button
	//[@type='submit' or @name='Reset']- another xpath to click submit or reset button
	//[@type='submit' and @name='btnLogin']- both the condition should be true to find the element
	String uname=driver.findElement(By.xpath("//*[contains(@id,'message')]")).getText();
	System.out.println(uname);
	String pwd=driver.findElement(By.xpath("//*[contains(@id,'message')]")).getText();
	System.out.println(pwd);
	           //driver.findElement(By.xpath("//*[contains(text(),'here')]")).click();
	           driver.findElement(By.xpath("//*[contains(@href,'guru99.com')]")).click();
	           Thread.sleep(4000);
	           
//driver.close();	
}
}
