package welcome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Edinburgh_2026 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		
		WebElement world = driver.findElement(By.linkText("Data Entry Form"));
		System.out.println(world.isEnabled());
		
		world.click();
		
		WebElement earth = driver.findElement(By.xpath("//input[@class='form-control']"));
		System.out.println(earth.isDisplayed());
		
		if (earth.isDisplayed()) {
		
		System.out.println("Test pass");

	}
		else System.out.println("Test fail");

		
		
	}
}
