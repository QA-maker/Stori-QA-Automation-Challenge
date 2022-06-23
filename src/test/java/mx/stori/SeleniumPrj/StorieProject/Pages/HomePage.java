package mx.stori.SeleniumPrj.StorieProject.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Select;

import mx.stori.SeleniumPrj.StorieProject.Components.*;

public class HomePage extends Driver {
	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	

	public void selectRegion( ) throws InterruptedException {
		try {
			WebElement region= driver.findElement(mx.stori.SeleniumPrj.StorieProject.Components.StorieComponentsPage.CountriesSelect);
			waitUntilClickable(region).sendKeys("Mex");
			waitUntilClickable(region).click();
			
	/*	List <WebElement> listItems = driver.findElements(By.xpath("//div[@id='select-class-example']/fieldset/input"));
		listItems.get(0).click();*/
		
		
	
		
		}catch (Exception error) {
			
			error.getMessage();
		}
		
	}
	

	
	
	

	public void selectOption1() throws InterruptedException {
		try {
		
		WebElement options = driver.findElement(StorieComponentsPage.selectOptions);
		Thread.sleep(StorieComponentsPage.stopShortTimeMilliseconds);
		
		waitUntilVisible(options).click();
		Select seleccionarOption1=new Select(driver.findElement(StorieComponentsPage.selectOptions));
		seleccionarOption1.selectByVisibleText("Option1");

		}catch (Exception error) {
			
			error.getMessage();
		}
	}
	
	public void selectOption2() throws InterruptedException {
		WebElement options2 = driver.findElement(StorieComponentsPage.selectOptions);
		Thread.sleep(StorieComponentsPage.stopShortTimeMilliseconds);
		
		waitUntilVisible(options2).click();
		Select seleccionarOption1=new Select(driver.findElement(StorieComponentsPage.selectOptions));
		seleccionarOption1.selectByVisibleText("Option2");
	}

	public void clickOpenWindowButton() throws InterruptedException {
		try {
		WebElement buttonOpen = driver.findElement(StorieComponentsPage.windowButton);
		Thread.sleep(StorieComponentsPage.stopShortTimeMilliseconds);
		waitUntilVisible(buttonOpen).click();
		}catch (Exception error) {
			
			error.getMessage();
		}
		
	}

	public void scrollButton() throws InterruptedException {
		WebElement ScrollDown = driver.findElement(StorieComponentsPage.OpenTab);
		Thread.sleep(StorieComponentsPage.stopShortTimeMilliseconds);
		waitUntilVisible(ScrollDown).click();

		// scroll to button view all courses
		
		scrollToElement(By.xpath("//a[contains(text(),'VIEW ALL COURSES')]"));
		

	}

	public void textAlert() throws InterruptedException {
		WebElement text = driver.findElement(StorieComponentsPage.textAlert);
		Thread.sleep(StorieComponentsPage.stopShortTimeMilliseconds);
		waitUntilVisible(text).clear();
		waitUntilVisible(text).sendKeys("Storie Card"); // StorieCard

	}

	public void buttonAlert() throws InterruptedException {
		WebElement btnAlert = driver.findElement(StorieComponentsPage.ButtonAlert);
		Thread.sleep(StorieComponentsPage.stopShortTimeMilliseconds);
		waitUntilVisible(btnAlert).click();

		// visible text
		driver.switchTo().alert().accept();
	}

	public void confirmButton() throws InterruptedException {
		WebElement btnConfirm = driver.findElement(StorieComponentsPage.ButtonConfirm);
		Thread.sleep(StorieComponentsPage.stopShortTimeMilliseconds);
		waitUntilVisible(btnConfirm).click();

		// visible text
		driver.switchTo().alert().accept();
	}

	public void getListPrices() throws Exception {

		List<WebElement> listCourses;
		List<WebElement> rowCourses;
		int contador = 0;
		listCourses = driver.findElements(By.xpath("//*[@id='product']//tbody//tr"));
		String print = "";

		for (WebElement listRowCourses : listCourses) {
			contador = contador + 1;
			rowCourses = driver
					.findElements(By.xpath("//*[@id='product']//tbody//tr[" + String.valueOf(contador) + "]//td"));
			for (WebElement columnCourses : rowCourses) {
				if (columnCourses.getText().contains("25"))
					;
				print = columnCourses.getText();

				System.out.println("Se imprime las columnas" + print);
			}

		}

	}

	public void getListNames() throws Exception {

		List<WebElement> listCourses;
		List<WebElement> rowCourses;
		int contador = 0;
		listCourses = driver.findElements(By.cssSelector(".tableFixHead"));
		String print = "";

		for (WebElement listRowCourses : listCourses) {
			contador = contador + 1;
			rowCourses = driver
					.findElements(By.xpath("//*[@id='product']//tbody//tr[" + String.valueOf(contador) + "]//td"));
			for (WebElement columnCourses : rowCourses) {
				print = columnCourses.getText();

				System.out.println("Se imprime las columnas" + print);
			}
		}	
	}

	public void getTextiFrame() throws Exception {

		WebElement textiFrame = driver.findElement(StorieComponentsPage.textHigligth);
		waitUntilVisible(textiFrame).getText();

	}

}
