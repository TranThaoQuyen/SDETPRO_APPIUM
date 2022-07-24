package api_learning;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;

public class LaunchAppTest {
    public static void main(String[] args) {
        //Send a request
        AppiumDriver<MobileElement> appiumDriver = null;

        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("platformName", "Android");
        desiredCapabilities.setCapability("automationName", "uiautomator2");
        desiredCapabilities.setCapability("udid","192.168.52.103:5555");
        desiredCapabilities.setCapability("appPackage","com.wdiodemoapp");
        desiredCapabilities.setCapability("appActivity",".MainActivity t7");

        try {// Init appium session
            URL appiumServer = new URL("http://localhost:4723/wd/hub");
            appiumDriver = new AppiumDriver<MobileElement>(appiumServer, desiredCapabilities);

            // Debug purpose only
            Thread.sleep(3000);
        }catch (Exception e){
            e.printStackTrace();
        }

        if(appiumDriver != null) appiumDriver.quit();

        appiumDriver.quit();

    }
}
