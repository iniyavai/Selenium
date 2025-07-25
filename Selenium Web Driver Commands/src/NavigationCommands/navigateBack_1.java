package NavigationCommands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigateBack_1 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://opensource-demo.orangehrmlive.com");
		String url = driver.getCurrentUrl();
		System.out.println(url);
		System.out.println(driver.getTitle());
		System.out.println(driver.getPageSource());
		
		
		WebDriver driver1 = new ChromeDriver();
		driver1.manage().window().maximize();
		driver1.navigate().to("https://demo.opencart.com");
		String url1 = driver.getCurrentUrl();
		System.out.println(url1);
		System.out.println(driver.getTitle());
		System.out.println(driver.getPageSource());
		
		driver1.navigate().back();
		System.out.println("Navigated back to: " + driver.getTitle());

	}

}