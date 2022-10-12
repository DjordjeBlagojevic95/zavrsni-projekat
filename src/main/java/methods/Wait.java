package methods;


import lombok.Data;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Wait extends ElementGlobal {

    public Wait(WebDriver driver) {
        super(driver);
    }

    public WebElement presenceOfElementByCss(String css) {
        try {
            return (new WebDriverWait(driver, Duration.ofSeconds(10))
                    .until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(css))));
        } catch(NoSuchElementException exepction) {
            return null;
        }
    }
}
