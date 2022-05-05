package Actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pgm5New {

	public static void main(String[] args) {
		
		WebDriver nee=new ChromeDriver();
		 nee.get("https://mail.google.com/");		
		 nee.navigate().to("https://www.google.com/");
		 nee.navigate().back();
		 nee.getCurrentUrl();
		System.out.println( nee.getCurrentUrl());
		 nee.navigate().forward();
		 nee.getCurrentUrl();
		System.out.println( nee.getCurrentUrl());
	}

}
