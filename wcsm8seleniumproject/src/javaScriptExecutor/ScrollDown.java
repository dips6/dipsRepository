package javaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollDown {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

		//	Open Browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//launch the web application
		driver.get("https://www.selenium.dev");
		//to perform scrolling operation
		JavascriptExecutor jse = (JavascriptExecutor)driver;//typecast into webdriver
		Thread.sleep(2000);
		//scroll down
		jse.executeScript("window.scrollBy(0,500)");
		WebElement buttonReadMore = driver.findElement(By.xpath("//a[contains(@class,'selenium-id')]"));
		
		jse.executeScript("arguments[0].click();",buttonReadMore);
	}

}
