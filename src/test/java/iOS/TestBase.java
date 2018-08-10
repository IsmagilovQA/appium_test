package iOS;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeSuite;

import java.net.MalformedURLException;
import java.net.URL;

public class TestBase {

    private static IOSDriver driver;
    public Page_AlertView alertViewScreen;
    public Page_Switches switchesScreen;
    public Page_Steppers steppersScreen;
    public Page_PickerView pickerViewScreen;
    public GoTo goTo;
    public Gestures gesture;

    @BeforeSuite
    public void capabilities() throws MalformedURLException {
        final String URL_STRING = "http://127.0.0.1:4723/wd/hub";
        URL url = new URL(URL_STRING);

        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 6");
        cap.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.IOS);
        cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.IOS_XCUI_TEST);
        cap.setCapability(MobileCapabilityType.APP, "/Users/ismagilov/Downloads/UICatalog.app");

        cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "120000");
        cap.setCapability(MobileCapabilityType.NO_RESET, true);
        cap.setCapability(MobileCapabilityType.FULL_RESET, false);

        driver = new IOSDriver<>(url, cap);

        alertViewScreen = new Page_AlertView(driver);
        switchesScreen = new Page_Switches(driver);
        steppersScreen = new Page_Steppers(driver);
        pickerViewScreen = new Page_PickerView(driver);
        goTo = new GoTo(driver);
        gesture = new Gestures(driver);
    }
/*
    @AfterSuite
    public void tearDown() throws Exception {
        driver.quit();
    }
*/

}
