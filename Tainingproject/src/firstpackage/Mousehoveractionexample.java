package firstpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mousehoveractionexample {
	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver", "D:\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();

		String URL = "https://en.wikipedia.org/wiki/Main_Page";

		driver.get(URL);
		Actions actions= new Actions(driver);
		WebElement link1=driver.findElement(By.linkText("History"));
		//*[@id="tooltipDemo"]
		actions.moveToElement(link1);

		try{
			Thread.sleep(4000);
			actions.click().build().perform();
		}catch(Exception e){
			e.printStackTrace();
		}	
	}

}
