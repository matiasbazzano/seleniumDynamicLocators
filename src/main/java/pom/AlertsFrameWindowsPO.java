package pom;

import org.openqa.selenium.By;
import utils.LocatorUtils;

public class AlertsFrameWindowsPO {
    public static final By browserWindowsButton = LocatorUtils.getElementByText("Browser Windows");

    public static final By newTabButton = LocatorUtils.getElementByText("New Tab");

    public static final By newWindowButton = LocatorUtils.getElementByText("New Window");

    public static final By shortMessageLabel = LocatorUtils.getElementByText("This is a sample page");
}