package demoPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoChrome {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sreenatha Reddy\\Desktop\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://meesho.com");
		//driver.get("https://www.facebook.com/");
		String Url=driver.getCurrentUrl();// returns the current URL OF THE application
		System.out.println(Url);
		String Title=driver.getTitle();// Display the title of the page 
		System.out.println(Title);
		/*driver.findElement(By.id("email")).sendKeys("sadumreddy@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("abcd1234");
		driver.findElement(By.name("login")).click();
		
		Thread.sleep(5000); // 
		//driver.close(); */
		
		
		
	}

}
