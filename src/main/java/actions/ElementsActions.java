package actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pom.ElementsPO;

public class ElementsActions {
    private WebDriver driver;
    private Actions seleniumActions;

    public ElementsActions(WebDriver driver) {
        this.driver = driver;
        this.seleniumActions = new Actions(driver);
    }

    public void clickTextBoxButton() {
        WebElement button = driver.findElement(ElementsPO.textBoxButton);
        button.click();
    }

    public void clickButtonsButton() {
        WebElement button = driver.findElement(ElementsPO.buttonsButton);
        button.click();
    }

    public void fillForm() {
        WebElement fullNameInput = driver.findElement(ElementsPO.fullNameInput);
        WebElement emailInput = driver.findElement(ElementsPO.emailInput);
        WebElement currentAddressTextArea = driver.findElement(ElementsPO.currentAddressTextArea);
        WebElement permanentAddressTextArea = driver.findElement(ElementsPO.permanentAddressTextArea);
        fullNameInput.sendKeys("Test Full Name");
        emailInput.sendKeys("test@example.com");
        currentAddressTextArea.sendKeys("Test Current Address 1234");
        permanentAddressTextArea.sendKeys("Test Permanent Address 1234");
    }

    public void clickSubmitButton() {
        WebElement button = driver.findElement(ElementsPO.submitButton);
        button.click();
    }

    public void clickDoubleClickButton() {
        WebElement button = driver.findElement(ElementsPO.doubleClickMeButton);
        seleniumActions.doubleClick(button).perform();
    }

    public void clickRightClickButton() {
        WebElement button = driver.findElement(ElementsPO.rightClickMeButton);
        seleniumActions.contextClick(button).perform();
    }

    public void clickClickButton() {
        WebElement button = driver.findElement(ElementsPO.clickMeButton);
        button.click();
    }
}