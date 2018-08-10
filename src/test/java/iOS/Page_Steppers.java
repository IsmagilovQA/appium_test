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

public class Page_Steppers {

    private IOSDriver driver;

    //

    @iOSFindBy(id = "Increment")      // it's not unique, it clicks the first one from top left corner
    private IOSElement plusStepper;

    @iOSFindBy(className = "XCUIElementTypeStaticText")
    private List<IOSElement> quantity_of_stepper_clicks;

    //

    public Page_Steppers(IOSDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver, 30, TimeUnit.SECONDS), this);
    }

    //

    public void tapPlusStepper() {
        plusStepper.click();
    }

    public void verify_quantity_of_steppers_click(String quantity, int index) {
        assertThat(quantity_of_stepper_clicks.get(index).getAttribute("value"), equalTo(quantity));
    }
}

