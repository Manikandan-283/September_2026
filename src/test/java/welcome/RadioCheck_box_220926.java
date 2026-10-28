package welcome;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioCheck_box_220926 {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			WebDriver driver = new ChromeDriver();			
			driver.get("https://letcode.in/radio");			
			//Select any one			
			WebElement female = driver.findElement(By.xpath("//input[@id='no']"));			
			System.out.println(female.isSelected());
			female.click();			
			System.out.println(female.isSelected());
			//Confirm you can select only one radio button
			WebElement one = driver.findElement(By.xpath("//input[@id='one']"));
			WebElement two = driver.findElement(By.xpath("//input[@id='two']"));				
			System.out.println(one.isSelected());		
			one.click();			
			System.out.println(one.isSelected());			
			if (one.isSelected()) {				
				System.out.println("test pass");
			}			
			else {
				System.out.println("test fail");
			}			
           if (two.isSelected()) {				
				System.out.println("test pass");
			}			
			else {
				System.out.println("test fail");		}           
           //Find the bug           
           WebElement yes = driver.findElement(By.xpath("//input[@id='nobug']"));
           WebElement no = driver.findElement(By.xpath("//input[@id='bug']"));           
           yes.click();                   
           System.out.println(yes.isSelected());
           
           System.out.println(no.isSelected());
          
           if (yes.isSelected()) {
        	   
        	   System.out.println("Test pass");
           }
           
           else {
        	   System.out.println("Test fail");
        	          	  
           }
        
           // Find which one is selected

           WebElement selected = driver.findElement(By.xpath("//input[@id='foo']"));
           WebElement notSelected = driver.findElement(By.xpath("//input[@id='notfoo']"));
           selected.click();
           
           System.out.println(selected.isSelected());
           System.out.println(notSelected.isSelected());
           
           // Confirm last field is disabled

           WebElement disabled = driver.findElement(By.xpath("//input[@id='maybe']"));
                          
                    
           System.out.println(disabled.isEnabled());
          
          
          if (disabled.isEnabled()) {
        	   
        	   System.out.println("test pass");
           }
          
           else {
        	   System.out.println("test fail");
           }
           
           //Find if the checkbox is selected?

        //	WebElement checkbox1 = driver.findElement(By.xpath("//input[@type='checkbox']"));
        	   
        ///	checkbox1.click();
        	
        //	System.out.println(checkbox1.isSelected());
        	
        //	if (checkbox1.isSelected()) {
         	   
        // 	   System.out.println("test pass");
            }
           
        //    else {
         //	   System.out.println("test fail");
           
      //      }
           
           
           
           
	}


