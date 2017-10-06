package utils;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

/**
 * Created by Forgeahead-Shital on 10/3/2017.
 */

public class SetupDriver {

    public static AndroidDriver driver;
@BeforeTest
    public void setupDriver() throws MalformedURLException, InterruptedException {

       // File classpathRoot = new File(System.getProperty("user.dir"));
       // File appDir = new File(classpathRoot, "/Apps/Facebook/");
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(CapabilityType.BROWSER_NAME, "Android");
        capabilities.setCapability("deviceName", "Redmi");
        capabilities.setCapability("platformVersion", "6.0.1");
        capabilities.setCapability("platformName", "Android");
       // capabilities.setCapability("appDir", appDir.getAbsolutePath());
        capabilities.setCapability("appPackage", "com.facebook.katana");
        capabilities.setCapability("appActivity", "com.facebook.katana.LoginActivity");
        try {

            driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
            System.out.println("driver successful");
            driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
            Thread.sleep(1000);
            //    driver.quit();
        } catch (Exception ex) {
            ex.printStackTrace();
        }

//        driver.findElement(By.xpath("//android.widget.LinearLayout[@index='1']")).click();
//        driver.findElement(By.xpath("//android.widget.EditText[@text='Email or Phone']")).sendKeys("ooyalarelease01@gmail.com");
//        driver.findElement(By.xpath("//android.widget.EditText[@text='Password']")).sendKeys("!Password1");
//        driver.findElement(By.xpath("//android.widget.Button[@text='LOG IN']")).click();


    }

}
