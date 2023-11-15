package KeblesTrading.utilities;

import com.google.common.collect.ImmutableMap;
import kafka.log.Log;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import java.io.FileInputStream;
import java.net.URL;
import java.util.HashMap;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class TestBase {

	public static WebDriver driver;
	public static Logger log;
	public static Properties prop;
	

	static {
		log = (Logger) LogManager.getLogger("consoleLogger");
		prop = new Properties();
		FileInputStream ip;
		try {
			ip = new FileInputStream("src\\test\\java\\KeblesTrading\\configuration\\config.properties");
			prop.load(ip);
			AllureEnvironment.setAllureEnvironment(
					ImmutableMap.<String, String>builder()
							.put("Project", prop.getProperty("Project"))
							.put("Environment", prop.getProperty("Environment"))
							.put("Platform", prop.getProperty("Platform"))
							.build(), System.getProperty("user.dir")
							+ "/allure-results/");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	 public static void launchUrl() throws Exception {
	    	try {
	    	ChromeOptions chromeOptions = new ChromeOptions();
//	    	WebDriverManager.chromedriver().setup();
	    	driver = new ChromeDriver(chromeOptions);
	        driver.get(prop.getProperty("url"));
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(Integer.parseInt(prop.getProperty("implicitWait")), TimeUnit.SECONDS);
	    	} catch (Exception e) {
				e.printStackTrace();
			}
	    }

	    public void closeApplication() throws Exception {
	        closeBrowser();
	    }

//	public static void setdriver(WebDriver driver) {
//		TestBase.driver = driver;
//	}

	public void closeBrowser() {
		driver.quit();
	}
}
