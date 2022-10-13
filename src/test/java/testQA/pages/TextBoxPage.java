package testQA.pages;

import testQA.BaseTest;

public class TextBoxPage extends BaseTest {

    protected static final String fullNameInputField = "[id=\"userName\"]";
    protected static final String emailInputField = "[id=\"userEmail\"]";
    protected static final String currentAddressInputField = "[id=\"currentAddress\"]";
    protected static final String permanentAddressInputField = "[id=\"permanentAddress\"]";
    protected static final String submitButton = "[id=\"submit\"]";
    protected static final String outputFieldName = "[id=\"name\"]";
    protected static final String outputFieldEmail = "[id=\"email\"]";
    protected static final String outputFieldCurrentAddress = "[id=\"output\"] [id=\"currentAddress\"]";
    protected static final String outputFieldPermanentAddress = "[id=\"output\"] [id=\"permanentAddress\"]";


    public void inputTextInFullNameField(String keys) {
        input.findElementByCssAndSendKeys(fullNameInputField, keys);
    }

    public void inputTextInEmailField(String keys) {
        input.findElementByCssAndSendKeys(emailInputField, keys);
    }

    public void inputTextInCurrentAddressField(String keys) {
        input.findElementByCssAndSendKeys(currentAddressInputField, keys);
    }

    public void inputTextInPermanentAddressField(String keys) {
        input.findElementByCssAndSendKeys(permanentAddressInputField, keys);
    }

    public void clickOnSubmitButton() {
        button.findElementByCssAndClick(submitButton);
    }

    public String getNameOutputFieldText() {
        return input.findElementByCssAndGetText(outputFieldName);
    }

    public String getEmailOutputFieldText() {
        return input.findElementByCssAndGetText(outputFieldEmail);
    }

    public String getAddressOutputFieldText() {
        return input.findElementByCssAndGetText(outputFieldCurrentAddress);
    }

    public String getPermanentAddressOutputFieldText() {
        return input.findElementByCssAndGetText(outputFieldPermanentAddress);
    }


}
