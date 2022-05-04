package Seleniumlanuching;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdownwindowstandard {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\Executeble\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("http://omayo.blogspot.com/");
		WebElement ref=driver.findElement(By.id("multiselect1"));
		Select ref1= new Select(ref);
		System.out.println(ref1.isMultiple());
		//System.out.println(ref1.getFirstSelectedOption().getText());
		List<WebElement> ref2=ref1.getOptions();
		for(int i=0;i<ref2.size();i++){
			System.out.println(ref2.get(i).getText());
		}
		ref1.selectByValue("swiftx");
		ref1.selectByIndex(2);
		System.out.println(ref1.getAllSelectedOptions().size());
		List<WebElement> ref3=ref1.getAllSelectedOptions();
		System.out.println(ref3.size());
		System.out.println(driver.getCurrentUrl());
		}

}
