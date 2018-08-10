package iOS;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class GoTo extends Gestures {

    private IOSDriver driver;

    //

    @iOSFindBy(accessibility = "Alert Views")
    private IOSElement alertViewItem;

    @iOSFindBy(accessibility = "Web View")
    private IOSElement webViewItem;

    @iOSFindBy(accessibility = "Switches")
    private IOSElement switchesItem;

    @iOSFindBy(accessibility = "Steppers")
    private IOSElement steppersItem;

    @iOSFindBy(accessibility = "Picker View")
    private IOSElement pickerViewItem;

    //

    public GoTo(IOSDriver driver) {
        super(driver);
        PageFactory.initElements(new AppiumFieldDecorator(driver, 30, TimeUnit.SECONDS), this);
    }

    //

    public void navigateBack() {
        driver.navigate().back();
    }

    public void tap_AlertView_listItem() {
        alertViewItem.click();
    }

    public void tap_Switches_listItem() {
        switchesItem.click();
    }

    public void tap_Steppers_listItem() {
        steppersItem.click();
    }

    public void scroll(String direction, String element) {
        scrollGesture(direction, element);
    }

    public void tap_pickerView_listItem() {
        pickerViewItem.click();
    }

    /*
    public void scrollByCoordinates(int x1, int y1, int x2, int y2) {
        scrollByTouchAction(x1, y1, x2, y2);
    }
    */

    public void swipe(String direction, String element) {
        swipeGesture(direction, element);
    }

}
