package testQA.tests;

import lombok.SneakyThrows;
import org.testng.annotations.Test;
import testQA.pages.TextBoxPage;

public class TextBoxTests extends TextBoxPage {

    @Test
    @SneakyThrows
    void populateInputFieldsAndSubmit() {
        new TextBoxPage();
        navigateToTextBoxPage();
        Thread.sleep(10000);
        inputTextInFullNameField("Djordje 95");
    }


}
