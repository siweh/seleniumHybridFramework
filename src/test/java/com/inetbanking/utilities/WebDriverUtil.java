package com.inetbanking.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class WebDriverUtil {
    public static WebDriver driver;
    public static String baseUrl = "https://demo.guru99.com/v3/index.php";
    public static String email = "sane@gmail.com";
    public static String username = "mngr508666";
    public static String password = "ynUpEtA";
    public static final String currentDir = System.getProperty("user.dir");

    @BeforeClass
    public static void setUp(){
        System.setProperty("webdriver.chrome.driver", currentDir + "\\Drivers\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @AfterClass
    public static void tearDown(){
        driver.quit();
    }
}
