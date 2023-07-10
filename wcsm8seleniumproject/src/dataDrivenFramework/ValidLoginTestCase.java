package dataDrivenFramework;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidLoginTestCase {
	
	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get(" http://desktop-c9tk0k1/login.do");
		
		//read the data from excel file and test login page
		Flib flib = new Flib();
		
		String ValidUsername = flib.readExcelData("./data/ActiTimeTestData.xlsx","ValidCreds", 1, 0);
		String ValidPassword = flib.readExcelData("./data/ActiTimeTestData.xlsx", "ValidCreds", 1, 1);
				
	    driver.findElement(By.name("username")).sendKeys(ValidUsername);
		Thread.sleep(2000);
		driver.findElement(By.name("pwd")).sendKeys(ValidPassword);
		Thread.sleep(2000);
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(2000);
		
	
		
	}

}
