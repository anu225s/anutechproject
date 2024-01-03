package demoPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Dem1SS {

	public static void main(String[] args) throws InterruptedException {
		String baseURL = "https://demo.guru99.com/test/newtours/register.php";
	    WebDriver driver = new FirefoxDriver();
		driver.get(baseURL);
		/*		//driver.findElement(By.name("country"));
		Select dd=new Select(driver.findElement(By.name("country")));
     dd.selectByIndex(10); 
       Thread.sleep(1000);
     dd.selectByValue("ANTIGUA AND BARBUDA");
     Thread.sleep(1000);
     dd.selectByVisibleText("BELGIUM");
     driver.get("http://jsbin.com/osebed/2");
    // driver.findElement(By.id("fruits"));
     Select f1=new Select(driver.findElement(By.id("fruits")));
		f1.selectByIndex(1);
		f1.selectByIndex(2);
		Thread.sleep(10000);
		f1.deselectByIndex(1);
		Thread.sleep(10000);
		f1.selectByIndex(0);
		f1.selectByVisibleText("Grape");
		f1.deselectAll();
		
		
		/*Select drpCountry = new Select(driver.findElement(By.name("country")));
		//drpCountry.selectByVisibleText("ANTARCTICA");

		//Selecting Items in a Multiple SELECT elements
		driver.get("http://jsbin.com/osebed/2");
		Select fruits = new Select(driver.findElement(By.id("fruits")));
		fruits.selectByVisibleText("Banana");
		fruits.selectByIndex(1);
		
		driver.get("https://www.selenium.dev/");
		// A new tab is opened and switches to it
		driver.switchTo().newWindow(WindowType.TAB);
		// Loads Sauce Labs open source website in the newly opened window
		driver.get("https://opensource.saucelabs.com/"); */
		
		driver.get("https://www.google.com/");
		// A new window is opened and switches to it
		driver.switchTo().newWindow(WindowType.WINDOW);
		// Loads Sauce Labs open source website in the newly opened window
		driver.get("https://facebook.com/");

		
		driver.get("https://www.selenium.dev//");
			// A new window is opened and switches to it
		driver.switchTo().newWindow(WindowType.TAB);
		// Loads Sauce Labs open source website in the newly opened window
		driver.get("https://www.amazon.in/");
		Thread.sleep(10000);
		driver.quit();
		


 }


	}

