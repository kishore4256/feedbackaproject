package feedback;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class invalidusernameandpassword {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","D:\\Application\\selenium\\drivers\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
		driver.get("http://feedback.wegren.com/admin/login");
		driver.findElement(By.id("email")).sendKeys("rajesh@gmail.com");
		driver.findElement(By.name("password")).sendKeys("kjshsgorei");
		String xp= "//button[text()='Sign In']";
		driver.findElement(By.xpath(xp)).click();
		Thread.sleep(2000);
		String actual_error ="//div[text()='Whoops! There were some problems with your input.Invalid credentials.']";
		driver.findElement(By.xpath(actual_error)).getText();
	    String expected_error="Whoops! There were some problems with your input.Invalid credentials.";
		
	
		Thread.sleep(5000);
		driver.close();
	}

	

}