package Seleniumlanuching;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Multipledragdrop {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/sortable/");
		WebElement ref=driver.findElement(By.cssSelector(".demo-frame"));
		driver.switchTo().frame(ref);
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		List<WebElement> ref1=driver.findElements(By.cssSelector("#sortable>li"));
		List<WebElement> ref2=driver.findElements(By.cssSelector("#sortable>li"));
		System.out.println(ref1.size());
		Actions ref3=new Actions(driver);
        for(int i=0;i<ref1.size();i++){
        	for(int j=0;j<ref2.size();j++){
        	ref3.dragAndDrop(ref1.get(i), ref2.get(j)).build().perform();
        	
        
        }

		

	}

}}
