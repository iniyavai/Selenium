package com.BrowserCommands;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class demoGetTitle {
	public static void main(String[] args) {
		
		System.out.println("----Web Page Opening!!!!----");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.bing.com");
		driver.manage().window().maximize();
		String Title = driver.getTitle();
		System.out.println(Title);
		driver.quit();
		
	}

}