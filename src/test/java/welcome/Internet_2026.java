package welcome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Internet_2026 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
        WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		
		WebElement Gmail = driver.findElement(By.linkText("Gmail"));
		Gmail.click();
		
		
		WebElement img = driver.findElement(By.xpath("//a[text()='Gmail']"));
		
		System.out.println(img.isDisplayed());
		
		if(img.isDisplayed()) {
			System.out.println("test pass");
		}
		
		else {
			System.out.println("test fail");
		}

	}

}
