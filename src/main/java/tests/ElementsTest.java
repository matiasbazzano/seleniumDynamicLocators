package tests;

import actions.Actions;
import actions.HomeActions;
import actions.ElementsActions;
import pom.HomePO;
import pom.ElementsPO;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebElement;
import support.BaseTest;

import java.io.IOException;

public class ElementsTest extends BaseTest {
    private Actions actions;
    private HomeActions homeActions;
    private ElementsActions elementsActions;

    @BeforeEach
    public void setUp() throws IOException {
        super.setUp();
        actions = new Actions(driver);
        homeActions = new HomeActions(driver);
        elementsActions = new ElementsActions(driver);
        actions.navigateToDemoQAHome();
        WebElement elementsButton = driver.findElement(HomePO.elementsButton);
        actions.scrollToElement(elementsButton);
        homeActions.clickElementsButton();
    }

    @Test
    public void fillFormTest() {
        elementsActions.clickTextBoxButton();
        elementsActions.fillForm();
        elementsActions.clickSubmitButton();
    }

    @Test
    public void clickButtonsTest() {
        elementsActions.clickButtonsButton();
        elementsActions.clickDoubleClickButton();
        elementsActions.clickRightClickButton();
        elementsActions.clickClickButton();
        WebElement doubleClickButtonMessage = driver.findElement(ElementsPO.doubleClickButtonMessage);
        WebElement rightClickButtonMessage = driver.findElement(ElementsPO.rightClickButtonMessage);
        WebElement clickButtonMessage = driver.findElement(ElementsPO.clickButtonMessage);
        Assertions.assertTrue(doubleClickButtonMessage.isDisplayed(), doubleClickButtonMessage + " is not visible.");
        Assertions.assertTrue(rightClickButtonMessage.isDisplayed(), rightClickButtonMessage + " is not visible.");
        Assertions.assertTrue(clickButtonMessage.isDisplayed(), clickButtonMessage + " is not visible.");
    }
}