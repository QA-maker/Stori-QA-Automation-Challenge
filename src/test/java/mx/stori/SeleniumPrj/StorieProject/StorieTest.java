package mx.stori.SeleniumPrj.StorieProject;

import org.junit.After;
import org.junit.Test;

import mx.stori.SeleniumPrj.StorieProject.Components.StorieComponentsPage;

public class StorieTest extends TestParameters {

	
	@Test
	public void StorieTest() throws Exception {
		generalMethods.navigateToUrl(mx.stori.SeleniumPrj.StorieProject.Components.StorieComponentsPage.urlProject);
		Thread.sleep(1500000);
		generalMethods.inputText();
		System.out.println(mx.stori.SeleniumPrj.StorieProject.Components.StorieTestCaseInfo.actionStep2);
		//generalMethods.inputMethods();*/
		
			
		}
/*	@After
	public void after() {
		driver.quit();
	}*/
}
		
		
