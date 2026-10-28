package welcome;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Utility.BaseClass;
	
public class ScreenShot_BaseClass extends BaseClass {
		
		public static void main1(String[] args) throws IOException, AWTException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));		
		
		String path = "https://www.instagram.com/";
		String alert = ScreenShot_BaseClass.excelread(path, "Screenshot", 0, 1);
				
		System.out.println(alert);
	
        Robot m = new Robot();
		
		Dimension ss = Toolkit.getDefaultToolkit().getScreenSize();
		
		Rectangle rr = new Rectangle(ss);
		
		BufferedImage image = m.createScreenCapture(rr);
		
		File f = new File (".//Images/instagram"+System.currentTimeMillis() +".png");

		ImageIO.write(image, "png", f);
		 	
				
		driver.findElement(By.xpath("//input[@id='_R_ojadeslcldcpbn6b5ipamH1_']")).sendKeys("Manikandan@gmail.com");
		
		ScreenShot_300926_task2.captureImage();
		
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("Mani$12345$");
		
		ScreenShot_300926_task2.captureImage();
		
		
		
		
		
		
	
	

}

		private static String excelread(String path, String string, int i, int j) {
			// TODO Auto-generated method stub
			return null;
		}
}