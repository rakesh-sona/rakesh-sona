package Seleniumlanuching;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Firstlaunching {

	public static void main(String[] args) {
	String link1="C:\\Users\\shubh\\Downloads\\Selenium\\Executeble\\chromedriver.exe";
		String link= System.getProperty("user.dir")+"\\Executeble\\chromedriver.exe";
		String king=".\\Executeble\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",link);
          ChromeDriver s1=new ChromeDriver();
          s1.get("https://www.facebook.com/");
          String sourcecode= s1.getPageSource();
         // System.out.println(sourcecode);
          System.out.println(sourcecode.length());
          System.out.println(s1.getCurrentUrl());
          System.out.println(s1.getTitle());
          s1.close();
	}

}
