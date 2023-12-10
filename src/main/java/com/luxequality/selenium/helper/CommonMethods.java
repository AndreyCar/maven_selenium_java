package com.luxequality.selenium.helper;

import java.time.Duration;
import java.util.logging.Logger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CommonMethods extends PageInitializer {
    public static WebDriver driver;
    public static WebDriverWait wait;
    public static Logger logger = Logger.getLogger(CommonMethods.class.getName());

    public void runBrowser() {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--headless=new");
        chromeOptions.addArguments("--start-maximized");
        chromeOptions.addArguments("--window-size=1920,1080");

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(chromeOptions);

        wait = new WebDriverWait(driver, Duration.ofSeconds(30));

        initializer();
    }

    public void waitForVisibility(WebElement element) {
        wait.until(d -> element.isDisplayed());
    }

}
