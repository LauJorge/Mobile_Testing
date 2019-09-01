package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.Augmenter;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

    /**
     * @author Lau Jorge
     */

 public abstract class BasePO{

        public static URL url;
        public static DesiredCapabilities capabilities;
        public static AndroidDriver<MobileElement> driver;

        @BeforeSuite
        public void setupAppium() throws MalformedURLException {
            final String URL_STRING = "http://127.0.0.1:4723/wd/hub";
            url = new URL(URL_STRING);

            capabilities = new DesiredCapabilities();
            capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "LauNexus");
            capabilities.setCapability(MobileCapabilityType.APP, "https://github.com/afollestad/material-dialogs/raw/master/sample/sample.apk");
            capabilities.setCapability(MobileCapabilityType.NO_RESET, true);
            capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");

            driver = new AndroidDriver<MobileElement>(url, capabilities);
            driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
            driver.resetApp();
        }

        @AfterSuite
        public void uninstallApp() throws InterruptedException {
            driver.removeApp("com.example.android.contactmanager");
        }


        public static WebDriver getScreenshotableWebDriver() {
            final WebDriver augmentedDriver = new Augmenter().augment(driver);
            return augmentedDriver;
        }


    }
