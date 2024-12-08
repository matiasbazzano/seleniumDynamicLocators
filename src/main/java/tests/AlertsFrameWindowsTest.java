package tests;

import actions.Actions;
import actions.HomeActions;
import actions.AlertsFrameWindowsActions;
import pom.AlertsFrameWindowsPO;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pom.HomePO;
import support.BaseTest;

import java.util.ArrayList;
import java.io.IOException;
import java.util.Set;

public class AlertsFrameWindowsTest extends BaseTest {
    private Actions actions;
    private HomeActions homeActions;
    private AlertsFrameWindowsActions alertsFrameWindowsActions;
    private int oldTabCount;
    private ArrayList<String> tabs;
    private String originalWindow;
    private String newWindow;
    private Set<String> allWindows;

    private void updateTabs() {
        tabs = new ArrayList<>(driver.getWindowHandles());
        oldTabCount = tabs.size();
    }

    private void updateWindow() {
        originalWindow = driver.getWindowHandle();
    }

    @BeforeEach
    public void setUp() throws IOException {
        super.setUp();
        actions = new Actions(driver);
        homeActions = new HomeActions(driver);
        alertsFrameWindowsActions = new AlertsFrameWindowsActions(driver);
        actions.navigateToDemoQAHome();
        WebElement alertsFrameWindowsButton = driver.findElement(HomePO.alertsFrameWindowsButton);
        actions.scrollToElement(alertsFrameWindowsButton);
        homeActions.clickAlertsFrameWindowsButton();
    }

    @Test
    public void browserWindowsNewTabTest() {
        updateTabs();
        alertsFrameWindowsActions.clickBrowserWindowsButton();
        alertsFrameWindowsActions.clickNewTabButton();
        tabs = new ArrayList<>(driver.getWindowHandles());
        Assertions.assertEquals(oldTabCount + 1, tabs.size());
        driver.switchTo().window(tabs.getLast());
        WebElement shortMessageLabel = driver.findElement(AlertsFrameWindowsPO.shortMessageLabel);
        Assertions.assertTrue(shortMessageLabel.isDisplayed(), shortMessageLabel + " is not visible.");
    }

    @Test
    public void browserWindowsNewWindowTest() {
        updateWindow();
        alertsFrameWindowsActions.clickBrowserWindowsButton();
        alertsFrameWindowsActions.clickNewWindowButton();
        allWindows = driver.getWindowHandles();
        Assertions.assertTrue(allWindows.size() > 1, "A new window did not open");
        allWindows.remove(originalWindow);
        newWindow = allWindows.iterator().next();
        driver.switchTo().window(newWindow);
        WebElement shortMessageLabel = driver.findElement(AlertsFrameWindowsPO.shortMessageLabel);
        Assertions.assertTrue(shortMessageLabel.isDisplayed(), shortMessageLabel + " is not visible.");
    }

    @Test
    public void alertsSeeAlertTest() {
        alertsFrameWindowsActions.clickAlertsButton();
        alertsFrameWindowsActions.clickSeeAlertButton();
        driverWait.until(ExpectedConditions.alertIsPresent());
        Alert alert = driver.switchTo().alert();
        String alertText = alert.getText();
        Assertions.assertTrue(alertText.contains("You clicked a button"), "The expected message is not present in the alert");
        alert.accept();
    }

    @Test
    public void alertsSeeAlertAfterFiveSecondsTest() {
        alertsFrameWindowsActions.clickAlertsButton();
        alertsFrameWindowsActions.clickSeeAlertAfterFiveSecondsButton();
        driverWait.until(ExpectedConditions.alertIsPresent());
        Alert alert = driver.switchTo().alert();
        String alertText = alert.getText();
        Assertions.assertTrue(alertText.contains("This alert appeared after 5 seconds"), "The expected message is not present in the alert");
        alert.accept();
    }

    @Test
    public void alertsConfirmBoxOkTest() {
        alertsFrameWindowsActions.clickAlertsButton();
        alertsFrameWindowsActions.clickConfirmBoxAlertButton();
        driverWait.until(ExpectedConditions.alertIsPresent());
        Alert alert = driver.switchTo().alert();
        String alertText = alert.getText();
        Assertions.assertTrue(alertText.contains("Do you confirm action?"), "The expected message is not present in the alert");
        alert.accept();
        WebElement confirmBoxAlertMessage = driver.findElement(AlertsFrameWindowsPO.alertOkSelectedOptionMessage);
        Assertions.assertTrue(confirmBoxAlertMessage.isDisplayed(), confirmBoxAlertMessage + " is not visible.");
    }

    @Test
    public void alertsConfirmBoxCancelTest() {
        alertsFrameWindowsActions.clickAlertsButton();
        alertsFrameWindowsActions.clickConfirmBoxAlertButton();
        driverWait.until(ExpectedConditions.alertIsPresent());
        Alert alert = driver.switchTo().alert();
        String alertText = alert.getText();
        Assertions.assertTrue(alertText.contains("Do you confirm action?"), "The expected message is not present in the alert");
        alert.dismiss();
        WebElement confirmBoxAlertMessage = driver.findElement(AlertsFrameWindowsPO.alertCancelSelectedOptionMessage);
        Assertions.assertTrue(confirmBoxAlertMessage.isDisplayed(), confirmBoxAlertMessage + " is not visible.");
    }

    @Test
    public void alertsPromptBoxTest() {
        alertsFrameWindowsActions.clickAlertsButton();
        alertsFrameWindowsActions.clickPromptBoxAlertButton();
        driverWait.until(ExpectedConditions.alertIsPresent());
        Alert alert = driver.switchTo().alert();
        String alertText = alert.getText();
        Assertions.assertTrue(alertText.contains("Please enter your name"), "The expected message is not present in the alert");
        alert.sendKeys("Matias");
        alert.accept();
        WebElement alertPromptBoxMessage = driver.findElement(AlertsFrameWindowsPO.alertPromptBoxMessage);
        Assertions.assertTrue(alertPromptBoxMessage.isDisplayed(), alertPromptBoxMessage + " is not visible.");
    }

    @Test
    public void modalDialogsTest() {
        alertsFrameWindowsActions.clickModalDialogsButton();
        alertsFrameWindowsActions.clickSmallModalButton();
        WebElement closeSmallModalButton = driver.findElement(AlertsFrameWindowsPO.closeModalButton);
        driverWait.until(ExpectedConditions.elementToBeClickable(closeSmallModalButton));
        Assertions.assertTrue(closeSmallModalButton.isDisplayed(), closeSmallModalButton + " is not visible.");
        alertsFrameWindowsActions.clickCloseModalButton();
        WebElement smallModalButton = driver.findElement(AlertsFrameWindowsPO.smallModalButton);
        driverWait.until(ExpectedConditions.elementToBeClickable(smallModalButton));
        alertsFrameWindowsActions.clickLargeModalButton();
        WebElement closeLargeModalButton = driver.findElement(AlertsFrameWindowsPO.closeModalButton);
        driverWait.until(ExpectedConditions.elementToBeClickable(closeLargeModalButton));
        Assertions.assertTrue(closeLargeModalButton.isDisplayed(), closeLargeModalButton + " is not visible.");
        alertsFrameWindowsActions.clickCloseModalButton();
    }
}