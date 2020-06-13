package firstpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Sampleprg {
	
	public static void main(String[] args){
		
		System.setProperty("webdriver.chrome.driver", "D://Driver//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/insurance/v1/register.php");
		driver.manage().window().maximize();
		System.out.println("window maximized");
		//driver.findElement(By.id("user_firstname")).sendKeys("Ahmed");
		String Heading=driver.findElement(By.xpath("//h1[text()='Sign up as a new user']")).getText();
		System.out.println(Heading);
		Select oselect= new Select(driver.findElement(By.xpath("//select[@id='user_title']")));
		WebElement element=driver.findElement(By.xpath("//select[@id='user_title']"));
		driver.findElement(By.xpath("//input[@id='user_surname']")).sendKeys("Pranjal");
		boolean flag=driver.findElement(By.xpath("//select[@id='user_title']")).isEnabled();
		if(flag=true){
			System.out.println("The Title drop down is enabled");
		}else{
			System.out.println("The title drop don is disabled");
	}
	oselect.selectByVisibleText("Mr.");
	driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Ahmed");
	//driver.findElement(By.xpath("//input[@name='firstname']//following::input[1]")).sendKeys("Bari");
	}

}
