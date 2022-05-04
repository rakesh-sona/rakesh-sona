package Seleniumlanuching;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Pagedown {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		WebElement ref=driver.findElement(By.xpath("//body"));
		ref.sendKeys(Keys.ESCAPE);
	//	driver.findElement(By.cssSelector("button._2KpZ6l")).click();
		
		for(int i=1;i<=12;i++){
			ref.sendKeys(Keys.PAGE_DOWN);
			Thread.sleep(2000);
		}
		ref.sendKeys(Keys.chord(Keys.CONTROL,Keys.HOME));

	}

}
