package testQA;

import io.github.bonigarcia.wdm.WebDriverManager;
import lombok.SneakyThrows;
import methods.Input;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.io.FileInputStream;
import java.util.Properties;

public class BaseTest {

    public static WebDriver driver;
    public static WebDriverWait webDriverWait;

    public Input input = new Input(driver);


    @BeforeClass
    public static void setup() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        options.addArguments("--start-maximized");

        driver = new ChromeDriver(options);
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }

    @SneakyThrows
    public void login() {
        FileInputStream fileInputStream = new FileInputStream("src\\main\\resources\\application.properties");
        Properties properties = new Properties();
        properties.load(fileInputStream);

        try {
            driver.get(properties.getProperty("url"));
        } finally {
            driver.quit();
        }

    }

    @SneakyThrows
    public void navigateToTextBoxPage() {
        FileInputStream fileInputStream = new FileInputStream("src\\main\\resources\\application.properties");
        Properties properties = new Properties();
        properties.load(fileInputStream);
        try {
            driver.get(properties.getProperty("textBoxPageUrl"));
        } finally {
            driver.quit();
        }
    }
}
