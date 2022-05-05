package Test;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POM.ZerodhaLogin;
import Utility.Call;
import Utility.Excel;

public class LoginTest {
	WebDriver driver ;
	 
	  @BeforeMethod
	  public void callBrowser() {
		  driver = Call.OpenBrowser("https://kite.zerodha.com/");
	  }
	  
	  @Test
	  public void LoginZerodha() throws IOException, InterruptedException 
	  { 
		ZerodhaLogin zerodha = new ZerodhaLogin(driver) ;
		String name = Excel.getTestData(0, 1, "data");
		String Pass = Excel.getTestData(1, 1, "data");
		String Sub = Excel.getTestData(2, 1, "data");
		zerodha.Enterusername(name);
		zerodha.EnterPassword(Pass);
		zerodha.clickOnLogin();
		
		zerodha.EnterPin(Sub, driver);   // Explicit and FluentDriver
	  zerodha.ClickOnSubmit();
	  }
	  
}
