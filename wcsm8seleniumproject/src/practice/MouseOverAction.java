package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOverAction {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

		//	Open Browser
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//Enter url of (Bluestone)
		driver.get("https://www.bluestone.com/");
		
		driver.findElement(By.id("denyBtn")).click();
		Thread.sleep(2000);
		WebElement target = driver.findElement(By.xpath("//a[text()='Coins ']"));
		Actions act = new Actions(driver);
		act.moveToElement(target).perform();
	}

}
