package NavigationCommands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigate_1 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://opensource-demo.orangehrmlive.com");
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		WebDriver driver1 = new ChromeDriver();
		driver1.manage().window().maximize();
		driver1.navigate().to("https://demo.opencart.com");
		String url1 = driver.getCurrentUrl();
		System.out.println(url1);
		
		WebDriver driver2 = new ChromeDriver();
		driver2.manage().window().maximize();
		driver2.navigate().to("https://www.bing.com");
		String url2 = driver.getCurrentUrl();
		System.out.println(url2);
		
		WebDriver driver3 = new ChromeDriver();
		driver3.manage().window().maximize();
		driver3.navigate().to("https://www.freecrm.com");
		String url3 = driver.getCurrentUrl();
		System.out.println(url3);
		
		WebDriver driver4 = new ChromeDriver();
		driver4.manage().window().maximize();
		driver4.navigate().to("https://www.half.ebay.com");
		String url4 = driver.getCurrentUrl();
		System.out.println(url4);

	}

}