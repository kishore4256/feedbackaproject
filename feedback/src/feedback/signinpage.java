package feedback;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class signinpage {

	public static void main(String[] args) throws InterruptedException 
	{
		//Chromebrowser
				System.setProperty("webdriver.chrome.driver","D:\\Application\\selenium\\drivers\\chromedriver_win32\\chromedriver.exe");
			    WebDriver driver = new ChromeDriver();
			    driver.manage().window().maximize();
				driver.get("http://feedback.wegren.com/admin/login");
				String pagename=driver.getTitle();
				System.out.println(pagename);
				String url=driver.getCurrentUrl();
				System.out.println(url);
				Thread.sleep(10000);
				driver.close();
			}
	

	}
