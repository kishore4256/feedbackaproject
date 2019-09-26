package feedback;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class browser {

	public static void main(String[] args) throws InterruptedException 
	{
		//Chromebrowser
		System.setProperty("webdriver.chrome.driver","D:\\Application\\selenium\\drivers\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
		driver.get("http://feedback.wegren.com/admin/login");
		Thread.sleep(10000);
		driver.close();
	}

}
