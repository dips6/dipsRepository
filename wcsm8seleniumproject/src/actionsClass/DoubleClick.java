package actionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

		//	Open Browser
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//enter url of Actitime
		driver.get("http://desktop-c9tk0k1/login.do");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		Thread.sleep(2000);
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//img[@class='sizer'])[5]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'Logo & Color Scheme')]")).click();
		driver.findElement(By.xpath("//input[@id='uploadNewLogoOption']")).click();
		Thread.sleep(2000);
		WebElement target = driver.findElement(By.xpath("//input[@name='formCustomInterfaceLogo.logo']"));
		Actions action = new Actions(driver);
		action.doubleClick(target).perform();
		Thread.sleep(2000);
		driver.quit();
		
		}

}
