package pom;

import org.openqa.selenium.By;
import utils.LocatorUtils;

public class FormsPO {
    public static final By practiceFormButton = LocatorUtils.getElementByText("Practice Form");

    public static final By firstNameInput = LocatorUtils.getInputByPlaceholder("First Name");

    public static final By lastNameInput = LocatorUtils.getInputByPlaceholder("Last Name");

    public static final By emailInput = LocatorUtils.getInputByPlaceholder("name@example.com");

    public static By genderMaleCheckbox = LocatorUtils.getElementByLabelAndType("Male", "checkbox");

    public static By genderFemaleCheckbox = LocatorUtils.getElementByLabelAndType("Female", "checkbox");

    public static By genderOtherCheckbox = LocatorUtils.getElementByLabelAndType("Other", "checkbox");
}
