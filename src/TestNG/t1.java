package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class t1 {
@Test
public void tc1() {
Reporter.log("HELLO",true);
Reporter.log("hai",false);
}
}

