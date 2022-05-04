package Seleniumlanuching;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MakemyTrip {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2000,TimeUnit.SECONDS);
		driver.get("https://www.redbus.in/");
		driver.findElement(By.id("src")).sendKeys("Pune");
	driver.findElement(By.cssSelector("[class='autoFill homeSearch']>li:nth-child(3)")).click();
	

	driver.findElement(By.id("dest")).sendKeys("Goa");
	driver.findElement(By.cssSelector("[class='autoFill homeSearch']>li:nth-child(4)")).click();
	
	driver.findElement(By.cssSelector("#onward_cal")).click();
	driver.findElement(By.cssSelector(".next")).click();
	
	driver.findElement(By.cssSelector("table[class='rb-monthTable first last']>tbody>tr:nth-child(5)>td:nth-child(2)")).click();
	driver.findElement(By.id("search_btn")).click();
	driver.findElement(By.cssSelector("ul[class='dept-time dt-time-filter']>li:nth-child(4)>label")).click();
	driver.findElement(By.cssSelector(".list-chkbox>li:nth-child(3)>label:nth-of-type(1)")).click();
	driver.findElement(By.cssSelector("body")).sendKeys(Keys.chord(Keys.COMMAND,Keys.END));
	List<WebElement> ref3=driver.findElements(By.cssSelector("[class='column-two p-right-10 w-30 fl']>div:nth-of-type(1)"));
	
	List<WebElement> ref4=driver.findElements(By.cssSelector("div[class='column-seven p-right-10 w-15 fl']>div>div>span:nth-of-type(1)"));
	for(int i=0;i<ref3.size();i++){
		System.out.println(i+"  "+ref3.get(i).getText()+"price= "+ref4.get(i).getText());
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.chord(Keys.COMMAND,Keys.END));
	}
	}

}
