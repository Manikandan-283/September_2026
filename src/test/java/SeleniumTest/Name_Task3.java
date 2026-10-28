package SeleniumTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Name_Task3 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://d3pv22lioo8876.cloudfront.net/tiptop/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebElement name = driver.findElement(By.xpath("//input[@id='my-name-id']"));
		
		name.sendKeys("Manikandan R");
		
		WebElement password = driver.findElement(By.xpath("//input[@id='my-password-id']"));
		
		password.sendKeys("Mani$**123454%**");
		
		
		WebElement submit = driver.findElement(By.xpath("//button[text()='Submit']"));
		
		System.out.println(submit.isEnabled());
		
		
		
		if (submit.isEnabled()) {
		
		System.out.println("Test pass");
		
		}
		
		else {
			
			System.out.println("test pass");
		}
		
	}
	
	
	
	
	
	
}
