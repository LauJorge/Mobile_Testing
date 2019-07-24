package tests;

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
        Assert.assertEquals(hp.getTittle().getText(), "Use Google's Location Services?");
    }

    @Test
    public void validateButtons(){
        hp.selectButtons();
        Assert.assertTrue(hp.getButtons().isEnabled());
    }

    @Test
    public void validateCheckbox(){
        hp.selectButtons();
        Assert.assertTrue(!hp.getCheckbox().isSelected());
    }


    @Test
    public void validateList(){
        hp.scrollDown();
        hp.scrollDown();
        hp.openList();
        hp.getListElement();
        Assert.assertTrue(!hp.getListElement().isSelected());
    }

    @Test
    public void validateDisplayEncryptedPass(){
     c
        hp.selectPass();
        hp.enterText();
        hp.checkShowPass();
        Assert.assertEquals(hp.getPass(), "lau");
    }

    @Test
    public void validateDisable(){
        hp.scrollDown();
        hp.scrollDown();
        hp.scrollDown();
        hp.selectDisable();
        hp.getListElement();
        Assert.assertTrue(!hp.getListElement().isEnabled());
    }



    @AfterMethod
    public void close(){
        driver.navigate().back();
    }
}

