package demoPack;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import dev.failsafe.Timeout;

public class Login {

		public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		//driver.get("https://demo.guru99.com/insurance/v1/register.php");
		//driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.get("https://online.actitime.com/ss3/login.do");
		
		driver.findElement(By.id("username")).sendKeys("sreenathareddy12@gmail.com");
		driver.findElement(By.name("pwd")).sendKeys("anu@1234");
		driver.findElement(By.xpath("//div[text()=\"Login \"]")).click();
		//Thread.sleep(20000);
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
				
		driver.findElement(By.xpath("//a[text()=\"Logout\"]")).click();
		
	
		
		
		
		
		
		/*String Actualtitle =driver.getTitle(); //Facebook – log in or sign up
	String Expectedtitle = "Facebook  – log in or sign up";
	
		
	System.out.println(Actualtitle); //1st output
	
	String URL=driver.getCurrentUrl();
	System.out.println(URL); //2nd output
	
	if (Actualtitle.equals(Expectedtitle)) {
        System.out.println("Pass");
}else{
        System.out.println("fail");
}

				
		
		
		/*driver.get("http://demo.actitime.com");
		
		driver.findElement(By.id("email")).sendKeys("sreenathareddy@gmail.com");
		Thread.sleep(20000);
		driver.findElement(By.name("pass")).sendKeys("test123");
			Thread.sleep(20000);
		driver.close();
		driver.findElement(By.name("login")).click();
		
		
		driver.findElement(By.id("email")).sendKeys("sreenath");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click(); 
		
		
		Thread.sleep(20000);
		
		driver.close();
		driver.findElement(By.id("logoutLink")).click(); */
		
		
	}

}
