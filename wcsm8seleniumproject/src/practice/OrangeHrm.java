package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class OrangeHrm {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");//to avoid IlleaglStatException

		// to handle ConnectionFailedException
		
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		
		WebDriver driver=new ChromeDriver(co);// to launch chrome Browser
		// to maximize browser
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[contains(@name,'me')]")).sendKeys("abcd");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[contains(@type,'word')]")).sendKeys("1234");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[contains(@class,'oxd')]")).click();
		driver.quit();
	
	}

}
