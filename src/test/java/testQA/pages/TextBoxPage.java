package testQA.pages;

import testQA.BaseTest;

public class TextBoxPage extends BaseTest {

    private String fullNameInputField = "[id=\"userName\"]";

    public void inputTextInFullNameField(String keys) {
        input.findElementByCssAndSendKeys(fullNameInputField, keys);
    }

}
