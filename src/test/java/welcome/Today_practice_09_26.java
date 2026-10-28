package welcome;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Today_practice_09_26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
        ChromeDriver driver= new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		WebElement search = driver.findElement(By.xpath("//input[@id='name']"));	
		
		search.sendKeys("Manikandan.R");
		
	
		
		WebElement search1= driver.findElement(By.xpath("//input[@id='email']"));
		
        search1.sendKeys("manikandan@gmail.com");
		
		search1.sendKeys(Keys.ENTER);
		
		WebElement search2 = driver.findElement(By.xpath("//input[@placeholder='Enter Phone']"));
		
        search2.sendKeys("9876543623");
		
		search2.sendKeys(Keys.ENTER);
		
		WebElement search3 = driver.findElement(By.xpath("//textarea[@id='textarea']"));
		
		search3.sendKeys("No 64, Gandhi Street, Guindy, Chennai-600032");
		
		search3.sendKeys(Keys.ENTER);
		
		
		
		
		

		
		
		
		

	}

}
