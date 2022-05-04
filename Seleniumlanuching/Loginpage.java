package Seleniumlanuching;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Loginpage {

	public static void main(String[] args) {
		String path= System.getProperty("user.dir")+"\\Executeble\\geckodriver.exe";
         System.setProperty("webdriver.gecko.driver", path);
       FirefoxDriver ref=new FirefoxDriver();
      ref.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
         ref.get("https://opensource-demo.orangehrmlive.com/");
         String actual=ref.getTitle();
         String expected="OrangeHRM";
         if(actual.equals(expected)){
        	 System.out.println("OLD NAME IS PRESENT");
         }else{
        	 System.out.println("new name is given");
         }
         ref.findElement(By.id("txtUsername")).sendKeys("Admin");
         ref.findElement(By.id("txtPassword")).sendKeys("admin123");
         ref.findElement(By.id("btnLogin")).click();
         ref.close();
	}

}
