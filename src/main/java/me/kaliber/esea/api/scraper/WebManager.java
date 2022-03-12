package me.kaliber.esea.api.scraper;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public final class WebManager {

    private final WebDriver driver = new ChromeDriver();

    static {
        WebDriverManager.chromedriver().setup();
    }

    public WebDriver driver() {
        return driver;
    }
}
