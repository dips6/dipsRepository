package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Xpath1 {
	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		
		WebDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		 
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@value='2e9f1fe327ba830b2017251ad23ed.3GTZ7Mc3hNod9Ib0nBhNv9PsgCNCroNCtvixEdSQ2Kk.mwi7vZ8GzaNr2emN5G59_Z6ayhYVmLM74L_lRefY7eyXHbeBq3H1oFPD0w']")).sendKeys("Admin");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//form[@class='oxd-form']")).sendKeys("admin123");
		Thread.sleep(2000);
	}

}
