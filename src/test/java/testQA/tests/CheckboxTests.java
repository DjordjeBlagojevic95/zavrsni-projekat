package testQA.tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import testQA.pages.CheckboxPage;
import testQA.pages.PracticeFormPage;

import static org.assertj.core.api.Assertions.assertThat;

public class CheckboxTests extends CheckboxPage {

    @BeforeMethod
    void createPage() {
        new CheckboxPage();
    }

    @Test
    void checkDownloadsFolder() {
        navigateToCheckboxPage();

        clickOnToggleButton();
        clickOnCheckbox();

        assertThat(getOutputResult()).contains("You have selected :\n" +
                "downloads\n" +
                "wordFile\n" +
                "excelFile");
    }
}
