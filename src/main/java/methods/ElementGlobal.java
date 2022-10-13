package methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementGlobal {

    public static WebDriver driver = null;

    public ElementGlobal(WebDriver driver) {
        ElementGlobal.driver = driver;
    }

    /******************************************************************************
     METHODS FOR FIND ELEMENT WITHOUT ACTION
     *****************************************************************************/

    /***
     * findElementByCss
     * @param css
     * @return
     */
    public WebElement findElementByCss(String css) {
        return driver.findElement(By.cssSelector(css));
    }

    /***
     * findElementById
     * @param id
     * @return
     */
    public WebElement findElementById(String id) {
        return driver.findElement(By.id(id));
    }

    /***
     * findElementById
     * @param xpath
     * @return
     */
    public WebElement findElementByXPath(String xpath) {
        return driver.findElement(By.xpath(xpath));
    }

}
