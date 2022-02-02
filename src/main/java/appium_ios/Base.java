package appium_ios;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;

public class Base {

	private static final String app = System.getProperty("user.home") + "/Desktop/UIKitCatalog2.app";
	private static final String appw = "/Users/juan.pablo.bejarano/eclipse-workspace/appiumIOSBitrase/src/main/resources/UIKitCatalog.app";
	private static final String app_bitrise = "/Users/vagrant/git/appium_automation/src/main/resources/UIKitCatalog.app";

	public IOSDriver returnDriver() throws MalformedURLException {
		System.out.println("---------------------");
		System.out.println("---------------------");
		System.out.println("---------------------");
		System.out.println("---------------------");
		System.out.println("---------------------");
		System.out.println("APP PATH: " + System.getenv("BITRISE_APP_DIR_PATH"));
		System.out.println("APP PATH: " + System.getenv("BITRISE_APP_DIR_PATH_LIST"));
		System.out.println("---------------------");
		System.out.println("---------------------");
		System.out.println("---------------------");
		System.out.println("---------------------");
		System.out.println("---------------------");
		DesiredCapabilities cap = new DesiredCapabilities();
		

		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "15.0");
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 8 Plus");
		cap.setCapability(MobileCapabilityType.UDID, "0CC2A307-1FA2-48CF-8DB0-8216DC84F6C3");
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.IOS_XCUI_TEST);
		cap.setCapability(MobileCapabilityType.APP, app_bitrise);
//		cap.setCapability(MobileCapabilityType.APP, app_bitrise);

		IOSDriver driver = new IOSDriver<>(new URL("http://localhost:4723/wd/hub"), cap);
		return driver;
	}
}
