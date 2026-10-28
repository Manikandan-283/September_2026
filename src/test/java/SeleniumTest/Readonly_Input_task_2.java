package SeleniumTest;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Readonly_Input_task_2 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://d3pv22lioo8876.cloudfront.net/tiptop/");
		
		
		
		WebElement readonly = driver.findElement(By.xpath("//input[@type='text' and @value='Readonly input']"));
		
	   
		
		if (readonly.isDisplayed()) {
								
			System.out.println("Test pass");

		}
			else {
				System.out.println("Test fail");

			}		
	}
}	
			
		
	
		
		
		
	
		
		
	
	
	

