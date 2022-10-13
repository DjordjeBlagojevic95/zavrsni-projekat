package testQA;

import io.github.bonigarcia.wdm.WebDriverManager;
import lombok.SneakyThrows;
import methods.Button;
import methods.Input;
import methods.Wait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.io.FileInputStream;
import java.util.Properties;

public class BaseTest {

    public static WebDriver driver;

    public Input input = new Input(driver);
    public Button button = new Button(driver);
    public Wait wait = new Wait(driver);


    @BeforeClass
    public void setup() {
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
    public void navigateToTextBoxPage() {
        FileInputStream fileInputStream = new FileInputStream("src\\main\\resources\\application.properties");
        Properties properties = new Properties();
        properties.load(fileInputStream);

        driver.get(properties.getProperty("textBoxPageUrl"));

    }

    @SneakyThrows
    public void navigateToWebTablesPage() {
        FileInputStream fileInputStream = new FileInputStream("src\\main\\resources\\application.properties");
        Properties properties = new Properties();
        properties.load(fileInputStream);

        driver.get(properties.getProperty("webTablesPage"));

    }
}
