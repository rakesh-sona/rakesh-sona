package Seleniumlanuching;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Nonstandarddropdown {

	public static void main(String[] args) {
	System.setProperty("webdriver.gecko.driver",".\\Executeble\\geckodriver.exe");
	WebDriver driver =new FirefoxDriver();
	driver.get("https://thompsonsj.com/bootstrap-select-dropdown/");
	driver.findElement(By.id("bsd1-container")).click();
	
	List<WebElement> ref=driver.findElements(By.cssSelector(".dropdown-menu.dropdown-menu-right.show>div>a"));
	System.out.println(ref.size());
	for(int i=0;i<ref.size();i++){
		System.out.println(i+" "+ref.get(i).getText());
	}
	ref.get(3).click();
	
	}

}
