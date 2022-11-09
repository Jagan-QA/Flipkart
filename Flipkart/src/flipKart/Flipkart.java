package flipKart;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Flipkart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/waits.xhtml");
	/*    WebElement close= driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
	    close.click();
	    WebElement fashion = driver.findElement(By.xpath("//div[text()='Fashion']"));
	    Actions action = new Actions(driver);
	    action.moveToElement(fashion).perform();
	    Thread.sleep(3000);
	    WebElement menfootwear= driver.findElement(By.xpath("//a[text()='Men Footwear']"));
	    action.moveToElement(menfootwear).perform();
		WebElement button=	driver.findElement(By.xpath("//a[text()='Active Footwear']"));
	 	button.click();
	 	*/
		WebElement button = driver.findElement(By.xpath("//button[@id='j_idt87:j_idt98']"));
		button.click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	WebElement changed=	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Did you notice?']")));
	
	if (changed.isDisplayed()){
		System.out.println("Given text has changed to : Did you notice?");
		
	}
	else {
		System.out.println("Text is not changed");
	}
	}

}
