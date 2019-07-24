package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.WebElement;

import java.util.List;


public class HomePO extends BasePO {


    public WebElement getTittle() {
        WebElement tittle = driver.findElementById("com.afollestad.materialdialogssample:id/md_text_title");
        return tittle;
    }

    public void selectTitle() {
        WebElement tittle_btn = driver.findElementById("com.afollestad.materialdialogssample:id/basic_titled");
        tittle_btn .click();
    }

    public void selectButtons() {
        WebElement buttons_btn = driver.findElementById("com.afollestad.materialdialogssample:id/basic_checkbox_titled_buttons");
        buttons_btn.click();
    }

    public WebElement getButtons() {
        WebElement buttons = driver.findElementByClassName("android.widget.Button");
        return buttons;
    }

    public WebElement getCheckbox() {
        WebElement checkbox = driver.findElementById("com.afollestad.materialdialogssample:id/md_checkbox_prompt");
        checkbox.click();
        return checkbox;
    }

    public WebElement getListElement() {
        //Try this below the code
        String a = "Google+"; /// last element in the list
        Boolean found_result = false;
        List<MobileElement> ele = driver.findElementsById("com.afollestad.materialdialogssample:id/md_title");

        WebElement h = null;
        while (!found_result) {

            int size = 0;
            size = size + ele.size();

            for (int i = 0; i < size; i++) {

                String s = ele.get(i).getText();
                if (s.equals(a)) {
                    found_result = true;
                    h = ele.get(i);
                    h.click();
                    break;
                }
            }

        }
        return h;
    }

    public void selectDisable() {
        WebElement list_btn = driver.findElementById("com.afollestad.materialdialogssample:id/multiple_choice_disabled_items");
        list_btn.click();
    }

    public void openCallback() {
        WebElement list_btn = driver.findElementById("com.afollestad.materialdialogssample:id/buttons_callbacks");
        list_btn.click();
    }

    public void openList() {
        WebElement list_btn = driver.findElementById("com.afollestad.materialdialogssample:id/single_choice_buttons_titled");
        list_btn.click();
    }

    public void scrollDown() {
        //if pressX was zero it didn't work for me
        int pressX = driver.manage().window().getSize().width / 2;
        // 4/5 of the screen as the bottom finger-press point
        int bottomY = driver.manage().window().getSize().height * 4/5;
        // just non zero point, as it didn't scroll to zero normally
        int topY = driver.manage().window().getSize().height / 8 ;
        //scroll with TouchAction by itself
        scroll(pressX, bottomY, pressX, topY);
    }

    private void scroll(int fromX, int fromY, int toX, int toY) {
        TouchAction touchAction = new TouchAction(driver);
        touchAction.longPress(PointOption.point(fromX, fromY)).moveTo(PointOption.point(toX, toY)).release().perform();
    }

    public void enterText(){
        WebElement text_input = driver.findElementById("com.afollestad.materialdialogssample:id/password");
        text_input.clear();
        text_input.sendKeys("lau");;
    }

    public void checkShowPass() {
    WebElement show_pass_check = driver.findElementById("com.afollestad.materialdialogssample:id/showPassword");
    show_pass_check.click();
    }

    public String getPass() {
        WebElement enc_pass = driver.findElementById("com.afollestad.materialdialogssample:id/password");
        String pass = enc_pass.getText();
        return pass;
    }

    public void selectPass() {
        WebElement pass_btn = driver.findElementById("com.afollestad.materialdialogssample:id/custom_view");
        pass_btn.click();
    }

}
