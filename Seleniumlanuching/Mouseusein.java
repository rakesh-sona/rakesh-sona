package Seleniumlanuching;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Mouseusein {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver ref=new ChromeDriver();
		ref.get("http://demo.automationtesting.in/Register.html");
		WebElement driver=ref.findElement(By.cssSelector("[placeholder='First Name']"));
		driver.sendKeys("admin");
		Actions ref1=new Actions(ref);
		ref1.moveToElement(driver).doubleClick().keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
		WebElement ref2=ref.findElement(By.cssSelector("[placeholder='Last Name']"));
		ref1.moveToElement(ref2).doubleClick().keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
		

	}

}

