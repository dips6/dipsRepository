package actionsClass;



import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class MouseHoverAction {

	public static void main(String[] args) throws InterruptedException {


		
		Thread.sleep(2000);
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

		//	Open Browser
		 WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//Enter url of (Bluestone)
	     driver.get("https://www.bluestone.com/");

		driver.findElement(By.id("denyBtn")).click();
		Thread.sleep(2000);
		WebElement target = driver.findElement(By.xpath("//a[contains(text(),'Watch Jewellery')]"));
	    Actions act = new Actions(driver);
	    act.moveToElement(target).perform();
	    Thread.sleep(2000);
	    driver.findElement(By.partialLinkText("Band")).click();
	    Thread.sleep(2000);
	    driver.close();
		
		
		 // handle alert 
		//Alert al = driver.switchTo().alert();
		//Thread.sleep(2000);
		//al.accept();
		//System.out.println(al.getText());
		//al.dismiss();
		//Thread.sleep(2000);
		//driver.findElement(By.xpath("div[@id='chat-icon']")).click();

	}
}