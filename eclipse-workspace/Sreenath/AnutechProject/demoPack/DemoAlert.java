package demoPack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoAlert {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
	
		//driver.get("file:///C:/Users/Sreenatha%20Reddy/Desktop/SreeAlerts.html");
		
			driver.findElement(By.xpath("//button[text()='Generate Alert Box']")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='Generate Alert Box']")).click();
		Thread.sleep(3000);
		String altText=driver.switchTo().alert().getText();
		System.out.println(altText);
		
		driver.switchTo().alert().accept();
		driver.findElement(By.xpath("//button[text()='Generate Alert Box']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()=\"Generate Confirm Box\"]")).click();
		driver.switchTo().alert().accept();
		String text1=driver.switchTo().alert().getText();
		System.out.println(text1);
				

	}

}
