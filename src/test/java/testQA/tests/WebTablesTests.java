package testQA.tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import testQA.pages.WebTablesPage;

import static org.assertj.core.api.Assertions.assertThat;
import static utils.DataConstants.*;

public class WebTablesTests extends WebTablesPage {

    @BeforeMethod
    void createPage() {
        new WebTablesPage();
    }

    @Test
    public void addRecordInTable() {
        navigateToWebTablesPage();

        wait.visibilityOfElementByCss(addButton);
        clickOnAddButton();

        wait.visibilityOfElementByCss(firstNameInputField);
        inputTextInFirstNameField(USERNAME);
        inputTextInLastNameField(USER_LASTNAME);
        inputTextInUserEmailField(USER_EMAIL);
        inputTextInAgeField(AGE);
        inputTextInSalaryField(SALARY);
        inputTextInDepartmentField(DEPARTMENT);

        clickOnSubmitButton();

        assertThat(getRowFirstNameField()).contains(USERNAME);
        assertThat(getRowLastNameField()).contains(USER_LASTNAME);
        assertThat(getRowAgeField()).contains(AGE);
        assertThat(getRowEmailField()).contains(USER_EMAIL);
        assertThat(getRowSalaryField()).contains(SALARY);
        assertThat(getRowDepartmentField()).contains(DEPARTMENT);

    }

    @Test(dependsOnMethods = "addRecordInTable")
    void editCreatedRecord() {
        clickOnEditButton();

        wait.visibilityOfElementByCss(firstNameInputField);

        input.findElementByCssAndClearText(ageInputField);
        inputTextInAgeField("32");
        input.findElementByCssAndClearText(salaryInputField);
        inputTextInSalaryField("20000");
        input.findElementByCssAndClearText(departmentInputField);
        inputTextInDepartmentField("New QA Department");

        clickOnSubmitButton();

        assertThat(getRowAgeField()).contains("32");
        assertThat(getRowSalaryField()).contains("20000");
        assertThat(getRowDepartmentField()).contains("New QA Department");
    }

    @Test(priority = 5, dependsOnMethods = "addRecordInTable")
    void deleteCreatedRecord() {

        deleteRecord();
    }
}
