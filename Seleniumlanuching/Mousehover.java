package Seleniumlanuching;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Mousehover {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.globalsqa.com/demo-site/");
		List<WebElement> ref=driver.findElements(By.xpath("//div[@id='menu']//ul//li//a"));
		System.out.println(ref.size());
		Actions ref1=new Actions(driver);
		for(int i=0;i<ref.size();i++){
			WebElement ref2=ref.get(i);
			ref1.moveToElement(ref2).perform();
		//	Thread.sleep(2000);
		}

	}

}
