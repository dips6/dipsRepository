package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AirIndia {
	public static void main(String[] args) throws InterruptedException  {
		
	
	
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");//to avoid IlleaglStatException

	// to handle ConnectionFailedException
	
	ChromeOptions co = new ChromeOptions();
	co.addArguments("--remote-allow-origins=*");
	
	WebDriver driver=new ChromeDriver(co);// to launch chrome Browser
	// to maximize browser
	driver.manage().window().maximize();
	
	driver.get("https://www.airindia.com/ ");
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//input[@id='mat-radio-2-input']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@class='form-control px-0' and @placeholder='From']")).sendKeys("Pune");
	
	
	}
}
	


