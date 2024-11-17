package actions;

import org.openqa.selenium.WebDriver;
import support.PropertiesLoader;

import java.io.IOException;

public class Actions {
    private WebDriver driver;
    public String baseUrl;

    public Actions(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToDemoQAHome() throws IOException {
        PropertiesLoader propertiesLoader = new PropertiesLoader();
        baseUrl = propertiesLoader.getProperty("env_url");
        driver.get(baseUrl);
    }
}