package mx.stori.SeleniumPrj.StorieProject.Pages;



import org.apache.xmlbeans.impl.regex.ParseException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import mx.stori.SeleniumPrj.StorieProject.Components.Screenshot;

import mx.stori.SeleniumPrj.StorieProject.Pages.*;


/* In this class it contains in general classes the methods of all the actions
* of the web page.
* 
* @author Ernesto Trejo
* @version:20/06/2022
*/

public class GeneralMethods {
	public GeneralMethods(WebDriver driver) {
		this.driver = driver;
	}
	protected WebDriver driver;
	private mx.stori.SeleniumPrj.StorieProject.Pages.HomePage homepage;
	private mx.stori.SeleniumPrj.StorieProject.Components.Screenshot TakescreenShot;
	
	
	/**
	 * Constrcutor for the general methods class.
	 * 
	 * @param driver - The object is defined by the browser driver used in the test.
	 */
	
	public void navigateToUrl(String url) {
		driver.get(url);
	}
	
	public void screen() throws Exception{
		
		TakescreenShot= new mx.stori.SeleniumPrj.StorieProject.Components.Screenshot(driver);
		
	}
	
	public void inputText() throws Exception {
		
		homepage= new mx.stori.SeleniumPrj.StorieProject.Pages.HomePage(driver);
		homepage.selectRegion();
		
		
		
		
	}
	public void inputMethods() throws Exception {
		homepage= new mx.stori.SeleniumPrj.StorieProject.Pages.HomePage(driver);
		homepage.selectOption1();
		Thread.sleep(1000);
		homepage.selectOption2();
		homepage.clickOpenWindowButton();//capturar error
		homepage.scrollButton();//view button scroll
		TakescreenShot.screenshot("src\\test\\resources\\TemporaryScreenshot\\nameFolder", 5);
		homepage.textAlert();
		homepage.buttonAlert();
		homepage.confirmButton();
		homepage.getListPrices();
		homepage.getListNames();
		homepage.getTextiFrame();
	}
	
	//closing methods
}
