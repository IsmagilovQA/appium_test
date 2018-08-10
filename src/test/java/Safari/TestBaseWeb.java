package Safari;

import com.codeborne.selenide.Selenide;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TestBaseWeb {

    private static IOSDriver driver;

    @BeforeSuite
    public void capabilities_web() throws MalformedURLException {
        final String URL_STRING = "http://127.0.0.1:4723/wd/hub";
        URL url = new URL(URL_STRING);

        DesiredCapabilities cap_web = new DesiredCapabilities();
        cap_web.setCapability(MobileCapabilityType.PLATFORM_NAME, "iOS");
        cap_web.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11.3");
        cap_web.setCapability(MobileCapabilityType.BROWSER_NAME, "Safari");
        cap_web.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone X");

        driver = new IOSDriver<>(url, cap_web);
    }

    @Test
    public void testBrowser() {
        IOSDriver driver;
        open("https://james-willett.com/2017/05/rest-assured-gpath-json/");
        $("");

    }
}
