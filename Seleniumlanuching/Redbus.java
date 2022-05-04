package Seleniumlanuching;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Redbus {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
	driver.get("https://www.makemytrip.com/flights/?cmp");
		driver.findElement(By.cssSelector("li[data-cy='account']")).click();
		driver.findElement(By.cssSelector("#fromCity")).sendKeys("pune");
	
	driver.findElement(By.cssSelector("li[role='option']>div>div:nth-of-type(1)")).click();
	
	driver.findElement(By.cssSelector("#toCity")).sendKeys("Bangluru");
	driver.findElement(By.cssSelector("li[role='option']>div>div:nth-of-type(1)")).click();
	
		
				

		
	}

}