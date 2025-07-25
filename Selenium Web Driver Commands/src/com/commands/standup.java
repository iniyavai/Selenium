package com.commands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class standup {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Iniyavai Kooral\\spring-workspace\\Selenium Web Driver Commands\\EdgeBrowsersJars\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.selenium.dev/downloads/");
		driver.manage().window().maximize();
		
		

	}

}
