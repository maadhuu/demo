package LOCATORS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pgm6 {

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize(); 
		driver.get("https://www.naukri.com/"); 
	driver.findElement(By.xpath("//div[text()='Login']")).click();
	driver.findElement(By.xpath("//contaiins[@type='text']")).sendKeys("madhu.ram32@gmail.com");
	}
}