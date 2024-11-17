package support;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesLoader {
    private Properties properties = new Properties();

    public PropertiesLoader() throws IOException {
        loadProperties();
    }

    private void loadProperties() throws IOException {
        String filePath = "src/main/resources/values.properties";
        try (FileInputStream input = new FileInputStream(filePath)) {
            properties.load(input);
        }
    }

    public String getProperty(String key) {
        return properties.getProperty(key);
    }
}