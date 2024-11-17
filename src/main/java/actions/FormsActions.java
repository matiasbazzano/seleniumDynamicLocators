package actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pom.FormsPO;

import java.time.Duration;

public class FormsActions {
    private WebDriver driver;

    public FormsActions(WebDriver driver) {
        this.driver = driver;
    }

    public void clickPracticeFormButton() {
        WebElement button = driver.findElement(FormsPO.practiceFormButton);
        button.click();
    }

    public void fillForm() {
        WebElement firstNameInput = driver.findElement(FormsPO.firstNameInput);
        WebElement lastNameInput = driver.findElement(FormsPO.lastNameInput);
        WebElement emailInput = driver.findElement(FormsPO.emailInput);
        WebElement genderMaleCheckbox = driver.findElement(FormsPO.genderMaleCheckbox);
        WebElement mobileNumberInput = driver.findElement(FormsPO.mobileNumberInput);
        WebElement currentAddressTextArea = driver.findElement(FormsPO.currentAddressTextArea);
        WebElement stateSelect = driver.findElement(FormsPO.stateSelect);
        firstNameInput.sendKeys("Test First Name");
        lastNameInput.sendKeys("Test Last Name");
        emailInput.sendKeys("test@example.com");
        genderMaleCheckbox.click();
        mobileNumberInput.sendKeys("1231231231");
        currentAddressTextArea.sendKeys("Test Current Address 1234");
        stateSelect.click();
        WebElement stateSelectOption = driver.findElement(FormsPO.ncrStateSelectOption);
        stateSelectOption.click();
    }

    public void clickSubmitButton() {
        WebElement button = driver.findElement(FormsPO.submitButton);
        button.click();
    }
}
