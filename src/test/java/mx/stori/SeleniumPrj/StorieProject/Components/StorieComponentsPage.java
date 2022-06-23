package mx.stori.SeleniumPrj.StorieProject.Components;

import org.openqa.selenium.By;

public class StorieComponentsPage {

	public final static int stopShortTimeMilliseconds = 3000;
	public final static int stopMediumTimeMilliseconds = 5000;
	public final static int stopLongTimeMilliseconds = 18000;

	public final static String urlProject = "https://rahulshettyacademy.com/AutomationPractice/";

	// Components Home Page Elements

	public final static By CountriesSelect = By.xpath("//input[@class='inputs ui-autocomplete-input']");
	public final static By selectOptions = By.xpath("//select[@id='dropdown-class-example']");
	public final static By windowButton = By.xpath("//button[@id='openwindow']");// realizar manejo de Errores
	public final static By OpenTab = By.xpath("//a[@id='opentab']");// take screenshoot
	public final static By textAlert = By.xpath("//input[@id='name']");
	public final static By ButtonAlert = By.xpath("//input[@id='alertbtn']");
	public final static By ButtonConfirm = By.xpath("//input[@id='confirmbtn']");
	public final static By textHigligth = By.xpath("//iframe[@id='courses-iframe']");
	

}
