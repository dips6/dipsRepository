package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AirIndia {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("WebDriver.chrome.driver","./drivers/chromedriver.exe");
		
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		
		WebDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		
		driver.get("https://www.ixigo.com/flights?utm_source=Google_Search&utm_medium=paid_search_google&utm_campaign=Generic_Search_Feb23_NewUserGGL&gclid=Cj0KCQjw27mhBhC9ARIsAIFsETF35Ue-f57oo4bltvl4wo2hOruOGP0o1tuU4EtOVk1xBFTmlKV1aPQaAthpEALw_wcB");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='returnDateRequiredNo']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='div']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='div']")).sendKeys("PUNE");
		
		
	}

}
