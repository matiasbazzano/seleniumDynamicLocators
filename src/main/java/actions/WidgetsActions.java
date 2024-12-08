package actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pom.WidgetsPO;

public class WidgetsActions {
    private WebDriver driver;

    public WidgetsActions(WebDriver driver) {
        this.driver = driver;
    }

    public void clickAccordianButton() {
        WebElement button = driver.findElement(WidgetsPO.accordianButton);
        button.click();
    }

    public void clickFirstAccordian() {
        WebElement button = driver.findElement(WidgetsPO.firstAccordian);
        button.click();
    }

    public void clickSecondAccordian() {
        WebElement button = driver.findElement(WidgetsPO.secondAccordian);
        button.click();
    }

    public void clickThirdAccordian() {
        WebElement button = driver.findElement(WidgetsPO.thirdAccordian);
        button.click();
    }
}