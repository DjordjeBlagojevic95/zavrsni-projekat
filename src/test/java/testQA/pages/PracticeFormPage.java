package testQA.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import testQA.BaseTest;

import java.time.Duration;
import java.util.List;

public class PracticeFormPage extends BaseTest {

    public static final String firstNameInputField = "[id=\"firstName\"]";
    public static final String lastNameInputField = "[id=\"lastName\"]";
    public static final String userEmailInputField = "[id=\"userEmail\"]";
    public static final String maleRadioButton = "[for=\"gender-radio-1\"]";
    public static final String femaleRadioButton = "[for=\"gender-radio-2\"]";
    public static final String otherRadioButton = "[for=\"gender-radio-3\"]";
    public static final String mobileNumberInputField = "[id=\"userNumber\"]";

    public static final String subjectsInputField = "[id=\"subjectsInput\"]";
    public static final String sportsCheckBox = "[for=\"hobbies-checkbox-1\"]";
    public static final String readingCheckBox = "[for=\"hobbies-checkbox-2\"]";
    public static final String musicCheckBox = "[for=\"hobbies-checkbox-3\"]";
    public static final String uploadPicture = "[for=\"uploadPicture\"]";
    public static final String dateOfBirthInput = "[id=\"dateOfBirthInput\"]";
    public static final String dateDay = "[aria-label=\"Choose Wednesday, October 26th, 2022\"]";
    public static final String currentAddressInputField = "[id=\"currentAddress\"]";
    public static final String stateInput = "[id=\"react-select-3-input\"]";
    public static final String cityInput = "[id=\"react-select-4-input\"]";
    public static final String submitInput = "[id=\"submit\"]";


    public void inputTextInFirstNameField(String keys) {
        input.findElementByCssAndSendKeys(firstNameInputField, keys);
    }

    public void inputTextInLastNameField(String keys) {
        input.findElementByCssAndSendKeys(lastNameInputField, keys);
    }

    public void inputTextInUserEmailField(String keys) {
        input.findElementByCssAndSendKeys(userEmailInputField, keys);
    }

    public void clickOnMaleRadioButton() {
        button.findElementByCssAndClick(maleRadioButton);
    }

    public void inputTextInMobileNumberField(String keys) {
        input.findElementByCssAndSendKeys(mobileNumberInputField, keys);
    }

    public void clickOnDateOfBirthButton() {
        button.findElementByCssAndClick(dateOfBirthInput);
    }

    public void clickOnDateOfBirthDayButton() {
        button.findElementByCssAndClick(dateDay);
    }

    public void inputTextInSubjectInputField(String keys) {
        input.findElementByCssAndSendKeys(subjectsInputField, keys);
        input.findElementByCss(subjectsInputField).sendKeys(Keys.ENTER);
    }

    public void clickOnSportsCheckBoxButton() {
        button.findElementByCssAndClick(sportsCheckBox);
    }

    public void inputTextInCurrentAddressField(String keys) {
        input.findElementByCssAndSendKeys(currentAddressInputField, keys);
    }

    public void inputTextInStateInputField(String keys) {
        input.findElementByCssAndSendKeys(stateInput, keys);
        input.findElementByCss(stateInput).sendKeys(Keys.ENTER);
    }

    public void inputTextInCityInputField(String keys) {
        input.findElementByCssAndSendKeys(cityInput, keys);
        input.findElementByCss(cityInput).sendKeys(Keys.ENTER);
    }

    public void clickOnSubmitButton() {
        button.findElementByCssAndClick(submitInput);
    }




}
