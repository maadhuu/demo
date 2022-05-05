package Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test3 {

	public static void main(String[] args) {
WebDriver driver= new ChromeDriver();
driver.get("https://www.youtube.com/");

driver.navigate().to("https://www.amazon.com/");

driver.navigate().back();


driver.navigate().forward();



driver.navigate().refresh();

driver.close();
	}
	

}
