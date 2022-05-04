package Seleniumlanuching;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Draganddrop {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		WebElement ref=driver.findElement(By.cssSelector(".demo-frame.lazyloaded"));
		driver.switchTo().frame(ref);
	List<WebElement> ref2=driver.findElements(By.cssSelector("ul#gallery>li"));
	Actions ref3=new Actions(driver);
	WebElement ref4=driver.findElement(By.id("trash"));
	ref3.dragAndDrop(ref2.get(0), ref4).build().perform();
	Thread.sleep(1000);
	ref3.dragAndDrop(ref2.get(1), ref4).build().perform();
	}

}
