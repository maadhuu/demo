package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class P1 {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://accounts.google.com/");
		
		String Textbox=driver.findElement(By.xpath("//span[text()='Use your Google Account']")).getText();
		System.out.println(Textbox);
		
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		
	String errorMessage=driver.findElement(By.xpath("//[contains(text(),'M12 ')]")).getText();
	System.out.println(errorMessage);
		
		//WebElement abc = driver.findElement(By.xpath("//span[text()='Next']"));
		//abc.click();System.out.println(abc);
		
	}

}
