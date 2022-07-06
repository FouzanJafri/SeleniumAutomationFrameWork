package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {
	public static String username() throws IOException {
		File file = new File("src/main/resources/configuration/configuration.properties");
		FileInputStream Fis = new FileInputStream(file);
		Properties prop = new Properties();
		prop.load(Fis);
		return prop.getProperty("username");

	}

	public static String password() throws IOException {
		File file = new File("src/main/resources/configuration/configuration.properties");
		FileInputStream Fis = new FileInputStream(file);
		Properties prop = new Properties();
		prop.load(Fis);
		return prop.getProperty("password");

	}

	public static String readbaseURL() throws IOException {
		File file = new File("src/main/resources/configuration/configuration.properties");
		FileInputStream Fis = new FileInputStream(file);
		Properties prop = new Properties();
		prop.load(Fis);
		return prop.getProperty("baseURL");

	}

	public static String createUserPageTitle() throws IOException {
		File file = new File("src/main/resources/configuration/configuration.properties");
		FileInputStream Fis = new FileInputStream(file);
		Properties prop = new Properties();
		prop.load(Fis);
		return prop.getProperty("pageTitle");
	}

	public static String readbrowserName(String browser) throws IOException {
		File file = new File("src/main/resources/configuration/configuration.properties");
		FileInputStream Fis = new FileInputStream(file);
		Properties prop = new Properties();
		prop.load(Fis);
		return prop.getProperty(browser);

	}

}
