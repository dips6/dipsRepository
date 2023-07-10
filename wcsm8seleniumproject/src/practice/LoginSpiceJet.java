package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LoginSpiceJet {
	
	public static void main(String[] args) throws InterruptedException {
		
	
	
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");//to avoid IlleaglStatException

	// to handle ConnectionFailedException
	
	ChromeOptions co = new ChromeOptions();
	co.addArguments("--remote-allow-origins=*");
	
	WebDriver driver=new ChromeDriver(co);// to launch chrome Browser
	// to maximize browser
	driver.manage().window().maximize();
	
	driver.get("https://www.spicejet.com/");
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//div[text()='Login']")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//input[@type='number']")).sendKeys("8888888888");
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("dips61992");
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//div[@class='css-76zvg2 r-jwli3a r-n6v787 r-1kfrs79 r-q4m81j']")).click();
	driver.quit();

}
}
