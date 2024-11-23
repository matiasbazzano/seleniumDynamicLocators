package pom;

import org.openqa.selenium.By;
import utils.LocatorUtils;

public class AlertsFrameWindowsPO {
    public static final By browserWindowsButton = LocatorUtils.getElementByText("Browser Windows");

    public static final By newTabButton = LocatorUtils.getElementByText("New Tab");

    public static final By newWindowButton = LocatorUtils.getElementByText("New Window");

    public static final By newWindowMessageButton = LocatorUtils.getElementByText("New Window Message");

    public static final By shortMessageLabel = LocatorUtils.getElementByText("This is a sample page");

    public static final By longMessageLabel = LocatorUtils.getElementByText("Knowledge increases by sharing but not by saving. Please share this website with your friends and in your organization.");
}