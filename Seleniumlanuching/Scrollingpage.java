package Seleniumlanuching;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Scrollingpage {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.redbus.in/search?&toCityName=Thane%20West,%20Mumbai&fromCityName=Swargate,%20Pune&onward=27-Apr-2022&fromCityId=67159&toC&toCityId=92777&srcCountry=IND&destCountry=IND");
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.ARROW_DOWN);
		WebDriverWait wait=new WebDriverWait(driver,20);
		WebElement bus=driver.findElement(By.cssSelector(".list-chkbox>li:nth-child(3)>label"));
		wait.until(ExpectedConditions.elementToBeClickable(bus));
		bus.click();
	}

}
