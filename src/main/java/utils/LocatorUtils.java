package utils;

import org.openqa.selenium.By;

public class LocatorUtils {

    public static By getElementByText(String text) {
        return By.xpath("//*[text()='" + text + "']");
    }

    public static By getButtonByText(String buttonText) {
        return By.xpath("//button[text()='" + buttonText + "']");
    }

    public static By getInputByPlaceholder(String placeholder) {
        return By.xpath("//input[@placeholder='" + placeholder + "']");
    }

    public static By getTextAreaByPlaceholder(String placeholder) {
        return By.xpath("//textarea[@placeholder='" + placeholder + "']");
    }

    public static By getElementByLabelAndType(String labelText, String elementType) {
        String xpath = "//label[text()='" + labelText + "']";
        switch (elementType.toLowerCase()) {
            case "input":
                return By.xpath(xpath + "/following::input[1]");
            case "button":
                return By.xpath(xpath + "/following::button[1]");
            case "select":
                return By.xpath(xpath + "/following::select[1]");
            case "textarea":
                return By.xpath(xpath + "/following::textarea[1]");
            case "checkbox":
                return By.xpath(xpath + "/following::input[@type='checkbox'][1]");
            case "radio":
                return By.xpath(xpath + "/following::input[@type='radio'][1]");
        }
        throw new IllegalArgumentException(elementType);
    }

}
