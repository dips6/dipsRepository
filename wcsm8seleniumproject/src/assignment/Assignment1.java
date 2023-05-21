package assignment;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Assignment1 {

	// by using manage method...

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");

		WebDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();

		Dimension targetSize = new Dimension(350,450);

		Thread.sleep(2000);
		driver.manage().window().setSize(targetSize);

		
		Dimension targetSize1 = new Dimension(350,450);

		Thread.sleep(2000);
		driver.manage().window().setSize(targetSize1);
		
		Point targetPosition = new Point(450,350);
		Thread.sleep(2000);
		driver.manage().window().setPosition(targetPosition);
	}

}