package actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pom.AlertsFrameWindowsPO;

public class AlertsFrameWindowsActions {
    private WebDriver driver;

    public AlertsFrameWindowsActions(WebDriver driver) {
        this.driver = driver;
    }

    public void clickBrowserWindowsButton() {
        WebElement button = driver.findElement(AlertsFrameWindowsPO.browserWindowsButton);
        button.click();
    }

    public void clickNewTabButton() {
        WebElement button = driver.findElement(AlertsFrameWindowsPO.newTabButton);
        button.click();
    }

    public void clickNewWindowButton() {
        WebElement button = driver.findElement(AlertsFrameWindowsPO.newWindowButton);
        button.click();
    }

    public void clickAlertsButton() {
        WebElement button = driver.findElement(AlertsFrameWindowsPO.alertsButton);
        button.click();
    }

    public void clickSeeAlertButton() {
        WebElement button = driver.findElement(AlertsFrameWindowsPO.seeAlertButton);
        button.click();
    }

    public void clickSeeAlertAfterFiveSecondsButton() {
        WebElement button = driver.findElement(AlertsFrameWindowsPO.seeAlertAfterFiveSecondsButton);
        button.click();
    }

    public void clickConfirmBoxAlertButton() {
        WebElement button = driver.findElement(AlertsFrameWindowsPO.seeAlertWithConfirmBoxButton);
        button.click();
    }

    public void clickPromptBoxAlertButton() {
        WebElement button = driver.findElement(AlertsFrameWindowsPO.alertPromptBoxAlertButton);
        button.click();
    }

    public void clickModalDialogsButton() {
        WebElement button = driver.findElement(AlertsFrameWindowsPO.modalDialogsButton);
        button.click();
    }

    public void clickSmallModalButton() {
        WebElement button = driver.findElement(AlertsFrameWindowsPO.smallModalButton);
        button.click();
    }

    public void clickLargeModalButton() {
        WebElement button = driver.findElement(AlertsFrameWindowsPO.largeModalButton);
        button.click();
    }

    public void clickCloseModalButton() {
        WebElement button = driver.findElement(AlertsFrameWindowsPO.closeModalButton);
        button.click();
    }
}
