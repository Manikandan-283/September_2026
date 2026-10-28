package welcome;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task_2_200926 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			WebDriver driver = new ChromeDriver();

			driver.get("https://letcode.in/edit");
			
			WebElement book = driver.findElement(By.xpath("//input[@id='fullName']"));
			
			book.sendKeys("Manikandan Rajan");
			
			WebElement book1 = driver.findElement(By.xpath("//input[@id='join']"));
			
			book1.sendKeys(" and welcome to Selenium");
			
			book1.sendKeys(Keys.TAB);
			
			WebElement book2 = driver.findElement (By.xpath("//input['value']"));
			
			System.out.println("ortonikc");
			
			WebElement book3 = driver.findElement(By.xpath("//input[@value='Koushik Chatterjee']"));
			
			book3.clear();
			
			WebElement book4 = driver.findElement(By.xpath("//input[@id='noEdit']"));
			
			System.out.println(book4.isDisplayed());
			
			if (book4.isDisplayed()) 
			{
				System.out.println("Test Pass");
						
			}
		
			else {
				
				System.out.println("Test fail");
				
			}		
			
			WebElement book5 = driver.findElement(By.xpath("//input[@id='dontwrite']"));
			
			System.out.println(book.isDisplayed());
			
			if (book5.isDisplayed()) {
				
				System.out.println("test pass");
				
			}
			else {
				
				System.out.println("test fail");
			}
			
			
	    }

	}

	
	