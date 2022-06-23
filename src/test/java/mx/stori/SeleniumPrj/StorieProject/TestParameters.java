package mx.stori.SeleniumPrj.StorieProject;


	
	

	import java.util.HashMap;
	import java.util.Map;
	import java.util.concurrent.TimeUnit;

	import org.junit.After;
	import org.junit.Before;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.chrome.ChromeOptions;

import mx.stori.SeleniumPrj.StorieProject.Components.Screenshot;
import mx.stori.SeleniumPrj.StorieProject.Components.StorieComponentsPage;
import mx.stori.SeleniumPrj.StorieProject.Pages.Driver;
import mx.stori.SeleniumPrj.StorieProject.Pages.GeneralMethods;
import mx.stori.SeleniumPrj.StorieProject.Pages.StorieSite;
	

	/**
	 * This class is where you define the parameters of the test for its execution
	 * is parent to the RunTest class.
	 * 
	 * @author
	 * @version: 
	 *
	 */
	public class TestParameters {
		// Class variables.
		private static String chromeDriver = "src\\test\\resources\\Driver\\chromedriver.exe";
		protected static WebDriver driver;
		protected static Driver pageDriver;
		protected static StorieSite storie;
		protected static GeneralMethods generalMethods;
		protected static StorieComponentsPage takescreenshot;
		protected static ChromeOptions options;
		
		
		// before is the class where the browser parameters are executed as the objects
		// of the classes that will be used.
		@Before
		public void before() {
			System.setProperty("webdriver.chrome.driver", chromeDriver);
			options = new ChromeOptions();
			options.addArguments("start-maximized");
			Map<String, Object> prefs = new HashMap<String, Object>();
			prefs.put("profile.default_content_setting_values.geolocation", 1);
			prefs.put("profile.default_content_setting_values.notifications", 1);
			options.setExperimentalOption("prefs", prefs);
			options.addArguments("disable-infobars");
			driver = new ChromeDriver(options);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			storie= new mx.stori.SeleniumPrj.StorieProject.Pages.StorieSite(driver);
			generalMethods= new mx.stori.SeleniumPrj.StorieProject.Pages.GeneralMethods(driver);
			takescreenshot= new mx.stori.SeleniumPrj.StorieProject.Components.StorieComponentsPage();
			
		}// Closing of class before.
		
		

	}// Class closing


