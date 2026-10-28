package welcome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestingPractice_180926_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://letcode.in/button");
		
		driver.findElement(By.id("home")).click();
		
		driver.navigate().back();
		
		WebElement image = driver.findElement(By.xpath("//button[@id='position']"));
		
		System.out.println(image.getLocation());
		
		System.out.println(image.getCssValue("color"));
		
		System.out.println(image.getSize());
		
		WebElement send = driver.findElement(By.linkText("//button[text()='Disabled']"));
		
		System.out.println(send.isEnabled());
		
	
		if (send.isDisplayed()) {
			
			System.out.println("Test pass");
		}
	
		else {
			
			System.out.println("Test fail");
			
		}
		
		
		
		
		
		
	}

}
