package utils;

import java.io.IOException;
import java.util.Properties;

public class Configuration {
	private Properties properties;
	
	public String getProperty(String key) {
		return properties.getProperty(key);
	}
	
	// When Configuration class will be instantiated, loadProperty() will be called
	// when that method will be called, config.properties file will be loaded
	public Configuration() {
		loadProperty();
	}
	
	public void loadProperty() {
		properties = new Properties();
		try {
			properties.load(getClass().getClassLoader().getResourceAsStream("config.properties"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
