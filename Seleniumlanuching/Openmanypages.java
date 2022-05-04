package Seleniumlanuching;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Openmanypages {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
     WebDriver driver=new ChromeDriver();
     driver.manage().window().maximize();
     driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
     driver.get("https://www.gsmarena.com/sony-phones-7.php");
     List<WebElement> ref=driver.findElements(By.cssSelector("div.nav-pages>a"));
     System.out.println(ref.size());
     for(int i=0;i<ref.size();i++){
    	 ref.get(i).click();
    	 System.out.println(driver.getCurrentUrl());
   	 ref=driver.findElements(By.cssSelector("div.nav-pages>a"));
     }
	}

}
