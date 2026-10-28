package SeleniumTest;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import Utility.BaseClass;

public class DrapDown_Task4 extends BaseClass {
	
	public static void main(String[] args) throws IOException {		
				
		driver.get("https://d3pv22lioo8876.cloudfront.net/tiptop/");
		String path = "\\XLfiles\\BaseClass.xlsx";
		String colours = DrapDown_Task4.excelread(path, "Demo", 0, 2);
		String colours1 = DrapDown_Task4.excelread(path, "Demo", 0, 4);
		
		WebElement dropdown = driver.findElement(By.xpath("//select[@class='form-select' and @name='my-select']"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		Select name = new Select(dropdown);
		
		name.selectByValue("Blue");
		
		name.selectByVisibleText("Red");
		
		
		List<WebElement> name2 = name.getOptions();
		
		System.out.println(name2.size());
		
		for (WebElement m : name2) {
			
			System.out.println(m.getText());
		}
		
		
		
		
		
		
	}

	private static String excelread(String path, String string, int i, int j) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
