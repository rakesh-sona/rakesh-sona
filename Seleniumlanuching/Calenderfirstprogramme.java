package Seleniumlanuching;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Calenderfirstprogramme {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.makemytrip.com/flights/?cmp");
		driver.findElement(By.cssSelector("li[data-cy='account']")).click();
		driver.findElement(By.cssSelector("label[for='departure']")).click();
		driver.findElement(By.cssSelector("span[class='langCardClose']")).click();
		driver.findElement(By.cssSelector("div.DayPicker-Month:last-child>div.DayPicker-Body>div:nth-child(2)>div:nth-of-type(2)>div>p")).click();

	}

}
