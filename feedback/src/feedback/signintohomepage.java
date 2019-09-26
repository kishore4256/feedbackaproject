package feedback;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class signintohomepage {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","D:\\Application\\selenium\\drivers\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
		driver.get("http://feedback.wegren.com/admin/login");
		driver.findElement(By.id("email")).sendKeys("admin@wegren.com");
		driver.findElement(By.name("password")).sendKeys("123456789");
		String xp= "//button[text()='Sign In']";
		driver.findElement(By.xpath(xp)).click();
		Thread.sleep(10000);
		driver.close();	

	}

}
