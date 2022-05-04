package Seleniumlanuching;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Framewindow {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		//WebElement ref=driver.findElement(By.cssSelector(".demo-frame"));
	    driver.switchTo().frame(0);
	   driver.manage().timeouts().implicitlyWait(2000,TimeUnit.SECONDS );
	    WebElement ref1=driver.findElement(By.cssSelector("[id='draggable']"));
	    WebElement ref2=driver.findElement(By.cssSelector("[id='droppable']"));
	    Actions ref3=new Actions(driver);
       ref3.dragAndDrop(ref1, ref2).build().perform();
       driver.switchTo().defaultContent();
       driver.findElement(By.cssSelector(".logo>a")).click();;
	    

	}

}
