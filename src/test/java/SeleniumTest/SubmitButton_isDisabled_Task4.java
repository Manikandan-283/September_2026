package SeleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SubmitButton_isDisabled_Task4 {
	
public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://d3pv22lioo8876.cloudfront.net/tiptop/");
		
        WebElement value = driver.findElement(By.xpath("//input[@myprop='myvalue']"));
		
		value.clear();
		
		WebElement value2 = driver.findElement(By.xpath("//button[text()='Submit']"));
		
		if (value2.isEnabled()) {
			
			System.out.println("Test Pass");
			
		}
		
		else {
			
			System.out.println("Test Fail");
		}
		
	
	
	
}
}
