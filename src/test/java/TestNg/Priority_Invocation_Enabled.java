package TestNg;

import org.testng.annotations.Test;

public class Priority_Invocation_Enabled {
@Test(enabled=false)
public void demo1() {
	System.out.println("Hi demo1");
}
@Test(priority=-6,invocationCount=2)
public void demo2() {
	System.out.println("Hi demo1");
}
@Test(priority=-5,invocationCount=3)
public void demo3() {
	System.out.println("Hi demo1");
}
}
