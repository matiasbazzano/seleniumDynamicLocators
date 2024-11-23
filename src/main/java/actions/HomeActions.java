package actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pom.HomePO;

public class HomeActions {
    private WebDriver driver;

    public HomeActions(WebDriver driver) {
        this.driver = driver;
    }

    public void clickElementsButton() {
        WebElement button = driver.findElement(HomePO.elementsButton);
        button.click();
    }

    public void clickFormsButton() {
        WebElement button = driver.findElement(HomePO.formsButton);
        button.click();
    }

    public void clickAlertsFrameWindowsButton() {
        WebElement button = driver.findElement(HomePO.alertsFrameWindowsButton);
        button.click();
    }
}