package iOS;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;

public class Gestures {

    private IOSDriver driver;

    //

    public Gestures(IOSDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver, 30, TimeUnit.SECONDS), this);
    }

    public void scrollGesture(String move, String value) {                                 // down, up, left, right
        JavascriptExecutor js = driver;
        HashMap<String, String> scrollObject = new HashMap<>();
        scrollObject.put("direction", move);
        scrollObject.put("name", value);
        js.executeScript("mobile: scroll", scrollObject);
    }

    public void swipeGesture(String move, String element){
        JavascriptExecutor js = driver;
        HashMap<String, String> scrollObject = new HashMap<>();
        scrollObject.put("direction", move);
        scrollObject.put("name", element);
        js.executeScript("mobile: swipe", scrollObject);
    }

    /*
    public void scrollByTouchAction(int start_x, int start_y, int end_x, int end_y) {
        TouchAction myAction = new TouchAction(driver);
        myAction.press(start_x, start_y).moveTo(end_x, end_y).release().perform();
    }

    public void scrollByID(String toID, String fromID) {
        TouchAction act = new TouchAction(driver);
        WebElement toElement = driver.findElementByAccessibilityId(toID);
        WebElement fromElement = driver.findElementByAccessibilityId(fromID);
        act.press(fromElement).moveTo(toElement).release().perform();
    }
    */

    public void swipe_by_coordinates() {

    }

}
