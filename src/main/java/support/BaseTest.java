package support;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.Dimension;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.time.Duration;

public class BaseTest {
    protected WebDriver driver;
    protected WebDriverWait driverWait;
    protected String BROWSER;
    protected String CHROME_DRIVER_KEY;
    protected String CHROME_DRIVER_PATH;
    protected String EDGE_DRIVER_KEY;
    protected String EDGE_DRIVER_PATH;

    @BeforeEach
    public void setUp() throws IOException {
        PropertiesLoader propertiesLoader = new PropertiesLoader();
        BROWSER = propertiesLoader.getProperty("browser");
        CHROME_DRIVER_KEY = propertiesLoader.getProperty("chrome_driver_key");
        CHROME_DRIVER_PATH = propertiesLoader.getProperty("chrome_driver_path");
        EDGE_DRIVER_KEY = propertiesLoader.getProperty("edge_driver_key");
        EDGE_DRIVER_PATH = propertiesLoader.getProperty("edge_driver_path");

        switch (BROWSER.toUpperCase()) {
            case "CHROME":
                System.setProperty(CHROME_DRIVER_KEY, CHROME_DRIVER_PATH);
                ChromeOptions options = new ChromeOptions();
                options.addArguments("--incognito");
                driver = new ChromeDriver(options);
                break;
            case "EDGE":
                System.setProperty(EDGE_DRIVER_KEY, EDGE_DRIVER_PATH);
                EdgeOptions edgeOptions = new EdgeOptions();
                edgeOptions.addArguments("-inprivate");
                driver = new EdgeDriver(edgeOptions);
                break;
        }
        driver.manage().window().setSize(new Dimension(1280, 1024));
        driverWait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    @AfterEach
    public void close() {
        if (driver != null) {
            driver.quit();
        }
    }
}