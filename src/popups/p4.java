package popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class p4 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://skillrary.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.name("q")).sendKeys("core java for selenium");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		//WebElement eel = driver.findElement(By.id("image-3"));
		
		//course_body Den
		WebElement ele = driver.findElement(By.xpath("//a[text()='Core Java For Selenium Trainin']"));
		//WebElement eel = driver.findElement(By.xpath("//a[text()='Core Java For Selenium Trainin']"));
		Actions a=new Actions(driver);
		a.moveToElement(ele).perform();
		
		
		driver.findElement(By.xpath("//body[@class='course_body en']")).click();
		driver.switchTo().frame(0);
		
		//driver.findElement(By.xpath("//body[@class='sxim-init en']")).click();
		//driver.findElement(By.xpath("//div[@class='pause-icon']")).click();
		//driver.switchTo().frame(0);
		//driver.findElement(By.xpath("//body[@class='course_body en']")).click();
		
		//driver.findElement(By.xpath("//div[@class='pause-icon']")).click();
		
		
		//driver.findElement(By.xpath("//span[text()='Add To Wishlist']")).click();
		

	}

}
