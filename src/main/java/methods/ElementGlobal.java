package methods;

import lombok.Data;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElementGlobal {

    public static WebDriver driver = null;
    public static WebDriverWait wait = null;

    public ElementGlobal(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement findElementByCss(String css) {
        try{
            return driver.findElement(By.cssSelector(css));
        } catch (NoSuchElementException exception) {
            return null;
        }
    }

}
