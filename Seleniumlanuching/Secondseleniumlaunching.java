package Seleniumlanuching;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Secondseleniumlaunching {

	public static void main(String[] args) {
		String path ="C:\\Users\\shubh\\Downloads\\Selenium\\Executeble\\geckodriver.exe";
		String path1= System.getProperty("user.dir")+"\\Executeble\\geckodriver.exe";
		String path2= ".\\Executeble\\geckodriver.exe";
        System.setProperty("webdriver.gecko.driver",path2);
        WebDriver s2 = new FirefoxDriver();
        s2.get("https://www.youtube.com//");
        System.out.println(s2.getPageSource().length());
        System.out.println(s2.getTitle());
        System.out.println(s2.getCurrentUrl());
        s2.close();
	}

}
