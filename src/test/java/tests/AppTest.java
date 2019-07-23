package tests;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import pages.BasePO;
import pages.HomePO;

public class AppTest extends BasePO {
    HomePO hp = new HomePO();

    @Test
    public void validateTittle(){
        hp.selectTitle();
        Assert.assertTrue(hp.getTittle().isDisplayed());
    }

    @Test
    public void validateButtons(){
        hp.openButtons();
        Assert.assertTrue(hp.getButtons().isEnabled());
    }

    @Test
    public void validateCheckbox(){
        hp.openButtons();
        Assert.assertTrue(!hp.getCheckbox().isSelected());
    }

    @Test
    public void validateList(){
        hp.scrollDown();
        hp.scrollDown();
        hp.openList();
        hp.checkList();
        Assert.assertTrue(!hp.checkList().isSelected());
    }

    @Test
    public void validateDisable(){
        hp.scrollDown();
        hp.scrollDown();
        hp.scrollDown();
        hp.openDisable();
        hp.checkList();
        Assert.assertTrue(!hp.checkList().isEnabled());
    }

    @AfterMethod
    public void close(){
        driver.navigate().back();
    }
}

