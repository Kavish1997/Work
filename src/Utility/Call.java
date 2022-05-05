package Utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Call {
	public static WebDriver OpenBrowser (String url) {
		 System.setProperty("webdriver.chrome.driver","D:\\Selenium software\\chromedriver_win32\\chromedriver.exe");
	      WebDriver driver = new ChromeDriver();
	     driver.get(url);
	     driver.manage().window().maximize();
	//   driver.manage().timeouts().implicitlyWait(2000,TimeUnit.MILLISECONDS);  // implicit
	     return driver;
}
}