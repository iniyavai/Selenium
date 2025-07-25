package NavigationCommands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigate_forward {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.bing.com");
		String url = driver.getCurrentUrl();
		System.out.println(url);
		System.out.println(driver.getTitle());
		System.out.println(driver.getPageSource());
		
		
		WebDriver driver1 = new ChromeDriver();
		driver1.manage().window().maximize();
		driver1.navigate().to("https://www.freecrm.com");
		String url1 = driver.getCurrentUrl();
		System.out.println(url1);
		System.out.println(driver.getTitle());
		System.out.println(driver.getPageSource());
		
		driver1.navigate().forward();
		System.out.println("Navigated forward to: " + driver1.getTitle());
		
		driver.navigate().refresh();
		System.out.println("Refreshed page: " + driver.getTitle());

	}

}