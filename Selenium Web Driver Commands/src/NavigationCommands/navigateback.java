package NavigationCommands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigateback {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		String url = driver.getCurrentUrl();
		System.out.println(url);
		driver.manage().window().maximize();
		
		driver.navigate().to("https://login.yahoo.com/");
		String URL = driver.getCurrentUrl();
		System.out.println(URL);
		
		driver.navigate().back();
		URL = driver.getCurrentUrl();
		System.out.println(URL);
		driver.quit();
	}

}
