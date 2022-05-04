package Seleniumlanuching;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class NewTest {
  @Test
  public void f() {
	  System.out.println("f");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("beforemethod");
  }

  @AfterMethod
  public void afterMethod() {System.out.println("aftermethod");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("beforetest");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("aftertest");
  }
  @Test
  void login(){
	  int a=10;
	  System.out.println(a);
  }
}
