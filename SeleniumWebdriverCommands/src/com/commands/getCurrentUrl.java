package com.commands;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class getCurrentUrl {
	public static void main(String[] args) {
		
		System.out.println("----Web Page Opening!!!!----");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.bing.com");
		driver.manage().window().maximize();
		String URL=driver.getCurrentUrl();
		System.out.println(URL);
		
	}

}