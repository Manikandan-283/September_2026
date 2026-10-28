package welcome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Todayprctice_10_09_26 {

	
	
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
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
