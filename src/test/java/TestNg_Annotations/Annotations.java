package TestNg_Annotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations {
@BeforeSuite
public void Bsuite() {
	System.out.println("Hi Before Suite");
}
@AfterSuite
public void asuite() {
	System.out.println("Bye After suite");
}
@BeforeTest
public void btest() {
	System.out.println("Hi Before test");
}
@AfterTest
public void atest() {
	System.out.println("Hi After test");
}
@BeforeClass
public void bclass() {
	System.out.println("Hi before class");
}
@AfterClass
public void aclass() {
	System.out.println("Hi after class");
}
@BeforeMethod
public void bmethod() {
	System.out.println("Hi before method");
}
@AfterMethod
public void amethod() {
	System.out.println("Hi after method");
}
@Test
public void mainmethod() {
	System.out.println("Hi main method");
}
}
