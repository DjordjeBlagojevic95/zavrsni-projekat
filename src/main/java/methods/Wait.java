package methods;

import org.openqa.selenium.By;
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
        return new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(css)));
    }

    public WebElement waitForElementToBeClickableByCss(String css) {
        return new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.elementToBeClickable(By.cssSelector(css)));
    }

    public WebElement visibilityOfElementByCss(String css) {
        return new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(css)));
    }
}
