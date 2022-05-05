package Syncronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pgm12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize(); 
		driver.get("https://www.facebook.com/"); 
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.findElement(By.xpath("//a[contains(@class,'_42ft')]")).click();
	WebElement ele = driver.findElement(By.name("sex"));
	if(ele.isSelected()) {
	System.out.println("passed: element is selected");
	}
	else
	{
		System.out.println("failed: element is not selected");  
		
	}
	}

}
