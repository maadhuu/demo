package LOCATORS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test0 {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("madhu.ram32@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("KINGtiger@11");
		driver.findElement(By.name("login")).click();
		

	}

	
	}


