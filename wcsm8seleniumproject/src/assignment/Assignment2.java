package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Assignment2 {
	
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");//to avoid IlleaglStatException

		// to handle ConnectionFailedException
		
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		
		WebDriver driver=new ChromeDriver(co);// to launch chrome Browser
		// to maximize browser
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.get("https://www.facebook.com/login/");
		Thread.sleep(2000);
		
		driver.findElement(By.id("email")).sendKeys("abcd");
		Thread.sleep(2000);
		
		driver.findElement(By.id("pass")).sendKeys("1234");
		Thread.sleep(2000);
		driver.close();
}
}
