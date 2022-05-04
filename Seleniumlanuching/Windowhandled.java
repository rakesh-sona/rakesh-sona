package Seleniumlanuching;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Windowhandled {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://etrain.info/in");
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		String str=driver.getWindowHandle();
		System.out.println(str);
	driver.findElement(By.cssSelector("[class='icon-linkedin']")).click();
	Set<String> str2=driver.getWindowHandles();
	System.out.println(str2);
	str2.remove(str);
	System.out.println(str2);
	Iterator<String> itr=str2.iterator();
	//System.out.println(itr.next());
	String raj=itr.next();
	driver.switchTo().window(raj);
	System.out.println(driver.getCurrentUrl());
	System.out.println(driver.getTitle());
	
	driver.close();
	driver.switchTo().window(str);
	System.out.println(driver.getCurrentUrl());
     System.out.println(driver.getTitle());	
	driver.close();
	}

}
