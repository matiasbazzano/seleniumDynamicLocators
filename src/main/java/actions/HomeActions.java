package actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pom.HomePO;
import support.PropertiesLoader;

import java.io.IOException;

public class HomeActions {
    private WebDriver driver;
    public String baseUrl;

    public HomeActions(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToDemoQAHome() throws IOException {
        PropertiesLoader propertiesLoader = new PropertiesLoader();
        baseUrl = propertiesLoader.getProperty("env_url");
        driver.get("https://demoqa.com/");
    }

    public void clickElementsButton() {
        WebElement button = driver.findElement(HomePO.elementsButton);
        button.click();
    }
}