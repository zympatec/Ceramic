package common;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import static common.Config.BROWSER;
import static constants.Constant.TimeoutVariables.IMPLICIT_WAIT;

public class CommonActions {
    public static WebDriver initializeDriver() {
        WebDriver driver = null;

        if (BROWSER.equals("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        } else if (BROWSER.equals("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        } else if (BROWSER.equals("IE")) {
            WebDriverManager.iedriver().setup();
            driver = new InternetExplorerDriver();
        } else Assert.fail("Incorrect browser name: " + BROWSER);

        driver
                .manage()
                .timeouts()
                .implicitlyWait(IMPLICIT_WAIT,
                        TimeUnit.SECONDS);
        return driver;
    }
}
