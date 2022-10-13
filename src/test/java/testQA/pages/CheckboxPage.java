package testQA.pages;

import testQA.BaseTest;

public class CheckboxPage extends BaseTest {

    protected static final String toggle = "[title=\"Toggle\"]";
    protected static final String checkbox = "//*[@id=\"tree-node\"]/ol/li/ol/li[3]/span/label/span[1]";

    protected static final String output = "[id=\"result\"]";

    public void clickOnToggleButton() {
        button.findElementByCssAndClick(toggle);
    }

    public void clickOnCheckbox() {
        button.findElementByXPathAndClick(checkbox);
    }

    public String getOutputResult() {
        return input.findElementByCssAndGetText(output);
    }

}
