package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Assignment3 {

		
public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
					
					ChromeOptions co = new ChromeOptions();
					co.addArguments("--remote-allow-origins=*");
					
					WebDriver driver=new ChromeDriver(co);
					driver.manage().window().maximize();
					
					driver.get("http://www.google.com");
					Thread.sleep(2000);
					driver.switchTo().activeElement().sendKeys("Ross geller",Keys.ENTER);
					
					driver.findElement(By.className("lNPNe")).click();
	}

}
