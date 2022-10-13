package methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Input extends ElementGlobal {

    public Input(WebDriver driver) {
        super(driver);
    }

    WebElement el = null;
    List<WebElement> eles = null;

    /***
     * findElementByCssAndSendKeys
     * @param css
     * @param keys
     */
    public void findElementByCssAndSendKeys(String css, String keys) {
        findElementByCss(css).sendKeys(keys);
    }

    public String findElementByCssAndGetText(String css) {
        return findElementByCss(css).getText();
    }

    public void findElementByCssAndClearText(String css) {
        findElementByCss(css).clear();
    }

    public String findElementByXPathAndGetText(String xpath) {
        return findElementByXPath(xpath).getText();
    }


}
