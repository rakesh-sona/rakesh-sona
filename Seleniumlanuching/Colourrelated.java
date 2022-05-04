package Seleniumlanuching;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Colourrelated {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://crmaccess.vtiger.com/log-in/");
		WebElement ref= driver.findElement(By.cssSelector("button[type='submit']"));
		String ref2=ref.getCssValue("color");
		String ref3=ref.getCssValue("background-color");
		String ref4=ref.getCssValue("font-size");
		System.out.println(ref2);
		System.out.println("background-colour>"+ref3);
		System.out.println(ref4);
	}

}
