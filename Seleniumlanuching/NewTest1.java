package Seleniumlanuching;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class NewTest1 {
  @Test(dependsOnMethods="newTest")
  public void f() {
	  System.out.println("definately");
  }
  @Test(priority=1)
 public void newTest(){
	  System.out.println("constructor");  
  }
  @Test(enabled=true,dependsOnMethods="f")
  public void d(){
	  System.out.println('d');
  }
}
