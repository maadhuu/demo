package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class test2 {
@Test(priority=-1)
public void calls() {
	Reporter.log("hai",true);
	
}
@Test(priority=1,invocationCount=5)
public void chats() {
	Reporter.log("bai",true);
}
@Test(enabled=false)
public void settings() {
	Reporter.log("cai",true);
}
}
