package pom;

import org.openqa.selenium.By;
import utils.LocatorUtils;

public class HomePO {
    public static final By elementsButton = LocatorUtils.getElementByText("Elements");

    public static final By formsButton = LocatorUtils.getElementByText("Forms");

    public static final By alertsFrameWindowsButton = LocatorUtils.getElementByText("Alerts, Frame & Windows");

    public static final By widgetsButton = LocatorUtils.getElementByText("Widgets");
}