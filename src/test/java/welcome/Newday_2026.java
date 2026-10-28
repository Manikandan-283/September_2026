package welcome;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Newday_2026 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        ChromeDriver driver= new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		WebElement newton = driver.findElement(By.xpath("//input[@id='email']"));	
		
		newton.sendKeys("manikandan@gmil.com");
		
		WebElement newton1 = driver.findElement(By.xpath("//input[@name='password']"));
		
		newton1.sendKeys("Mani$456352$123#");
		
		WebElement newton2 = driver.findElement(By.xpath("//input[@type='number']"));
		
		newton2.sendKeys("25");
		
		WebElement newton3 = driver.findElement(By.xpath("//input[@name='shipping']"));
		
		newton3.sendKeys("Standard");
		
		WebElement newton4 = driver.findElement(By.xpath("//input[@placeholder='Enter your full name']"));
		
		newton4.sendKeys("MANIKANDAN");
		
		WebElement newton5 = driver.findElement(By.xpath("//input[@placeholder='Phone number (xxx-xxx-xxxx)']"));
		
		newton5.sendKeys("6985785412");
		
		
		WebElement newton6 = driver.findElement(By.xpath("//textarea[@placeholder='Type your message here...']"));
		
		newton6.sendKeys("all details are captured here");
		
		WebElement newton7 = driver.findElement(By.xpath("//input[@placeholder='Search products...']"));
		
		newton7.sendKeys("facebook");
		
		WebElement newton8 = driver.findElement(By.xpath("//button[text()='Search']"));
		
		newton8.sendKeys(Keys.ENTER);
		
		
		
		
		

		
		
		
		
		
		
		

	}

}
