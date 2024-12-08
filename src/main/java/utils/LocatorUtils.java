package utils;

import org.openqa.selenium.By;
import enums.ElementType;

public class LocatorUtils {

    public static By getElementByText(String text) {
        return By.xpath("//*[text()='" + text + "']");
    }

    public static By getElementByPartialText(String text) {
        return By.xpath("//*[contains(text(),'" + text + "')]");
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

    public static By getElementByTextInBody(String text) {
        return By.xpath("//body[contains(text(),'" + text + "')]");
    }


    public static By getElementByTextAndType(ElementType textElementType, String text, ElementType elementType) {
        String xpath = "//" + textElementType.getElementTag() + "[text()='" + text + "']";
        switch (elementType) {
            case INPUT:
                return By.xpath(xpath + "/following::input[1]");
            case BUTTON:
                return By.xpath(xpath + "/following::button[1]");
            case SELECT:
                return By.xpath(xpath + "/following::select[1]");
            case TEXTAREA:
                return By.xpath(xpath + "/following::textarea[1]");
            case CHECKBOX:
                return By.xpath(xpath + "/following::input[@type='checkbox'][1]");
            case RADIO:
                return By.xpath(xpath + "/following::input[@type='radio'][1]");
            case DIV:
                return By.xpath(xpath + "/following::div[1]");
            default:
                throw new IllegalArgumentException("Unsupported ElementType: " + elementType);
        }
    }
}