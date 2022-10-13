package testQA.pages;

import testQA.BaseTest;

public class WebTablesPage extends BaseTest {

    protected static final String addButton = "[id=\"addNewRecordButton\"]";
    protected static final String firstNameInputField = "[id=\"firstName\"]";
    protected static final String lastNameInputField = "[id=\"lastName\"]";
    protected static final String userEmailInputField = "[id=\"userEmail\"]";
    protected static final String ageInputField = "[id=\"age\"]";
    protected static final String salaryInputField = "[id=\"salary\"]";
    protected static final String departmentInputField = "[id=\"department\"]";
    protected static final String submitButton = "[type=\"submit\"]";

    protected static final String editRecordButton4 = "[id=\"edit-record-4\"]";
    protected static final String deleteRecordButton4 = "[id=\"delete-record-4\"]";

    protected static final String firstNameRow4 = "//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div[3]/div[1]/div[2]/div[4]/div/div[1]";
    protected static final String lastNameRow4 = "//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div[3]/div[1]/div[2]/div[4]/div/div[2]";
    protected static final String ageRow4 = "//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div[3]/div[1]/div[2]/div[4]/div/div[3]";
    protected static final String emailRow4 = "//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div[3]/div[1]/div[2]/div[4]/div/div[4]";
    protected static final String salaryRow4 = "//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div[3]/div[1]/div[2]/div[4]/div/div[5]";
    protected static final String departmentRow4 = "//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div[3]/div[1]/div[2]/div[4]/div/div[6]";


    public void clickOnSubmitButton() {
        button.findElementByCssAndClick(submitButton);
    }

    public void clickOnAddButton() {
        button.findElementByCssAndClick(addButton);
    }

    public void inputTextInFirstNameField(String keys) {
        input.findElementByCssAndSendKeys(firstNameInputField, keys);
    }

    public void inputTextInLastNameField(String keys) {
        input.findElementByCssAndSendKeys(lastNameInputField, keys);
    }

    public void inputTextInUserEmailField(String keys) {
        input.findElementByCssAndSendKeys(userEmailInputField, keys);
    }

    public void inputTextInAgeField(String keys) {
        input.findElementByCssAndSendKeys(ageInputField, keys);
    }

    public void inputTextInSalaryField(String keys) {
        input.findElementByCssAndSendKeys(salaryInputField, keys);
    }

    public void inputTextInDepartmentField(String keys) {
        input.findElementByCssAndSendKeys(departmentInputField, keys);
    }

    public void clickOnEditButton() {
        button.findElementByCssAndClick(editRecordButton4);
    }

    public void deleteRecord() {
        button.findElementByCssAndClick(deleteRecordButton4);
    }

    public String getRowFirstNameField() {
        return input.findElementByXPathAndGetText(firstNameRow4);
    }

    public String getRowLastNameField() {
        return input.findElementByXPathAndGetText(lastNameRow4);
    }

    public String getRowAgeField() {
        return input.findElementByXPathAndGetText(ageRow4);
    }

    public String getRowEmailField() {
        return input.findElementByXPathAndGetText(emailRow4);
    }

    public String getRowSalaryField() {
        return input.findElementByXPathAndGetText(salaryRow4);
    }

    public String getRowDepartmentField() {
        return input.findElementByXPathAndGetText(departmentRow4);
    }


}
