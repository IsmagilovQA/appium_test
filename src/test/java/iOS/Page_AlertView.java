package iOS;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class Page_AlertView {

    private IOSDriver driver;

    // Find elements on page using locators

    @iOSFindBy(accessibility = "Okay / Cancel")
    private IOSElement okeyCancelButton;

    @iOSFindBy(className = "XCUIElementTypeButton")
    private IOSElement backButton;


    // initElements with PageFactory

    public Page_AlertView(IOSDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver, 30, TimeUnit.SECONDS), this);
    }

    // Actions using previously defined locators

    public void tap_OkeyCancel_listItem() {
        okeyCancelButton.click();
    }

    public void acceptAlert() {
        driver.switchTo().alert().accept();
    }

    public void verify_UICatalog_BackButton() {
        assertThat(backButton.getAttribute("name"), equalTo("UICatalog"));
    }

    public void tap_backButton() {
        backButton.click();
    }

}
