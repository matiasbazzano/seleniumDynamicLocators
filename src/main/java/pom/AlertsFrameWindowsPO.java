package pom;

import enums.ElementType;
import org.openqa.selenium.By;
import utils.LocatorUtils;

public class AlertsFrameWindowsPO {
    public static final By browserWindowsButton = LocatorUtils.getElementByText("Browser Windows");

    public static final By newTabButton = LocatorUtils.getElementByText("New Tab");

    public static final By newWindowButton = LocatorUtils.getElementByText("New Window");

    public static final By shortMessageLabel = LocatorUtils.getElementByText("This is a sample page");

    public static final By alertsButton = LocatorUtils.getElementByText("Alerts");

    public static final By seeAlertButton = LocatorUtils.getElementByTextAndType(ElementType.SPAN, "Click Button to see alert ", ElementType.BUTTON);

    public static final By seeAlertAfterFiveSecondsButton = LocatorUtils.getElementByTextAndType(ElementType.SPAN, "On button click, alert will appear after 5 seconds ", ElementType.BUTTON);

    public static final By seeAlertWithConfirmBoxButton = LocatorUtils.getElementByTextAndType(ElementType.SPAN, "On button click, confirm box will appear", ElementType.BUTTON);

    public static final By alertOkSelectedOptionMessage = LocatorUtils.getElementByText("Ok");

    public static final By alertCancelSelectedOptionMessage = LocatorUtils.getElementByText("Cancel");

    public static final By alertPromptBoxAlertButton = LocatorUtils.getElementByTextAndType(ElementType.SPAN, "On button click, prompt box will appear", ElementType.BUTTON);

    public static final By alertPromptBoxMessage = LocatorUtils.getElementByText("Matias");

    public static final By modalDialogsButton = LocatorUtils.getElementByText("Modal Dialogs");

    public static final By smallModalButton = LocatorUtils.getButtonByText("Small modal");

    public static final By largeModalButton = LocatorUtils.getButtonByText("Large modal");

    public static final By closeModalButton = LocatorUtils.getButtonByText("Close");
}