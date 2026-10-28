package welcome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Today_Task_1_21092026 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/ref=nav_logo");
		
		Actions work = new Actions(driver);
		
		//mouse hover
		
		WebElement mouse = driver.findElement(By.xpath("//span[text()='Hello, sign in']"));
		WebElement key = driver.findElement(By.xpath("//span[text()='Your Wish List']"));
		
		work.moveToElement(mouse).perform();
		work.moveToElement(key).click().perform();
		
		//double click
		
		//WebElement note = driver.findElement(By.xpath("//button[@id='doubleBtn']"));
		//work.doubleClick(note).perform();
		
		
		//right click
		
	//	WebElement note1 = driver.findElement(By.xpath("//button[@type='button']"));
		
	//	work.contextClick(note1).perform();
		
		
	// drag and drop
		
	//	WebElement drag = driver.findElement(By.xpath("//div[@class='draggable'])"));
	//	WebElement drop = driver.findElement(By.xpath("//div[@id='dropZone'])"));
		
	//	work.dragAndDrop(drag, drop).perform();
		
    //    WebElement range = driver.findElement(By.xpath("//div[@class='slider-track']"));
		
	//	System.out.println(range.getLocation());
	
	
	
}
}