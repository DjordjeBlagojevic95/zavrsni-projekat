package testQA.tests;

import lombok.SneakyThrows;
import org.testng.annotations.Test;
import testQA.pages.TextBoxPage;

import static org.assertj.core.api.Assertions.assertThat;
import static utils.DataConstants.*;
import static utils.PageConstants.*;

public class TextBoxTests extends TextBoxPage {

    @Test
    void populateInputFieldsAndSubmit() {
        new TextBoxPage();
        navigateToTextBoxPage();
        inputTextInFullNameField(USERNAME);
        inputTextInEmailField(USER_EMAIL);
        inputTextInCurrentAddressField(USER_ADDRESS);
        inputTextInPermanentAddressField(USER_PERMANENT_ADDRESS);
        clickOnSubmitButton();

        wait.visibilityOfElementByCss(outputFieldName);
        assertThat(getNameOutputFieldText()).contains(NAME + USERNAME);
        assertThat(getEmailOutputFieldText()).contains(EMAIL + USER_EMAIL);
        assertThat(getAddressOutputFieldText()).contains(CURRENT_ADDRESS + USER_ADDRESS);
        assertThat(getPermanentAddressOutputFieldText()).contains(PERMANENT_ADDRESS + USER_PERMANENT_ADDRESS);
    }

}
