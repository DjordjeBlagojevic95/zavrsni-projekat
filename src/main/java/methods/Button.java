package methods;

import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Button extends ElementGlobal {

    public Button(WebDriver driver) {
        super(driver);
    }

    WebElement el = null;
    List<WebElement> elements = null;

    /***
     * findElementByCssAndClick
     * @param css
     */
    public void findElementByCssAndClick(String css) {
        try {
            findElementByCss(css).click();
        } catch (NullPointerException | JavascriptException notClicked) {
            System.out.println("Could not click element css:" + css +". It was null.");
        }
    }

    /***
     * findElementByXPathAndClick
     * @param xPath
     */
    public void findElementByXPathAndClick(String xPath) {
        el = findElementByXPath(xPath);
        try {
            el.click();
        } catch (NullPointerException | JavascriptException notClicked) {
            System.out.println("Could not click element xpath:" + xPath +". It was null.");
        }
    }

}
