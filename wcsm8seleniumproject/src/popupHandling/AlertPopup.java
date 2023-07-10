package popupHandling;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopup {
	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///C:/Users/Vijay/Desktop/WebBasedPopup.html");
		
		
		//To generate popup click on Button
		driver.findElement(By.xpath("//button[text()=' click me!']")).click();
		
//		//Handle Alert popup by using Robot class
//		Robot robot = new Robot();
//		robot.keyPress(KeyEvent.VK_ENTER);
//		
		//Handle alert popup by using switchTo
		Alert al = driver.switchTo().alert();
		al.accept();
		
		//Return the text of Alert popup
		System.out.println(al.getText());
	}

}
