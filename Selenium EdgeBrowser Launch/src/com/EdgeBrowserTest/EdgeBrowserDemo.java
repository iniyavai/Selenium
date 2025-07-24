package com.EdgeBrowserTest;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import java.util.ArrayList;
import java.util.List;
public class EdgeBrowserDemo {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.edge.driver", "C:\\Users\\Iniyavai Kooral\\spring-workspace\\Selenium EdgeBrowser Launch\\EdgeBrowserJars\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        // List of URLs to open
        String[] urls = {
            "https://www.hollandandbarrett.com/",
            "https://opensource-demo.orangehrmlive.com/",
            "https://demo.opencart.com/",
            "http://www.bing.com",
            "https://www.freecrm.com/",
            "http://www.half.ebay.com"
        };
        List<String> tabs = new ArrayList<>();
        // Open first URL in current tab
        driver.get(urls[0]);
        tabs.add(driver.getWindowHandle());
        System.out.println("Title 1: " + driver.getTitle());
        // Open rest in new tabs
        for (int i = 1; i < urls.length; i++) {
            js.executeScript("window.open('" + urls[i] + "', '_blank');");
            Thread.sleep(1000); // Allow tab to load
        }
        // Switch to each tab and print title
        ArrayList<String> handles = new ArrayList<>(driver.getWindowHandles());
        for (int i = 1; i < handles.size(); i++) {
            driver.switchTo().window(handles.get(i));
            Thread.sleep(2000); // Wait to ensure page loads
            System.out.println("Title " + (i + 1) + ": " + driver.getTitle());
        }
        // Optional: Close all tabs
        driver.quit();
    }
}