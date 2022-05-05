package Actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pgm4 {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://mail.google.com/");		
		driver.getCurrentUrl();
		System.out.println("BrowserUrl");
		
		driver.navigate().to("https://www.google.com/");
		driver.getCurrentUrl();
		System.out.println("BrowserUrl");
 	
		driver.close();		

	}

}
