package appium_ios;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;

public class Base {

	private static final String app = System.getProperty("user.home") + "/Desktop/UIKitCatalog.app";
	private static final String appw = "/Users/juan.pablo.bejarano/eclipse-workspace/appiumIOSBitrase/src/main/resources/UIKitCatalog.app";
	private static final String app_bitrise = "/appium_automation/src/main/resources/UIKitCatalog.app";

	public IOSDriver returnDriver() throws MalformedURLException {
		DesiredCapabilities cap = new DesiredCapabilities();

		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "15.0");
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 8 Plus");
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.IOS_XCUI_TEST);
//		cap.setCapability(MobileCapabilityType.APP, System.getenv("BITRISE_IPA_PATH"));
		cap.setCapability(MobileCapabilityType.APP, app_bitrise);
		System.out.println("---------------------");
		System.out.println("---------------------");
		System.out.println("---------------------");
		System.out.println("---------------------");
		System.out.println("---------------------");
		System.out.println("APP PATH: " + System.getenv("BITRISE_APK_PATH"));
		System.out.println("---------------------");
		System.out.println("---------------------");
		System.out.println("---------------------");
		System.out.println("---------------------");
		System.out.println("---------------------");
		IOSDriver driver = new IOSDriver<>(new URL("http://localhost:4723/wd/hub"), cap);
		return driver;
	}
}
