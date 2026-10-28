package welcome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Computer_2026 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver= new ChromeDriver();
		
	//	driver.get("https://www.google.com");
		
	//	driver.findElement(By.xpath("//a[text()='Gmail']")).click();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		WebElement work = driver.findElement(By.xpath("//legend[text()='Shipping Method']"));
		
		work.sendKeys("standatd");
		
		
		

	}

}
