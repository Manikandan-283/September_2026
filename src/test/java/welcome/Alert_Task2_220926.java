package welcome;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Task2_220926 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
					
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://letcode.in/alert");
			
		//simple alert - alert 1
			
//			driver.findElement(By.xpath("//button[text()='Simple Alert']")).click();
																								//switch
//			Alert new1 = driver.switchTo().alert();												//alert			
//			System.out.println(new1.getText());
//			new1.accept();

		//confirm alert
			
//			driver.findElement(By.xpath("//button[text()='Confirm Alert']")).click();
			
//            Alert new2 = driver.switchTo().alert();														
 //           System.out.println(new2.getText());
  //          new2.dismiss();
 //           
         //prompt alert
            
 //           driver.findElement(By.xpath("//button[text()='Prompt Alert']")).click();
			
 //           Alert new3 = driver.switchTo().alert();														
 //           System.out.println(new3.getText());
 //           new3.sendKeys("Manikandan");
  //          new3.accept();
	
         //morden alert
           WebElement m = driver.findElement(By.xpath("//button[text()='Modern Alert']"));
           m.click();
            
         WebElement new4 = driver.findElement(By.xpath("//button[@aria-label='close']"));
            
         new4.click(); 
           
			
			
			
			
			
			
			
		

	}

}
