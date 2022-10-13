package testQA.tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import testQA.pages.PracticeFormPage;

import static utils.DataConstants.*;

public class PracticeFormTests extends PracticeFormPage {

    @BeforeMethod
    void createPage() {
        new PracticeFormPage();
    }

    @Test
    void populateForm() {
        navigateToPracticeFormPage();

        inputTextInFirstNameField(USERNAME);
        inputTextInLastNameField(USER_LASTNAME);
        inputTextInUserEmailField(USER_EMAIL);
        clickOnMaleRadioButton();
        inputTextInMobileNumberField(MOBILE);
        clickOnDateOfBirthButton();
        wait.visibilityOfElementByCss(dateDay);
        clickOnDateOfBirthDayButton();
        inputTextInSubjectInputField("English");
        inputTextInSubjectInputField("Maths");
        clickOnSportsCheckBoxButton();
        inputTextInCurrentAddressField(USER_ADDRESS);
        inputTextInStateInputField("NCR");
        inputTextInCityInputField("Delhi");
        clickOnSubmitButton();

    }


}
