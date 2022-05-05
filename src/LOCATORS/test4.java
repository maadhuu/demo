package LOCATORS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test4 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize(); 
		driver.get("https://www.linkedin.com");
		driver.findElement(By.xpath("//a[text()='Sign in']")).click();
		driver.findElement(By.id("username")).sendKeys("madhu.ram32@gmail.com");
		driver.findElement(By.id("password")).sendKeys("murthykathi");
		driver.findElement(By.xpath("//button[text()='Sign in']")).click();
		String title = driver.getTitle();
		System.out.println(title);
		  
	if (title.equals(title)) {
		System.out.println("pass: home page is displayed");
	}
	else
	{
		System.out.println("fail: home page is not displayed");
	}
	String url=driver.getCurrentUrl();
	System.out.println(url);
	
	driver.close();
	}
}
