package appium_ios;

import java.net.MalformedURLException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import io.appium.java_client.ios.IOSDriver;

public class Test1 extends Base {

	@Test
	public void test22() throws MalformedURLException {

		IOSDriver driver = returnDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// scroll
		HashMap<String, Object> scrollObject = new HashMap<>();
		scrollObject.put("direction", "down");
		scrollObject.put("name", "Web View");

		driver.executeScript("mobile:scroll", scrollObject);
		System.out.println("Scroll realizado correctamente");
		driver.findElementByAccessibilityId("Web View").click();
		System.out.println("Click en web view correcto");
		driver.findElement(By.xpath("//XCUIElementTypeButton[@name='UIKitCatalog']")).click();
		System.out.println("Click en UIKitCatalog correcto");
		// picker
		driver.findElementByAccessibilityId("Picker View").click();
		driver.findElementByAccessibilityId("Red color component value").sendKeys("75");
		driver.findElementByAccessibilityId("Green color component value").sendKeys("230");
		driver.findElementByAccessibilityId("Blue color component value").sendKeys("115");
		System.out.println("se setearon los colores Correctamente");

	}

}
