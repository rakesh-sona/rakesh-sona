package Seleniumlanuching;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Direction {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",".\\Executeble\\ChromeDriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://crmaccess.vtiger.com/log-in/");
		WebElement logineId=driver.findElement(By.name("username"));
		Point ref=logineId.getLocation();
		int ref1=ref.getX();
		int ref2=ref.getY();
		System.out.println(ref1);
		System.out.println(ref2);
		WebElement password=driver.findElement(By.name("password"));
		Point ref3=password.getLocation();
		int ref4=ref3.getX();
		int ref5=ref3.getY();
		System.out.println(ref4);
		System.out.println(ref5);
		System.out.println(ref5>ref2);
	}

}
