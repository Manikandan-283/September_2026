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

public class ScreenShot_300926_task2 {
	
	private static final String ImageIo  = null;
	private static Rectangle d;
	private static Object rect;

	public static void captureImage() throws AWTException, IOException {
		
		Robot m = new Robot();
		
		Dimension ss = Toolkit.getDefaultToolkit().getScreenSize();
		
		Rectangle rr = new Rectangle(ss);
		
		BufferedImage image = m.createScreenCapture(rr);
		
		File f = new File (".//Images/instagram"+System.currentTimeMillis() +".png");

		ImageIO.write(image, "png", f);
	}

	public static void main(String[] args) throws AWTException, IOException {
		// TODO Auto-generated method stub

        WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.instagram.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.xpath("//input[@id='_R_ojadeslcldcpbn6b5ipamH1_']")).sendKeys("Manikandan@gmail.com");
		
		ScreenShot_300926_task2.captureImage();
		
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("Mani$12345$");
		
		ScreenShot_300926_task2.captureImage();
		
		
		
		
		
		
		
		
		
		
		
	}

}
