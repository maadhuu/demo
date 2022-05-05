package TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parallel {

	  public WebDriver driver;
	  
	  @Parameters({"browsername"})
	  @Test
	  public void tc1(String browser) {
		  if (browser.equals("chrome")) {
			  driver=new ChromeDriver();
		  }
		  else
		  {
			  driver=new FirefoxDriver();
		  }
		  driver.manage().window().maximize();
		  driver.get("https://www.facebook.com/");
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 // driver.findElements(By.id("email")).sendKeys("15525");
		//  driver.findElements(By.id("pass")).sendKeys("456665");
		  driver.findElement(By.name("login")).click();
		  String title = driver.getTitle();
		  Reporter.log(title,true);
		  String url = driver.getCurrentUrl();
		  Reporter.log(url,true);
	  }
}
