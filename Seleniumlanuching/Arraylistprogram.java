package Seleniumlanuching;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Arraylistprogram {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver",".\\Executeble\\geckodriver.exe");
  FirefoxDriver driver =new FirefoxDriver();
// driver.manage().window().setSize(newDimension(500,600));
  driver.get("https://www.demoblaze.com/");
  List<WebElement> ref1=driver.findElements(By.cssSelector(".list-group>a"));
  System.out.println(ref1.size());
  List<String> ref= new ArrayList<String>();
  ref.add("CATEGORIES");
  ref.add("Phones");
  ref.add("Laptops");
  ref.add("Monitors");
  for(int i=0;i<ref1.size();i++){
	  WebElement ram=ref1.get(i);
	  System.out.println(ram.getText());
	  System.out.println(ram.isDisplayed());
	  System.out.println(ram.isEnabled());
	  System.out.println(ram.getText().equals(ref.get(i)));
  }
	}

}
