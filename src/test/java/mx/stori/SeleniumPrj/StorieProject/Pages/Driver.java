package mx.stori.SeleniumPrj.StorieProject.Pages;


	
	

	import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

	/**
	 * Parent class of all classes pages.
	 * 
	 * @author Ernesto Trejo
	 * @version: 20/06/2022
	 */
	public class Driver {
		// Class variables.
		protected static WebDriver driver;
		protected WebDriverWait wait;

		/**
		 * Constrcutor for the Driver class.
		 * 
		 * @param driver - The object is defined by the browser driver used in the test.
		 */
		public Driver(WebDriver driver) {
			this.driver = driver;
		
		}

		protected WebElement waitUntilVisible(WebElement element) {
			return wait.until(ExpectedConditions.visibilityOf(element));
		}

		protected WebElement waitUntilVisible(By by) {
			WebElement element = driver.findElement(by);
			return wait.until(ExpectedConditions.visibilityOf(element));
		}

		protected WebElement waitUntilClickable(WebElement element) {
			return wait.until(ExpectedConditions.elementToBeClickable(element));
		}

		protected WebElement waitUntilClickable(By by) {
			WebElement element = driver.findElement(by);
			return wait.until(ExpectedConditions.elementToBeClickable(element));
		}

		protected void scrollToElement(WebElement ele) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView();", ele);
		}

		protected void scrollToElement(By by) {
			WebElement ele = driver.findElement(by);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView();", ele);
		}

		protected void safeClick(WebElement element) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click();", element);
		}

		protected void safeClick(By by) {
			WebElement element = driver.findElement(by);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click();", element);
		}

		public void selectItemByName(By by, String item) {
			Select dropDownList = new Select(driver.findElement(by));
			dropDownList.selectByVisibleText(item);
		}

		public void selectItemByIndex(By by, int index) {
			Select dropDownList = new Select(driver.findElement(by));
			dropDownList.selectByIndex(index);
		}

		

		
		}
	// Class closing



