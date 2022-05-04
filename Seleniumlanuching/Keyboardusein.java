package Seleniumlanuching;



import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Keyboardusein {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(2000,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Register.html");
		WebElement ref= driver.findElement(By.cssSelector("[placeholder='First Name']"));
		ref.sendKeys("admin",Keys.chord(Keys.CONTROL,"a"));
		ref.sendKeys(Keys.chord(Keys.CONTROL,"c"));
		driver.findElement(By.cssSelector("input[placeholder='Last Name']")).sendKeys(Keys.chord(Keys.CONTROL,"v"));
		//driver.findElement(By.xpath("//body")).sendKeys(Keys.PAGE_DOWN);
		List<WebElement> ref2=driver.findElements(By.cssSelector("[type='checkbox']"));
		System.out.println(ref2.size());
		for(int i=0;i<ref2.size();i++){
			System.out.println(ref2.get(i).getText());//this will not come due to identifying only checkbox
			ref2.get(i).click();
		}
		

	}

}
