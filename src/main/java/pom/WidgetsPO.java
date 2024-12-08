package pom;

import org.openqa.selenium.By;
import utils.LocatorUtils;

public class WidgetsPO {
    public static final By accordianButton = LocatorUtils.getElementByText("Accordian");

    public static final By firstAccordian = LocatorUtils.getElementByText("What is Lorem Ipsum?");

    public static final By secondAccordian = LocatorUtils.getElementByText("Where does it come from?");

    public static final By thirdAccordian = LocatorUtils.getElementByText("Why do we use it?");

    public static final By firstAccordianContent = LocatorUtils.getElementByPartialText("Lorem Ipsum is simply dummy text");

    public static final By secondAccordianContent = LocatorUtils.getElementByPartialText("Contrary to popular belief, Lorem Ipsum is not simply random text.");

    public static final By thirdAccordianContent = LocatorUtils.getElementByPartialText("It is a long established fact that a reader will be distracted");
}