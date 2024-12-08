package tests;

import actions.Actions;
import actions.HomeActions;
import actions.FormsActions;
import pom.FormsPO;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebElement;
import pom.HomePO;
import support.BaseTest;

import java.io.IOException;

public class FormsTest extends BaseTest {
    private Actions actions;
    private HomeActions homeActions;
    private FormsActions formsActions;

    @BeforeEach
    public void setUp() throws IOException {
        super.setUp();
        actions = new Actions(driver);
        homeActions = new HomeActions(driver);
        formsActions = new FormsActions(driver);
        actions.navigateToDemoQAHome();
        WebElement formsButton = driver.findElement(HomePO.formsButton);
        actions.scrollToElement(formsButton);
        homeActions.clickFormsButton();
    }

    @Test
    public void fillFormTest() {
        formsActions.clickPracticeFormButton();
        formsActions.fillForm();
        formsActions.clickSubmitButton();
        WebElement formSubmittedMessage = driver.findElement(FormsPO.formSubmittedMessage);
        Assertions.assertTrue(formSubmittedMessage.isDisplayed(), formSubmittedMessage + " is not visible.");
    }
}