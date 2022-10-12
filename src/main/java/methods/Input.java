package methods;

import lombok.Data;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Input extends ElementGlobal {

    public Input(WebDriver driver) {
        super(driver);
    }

    WebElement el = null;
    List<WebElement> eles = null;

    public void findElementByCssAndSendKeys(String css, String keys) {
        el = findElementByCss(css);
        el.sendKeys(keys);
    }
}
