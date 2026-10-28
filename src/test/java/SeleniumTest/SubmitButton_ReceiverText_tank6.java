package SeleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SubmitButton_ReceiverText_tank6 {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
			
		driver.get("https://d3pv22lioo8876.cloudfront.net/tiptop/");
		
        WebElement name = driver.findElement(By.xpath("//input[@id='my-name-id']"));
		
		name.sendKeys("Manikandan R");
		
		WebElement password = driver.findElement(By.xpath("//input[@id='my-password-id']"));
		
		password.sendKeys("Password@123456$");
		
		
		WebElement submit = driver.findElement(By.xpath("//button[text()='Submit']"));
			
		submit.click();	
				
		WebElement received = driver.findElement(By.xpath("//p[text()='Received!']"));
		
		if (received.isDisplayed()) {
			
			System.out.println("Test Pass");
			
		}
		
		else {
			
			System.out.println("Test fail");
			
		}
		
		
	}
	
	
	
	
	

}
