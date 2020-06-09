package library;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Library {

	public WebDriver driver;
	public Properties prop;

	public Properties property() throws IOException {
		FileInputStream stream = new FileInputStream("C:\\Users\\Ramesh\\eclipse-workspace\\seleniumeasy\\src\\config\\config.properties");
		prop = new Properties();
		prop.load(stream);
		return prop;
	}
	
	public void launchbrowser() throws IOException {
		property();

		if (prop.getProperty("Browser").equals("Firefox")){
			System.setProperty("webdriver.gecko.driver", prop.getProperty("Firefoxpath"));
			driver = new FirefoxDriver();
		}
		else if (prop.getProperty("Browser").equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver", prop.getProperty("Chromepath"));
			driver = new ChromeDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(prop.getProperty("Url"));
	}

		
	public void teardown() {

		driver.quit();
	}
}
