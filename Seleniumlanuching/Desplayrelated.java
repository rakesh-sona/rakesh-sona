package Seleniumlanuching;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Desplayrelated {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver",".\\Executeble\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	driver.get("https://www.facebook.com/");
	WebElement ref=driver.findElement(By.id("email"));
  System.out.println(ref.isDisplayed());
	System.out.println(ref.isEnabled());
	String rajj=ref.getAttribute("placeholder");
	System.out.println(rajj);
	ref.sendKeys("rakesh.mul123@gmail.com");
	WebElement ref1=driver.findElement(By.id("pass"));
	System.out.println(ref1.isDisplayed());
	System.out.println(ref1.isEnabled());
	String ram=ref1.getAttribute("placeholder");
	System.out.println(ram);
	ref1.sendKeys("Rakesh@1994");
	WebElement ref2=driver.findElement(By.name("login"));
	System.out.println(ref2.isDisplayed());
	System.out.println(ref2.isEnabled());
	String raj=ref2.getText();
	System.out.println(raj);
	ref2.click();
	//Thread.sleep(2000);
driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
	//driver.navigate().back();
	System.out.println(driver.getTitle());

	}

}
