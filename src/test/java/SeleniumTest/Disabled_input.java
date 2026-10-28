package SeleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Disabled_input {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://d3pv22lioo8876.cloudfront.net/tiptop/");
		
		WebElement disabled = driver.findElement(By.xpath("//input[@name='my-disabled']"));
		
		
		if (disabled.isEnabled()) {
			
			System.out.println("The button is enabled");
			disabled.click();
		}
		
		else {
			
			System.out.println("The button is currently disabled");
		}
			


	
		
		
	}
	

}
