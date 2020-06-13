package firstpackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DateTimepickercontrolexample {

	public static void main(String[] args) throws InterruptedException{
		        String date="August2020";
		        String day= "20";
		//invoke chrome driver
				System.setProperty("webdriver.chrome.driver", "D:\\Driver\\chromedriver.exe");
				//initialize chrome driver
				WebDriver driver= new ChromeDriver();
				//maximize the chrome browser
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				//launch the website
				driver.get("https://demos.telerik.com/kendo-ui/datetimepicker/index");
				
				//click on date picker
				WebElement selectdate= driver.findElement(By.xpath("//span[@class='k-link k-link-date']"));
				
				selectdate.click();
				Thread.sleep(3000);
				while(true){
					String Text=driver.findElement(By.xpath("//a[contains(@class,'k-nav-fast']")).getText();
					
					if(Text.equals(date)){
						break;
						
					}else
						driver.findElement(By.xpath("//span[@aria-controls='datetimepicker_dateview']//class[k-link k-nav-next]-next link")).click();
						
					
				}
				
				
	}
	
}
