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

    public void clickNewWindowMessageButton() {
        WebElement button = driver.findElement(AlertsFrameWindowsPO.newWindowMessageButton);
        button.click();
    }
}
