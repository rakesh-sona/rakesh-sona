package Seleniumlanuching;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Listmethod {

	public static void main(String[] args) {
		String path=System.getProperty("user.dir")+"\\Executeble\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/?&ext");
		List<WebElement> ref=driver.findElements(By.cssSelector("#nav-xshop>a"));
		System.out.println(ref.size());
		for(int i=0;i<ref.size();i++){
			WebElement ref1=ref.get(i);
			String raj=ref1.getText();
			System.out.println(raj);
			if(raj.equals("Amazon Pay")){
				ref1.click();
				break;
			}
			
		}
	}

}
