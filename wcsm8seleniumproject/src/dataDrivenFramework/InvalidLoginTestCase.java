package dataDrivenFramework;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvalidLoginTestCase {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://desktop-c9tk0k1/login.do");
		
		Flib flib = new Flib();
		String InvalidUsername = flib.readExcelData("./data/ActiTimeTestData.xlsx","InvalidCreds", 1, 0);
	}

}
