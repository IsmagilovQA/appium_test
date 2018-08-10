package iOS;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class Page_PickerView {

    private IOSDriver driver;

    //

    @iOSFindBy(accessibility = "Green color component value")
    private IOSElement greenPicker;

    @iOSFindBy(className = "XCUIElementTypePickerWheel")
    private List<IOSElement> pickerWheels;

    @iOSFindBy(xpath = "//XCUIElementTypePickerWheel[@name=\"Blue color component value\"]")
    private IOSElement bluePicker;


    //

    public Page_PickerView(IOSDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver, 5, TimeUnit.SECONDS), this);
    }

    //

    public void set_Green_Picker_ByValue(String value) {
        greenPicker.sendKeys(value);
    }

    public void set_Red_Picker_ByValue(String value) {
        pickerWheels.get(0).sendKeys(value);
    }

    public void set_Blue_Picker_ByValue(String value) {
        bluePicker.sendKeys(value);
    }

    public void verify_Value_Of_GreenPicker(String value) {
        assertThat(greenPicker.getAttribute("value"), equalTo(value));
    }

    public void verify_Value_Of_RedPicker(String value) {
        assertThat(pickerWheels.get(0).getAttribute("value"), equalTo(value));
    }

    public void verify_Value_Of_BluePicker(String value) {
        assertThat(bluePicker.getAttribute("value"), equalTo(value));
    }
}
