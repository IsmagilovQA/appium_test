package iOS;

import org.testng.annotations.Test;

public class Tests extends TestBase {

    /* @BeforeTest
    public void preconditions() {
        goTo.tap_AlertView_listItem();
    }
    */


    @Test
    public void test() {
        goTo.tap_AlertView_listItem();
        alertViewScreen.tap_OkeyCancel_listItem();
        alertViewScreen.acceptAlert();
        alertViewScreen.verify_UICatalog_BackButton();
        alertViewScreen.tap_backButton();
        goTo.scroll("down", "Switches");
        goTo.tap_Switches_listItem();
    }

    @Test
    public void test2() {
        goTo.scroll("down", "Text View");
        goTo.tap_Steppers_listItem();
        steppersScreen.tapPlusStepper();
        steppersScreen.tapPlusStepper();
        steppersScreen.verify_quantity_of_steppers_click("2", 0);
    }

    @Test
    public void testPickerView() {
        goTo.tap_pickerView_listItem();
        pickerViewScreen.set_Red_Picker_ByValue("75");
        pickerViewScreen.set_Green_Picker_ByValue("150");
        pickerViewScreen.set_Blue_Picker_ByValue("200");
        pickerViewScreen.verify_Value_Of_RedPicker("75");
        pickerViewScreen.verify_Value_Of_GreenPicker("150");
        pickerViewScreen.verify_Value_Of_BluePicker("200");
    }

    @Test
    public void testNavigateBack() {
        goTo.tap_pickerView_listItem();
        goTo.navigateBack();
    }

    // test update
}
