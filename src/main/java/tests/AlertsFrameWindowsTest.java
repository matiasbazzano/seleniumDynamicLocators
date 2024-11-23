package tests;

import actions.Actions;
import actions.HomeActions;
import actions.AlertsFrameWindowsActions;
import pom.AlertsFrameWindowsPO;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebElement;
import pom.HomePO;
import support.BaseTest;

import java.util.ArrayList;
import java.io.IOException;

public class AlertsFrameWindowsTest extends BaseTest {
    private Actions actions;
    private HomeActions homeActions;
    private AlertsFrameWindowsActions alertsFrameWindowsActions;
    private int oldTabCount;
    private ArrayList<String> tabs;

    private void updateTabs() {
        tabs = new ArrayList<>(driver.getWindowHandles());
        oldTabCount = tabs.size();
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
}
