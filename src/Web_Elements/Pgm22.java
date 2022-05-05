package Web_Elements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pgm22 {

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize(); 
		driver.get("https://paytm.com/"); 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//span[text()='Sign In']")).click();
		//driver.switchTo().frame(0);
		driver.findElement(By.linkText("Google Play")).click();			
	}

}
