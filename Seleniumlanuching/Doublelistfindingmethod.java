package Seleniumlanuching;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Doublelistfindingmethod {
	 void meth(){
		System.setProperty("webdriver.chrome.driver", ".\\Executeble\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.gsmarena.com/");
		List<WebElement> ref=driver.findElements(By.cssSelector(".brandmenu-v2 >ul>li>a"));
		System.out.println(ref.size());
		for(int i=0;i<ref.size();i++){
			System.out.println("index no.="+i+"  -"+ref.get(i).getText());
		}
		driver.findElement(By.cssSelector(".brandmenu-v2 >ul>li>a")).click();
		System.out.println("*********");
		List<WebElement> ref1=driver.findElements(By.cssSelector("#review-body>div>ul>li>a"));
		System.out.println(ref1.size());
		for(int i=0;i<ref1.size();i++){
			System.out.println(ref1.get(i).getText());
		}
	 }
	 
public static void main(String[] args){
	Doublelistfindingmethod ref=new Doublelistfindingmethod();
	ref.meth();
}
}
