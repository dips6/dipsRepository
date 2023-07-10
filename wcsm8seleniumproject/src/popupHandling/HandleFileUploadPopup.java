package popupHandling;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandleFileUploadPopup {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("http://omayo.blogspot.com/");
		
		//Actions act = new Actions(driver);
		
		WebElement uploadBtn = driver.findElement(By.xpath("//input[@id='uploadfile']"));
		Actions act = new Actions(driver);
	    act.doubleClick(uploadBtn).perform();
	    
	    Runtime.getRuntime().exec("./autoitProgram/OmayoFileUpload.exe");
	    
		
		
	}

}
