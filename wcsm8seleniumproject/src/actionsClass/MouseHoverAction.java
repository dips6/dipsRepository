package actionsClass;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;


public class MouseHoverAction {

	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

		//	Open Browser
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//Enter url of (Bluestone)
		driver.get("https://www.bluestone.com/");
		Thread.sleep(2000);
		 // handle alert 
		Alert al = driver.switchTo().alert();
		Thread.sleep(2000);
		//al.accept();
		System.out.println(al.getText());
		al.dismiss();
		Thread.sleep(2000);
		driver.findElement(By.xpath("div[@id='chat-icon']")).click();

	}
}