package pom;

import enums.ElementType;
import org.openqa.selenium.By;
import utils.LocatorUtils;

public class FormsPO {
    public static final By practiceFormButton = LocatorUtils.getElementByText("Practice Form");

    public static final By firstNameInput = LocatorUtils.getInputByPlaceholder("First Name");

    public static final By lastNameInput = LocatorUtils.getInputByPlaceholder("Last Name");

    public static final By emailInput = LocatorUtils.getInputByPlaceholder("name@example.com");

    public static final By genderMaleCheckbox = LocatorUtils.getElementByText("Male");

    public static final By mobileNumberInput = LocatorUtils.getInputByPlaceholder("Mobile Number");

    public static final By currentAddressTextArea = LocatorUtils.getElementByLabelAndType("Current Address", ElementType.TEXTAREA);

    public static final By stateSelect = LocatorUtils.getElementByLabelAndType("State and City", ElementType.DIV);

    public static final By ncrStateSelectOption = LocatorUtils.getElementByText("NCR");

    public static final By submitButton = LocatorUtils.getButtonByText("Submit");

    public static final By formSubmittedMessage = LocatorUtils.getElementByText("Thanks for submitting the form");
}
