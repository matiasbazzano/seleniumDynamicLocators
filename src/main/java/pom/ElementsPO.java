package pom;

import enums.ElementType;
import org.openqa.selenium.By;
import utils.LocatorUtils;

public class ElementsPO {
    public static final By textBoxButton = LocatorUtils.getElementByText("Text Box");

    public static final By fullNameInput = LocatorUtils.getInputByPlaceholder("Full Name");

    public static final By emailInput = LocatorUtils.getInputByPlaceholder("name@example.com");

    public static final By currentAddressTextArea = LocatorUtils.getTextAreaByPlaceholder("Current Address");

    public static final By permanentAddressTextArea = LocatorUtils.getElementByTextAndType(ElementType.LABEL, "Permanent Address", ElementType.TEXTAREA);

    public static final By submitButton = LocatorUtils.getButtonByText("Submit");

    public static final By buttonsButton = LocatorUtils.getElementByText("Buttons");

    public static final By doubleClickMeButton = LocatorUtils.getButtonByText("Double Click Me");

    public static final By rightClickMeButton = LocatorUtils.getButtonByText("Right Click Me");

    public static final By clickMeButton = LocatorUtils.getButtonByText("Click Me");

    public static final By doubleClickButtonMessage = LocatorUtils.getElementByText("You have done a double click");

    public static final By rightClickButtonMessage = LocatorUtils.getElementByText("You have done a right click");

    public static final By clickButtonMessage = LocatorUtils.getElementByText("You have done a dynamic click");
}
