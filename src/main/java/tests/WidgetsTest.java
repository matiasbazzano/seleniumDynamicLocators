package tests;

import actions.Actions;
import actions.HomeActions;
import actions.WidgetsActions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pom.HomePO;
import pom.WidgetsPO;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebElement;
import support.BaseTest;

import java.io.IOException;

public class WidgetsTest extends BaseTest {
    private Actions actions;
    private HomeActions homeActions;
    private WidgetsActions widgetsActions;

    @BeforeEach
    public void setUp() throws IOException {
        super.setUp();
        actions = new Actions(driver);
        homeActions = new HomeActions(driver);
        widgetsActions = new WidgetsActions(driver);
        actions.navigateToDemoQAHome();
        WebElement widgetsButton = driver.findElement(HomePO.widgetsButton);
        actions.scrollToElement(widgetsButton);
        homeActions.clickWidgetsButton();
    }

    @Test
    public void firstAccordianTest() {
        widgetsActions.clickAccordianButton();
        WebElement firstAccordian = driver.findElement(WidgetsPO.firstAccordian);
        actions.scrollToElement(firstAccordian);
        widgetsActions.clickFirstAccordian(); // Close the accordian opened by default
        widgetsActions.clickFirstAccordian();
        WebElement firstAccordianContent = driver.findElement(WidgetsPO.firstAccordianContent);
        driverWait.until(ExpectedConditions.elementToBeClickable(firstAccordianContent));
        Assertions.assertTrue(firstAccordianContent.isDisplayed(), firstAccordianContent + " is not visible.");
    }

    @Test
    public void secondAccordianTest() {
        widgetsActions.clickAccordianButton();
        WebElement secondAccordian = driver.findElement(WidgetsPO.secondAccordian);
        actions.scrollToElement(secondAccordian);
        widgetsActions.clickSecondAccordian();
        WebElement secondAccordianContent = driver.findElement(WidgetsPO.secondAccordianContent);
        driverWait.until(ExpectedConditions.elementToBeClickable(secondAccordianContent));
        Assertions.assertTrue(secondAccordianContent.isDisplayed(), secondAccordianContent + " is not visible.");
    }

    @Test
    public void thirdAccordianTest() {
        widgetsActions.clickAccordianButton();
        WebElement thirdAccordian = driver.findElement(WidgetsPO.thirdAccordian);
        actions.scrollToElement(thirdAccordian);
        widgetsActions.clickThirdAccordian();
        WebElement thirdAccordianContent = driver.findElement(WidgetsPO.thirdAccordianContent);
        driverWait.until(ExpectedConditions.elementToBeClickable(thirdAccordianContent));
        Assertions.assertTrue(thirdAccordianContent.isDisplayed(), thirdAccordianContent + " is not visible.");
    }
}