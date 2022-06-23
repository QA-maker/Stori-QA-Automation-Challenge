package mx.stori.SeleniumPrj.StorieProject.Pages;

import org.openqa.selenium.WebDriver;

import mx.stori.SeleniumPrj.StorieProject.Components.Screenshot;

public class StorieSite {
	
	 private WebDriver driver;
	 public StorieSite(WebDriver driver) {
	        this.driver = driver;
	    }
	 
	 public HomePage homepage() {
		 this.driver=driver;
	        return new HomePage(driver);
	    }
	 
	 public Screenshot takescreenshot() {
		 this.driver=driver;
	        return new Screenshot(driver);
		 
	 }

}
