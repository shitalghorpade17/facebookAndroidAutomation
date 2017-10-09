package pages;

import io.appium.java_client.MobileElement;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import sun.awt.windows.ThemeReader;
import utils.SetupDriver;

import java.util.List;
import java.util.Set;

/**
 * Created by Forgeahead-Shital on 10/3/2017.
 */
public class LoginPage {
    private final static Logger logger = Logger.getLogger(LoginPage.class);

    @Test
    public void login(){
        try {
            SetupDriver.driver.findElement(By.id("com.facebook.katana:id/login_username")).getText();
            SetupDriver.driver.findElement(By.id("com.facebook.katana:id/login_username")).clear();
            logger.info("username : ooyalarelease01@gmail.com");
            SetupDriver.driver.findElement(By.id("com.facebook.katana:id/login_username")).sendKeys("ooyalarelease01@gmail.com");
            SetupDriver.driver.findElement(By.id("com.facebook.katana:id/login_password")).sendKeys("!Password1");
            SetupDriver.driver.findElement(By.id("com.facebook.katana:id/login_login")).click();
            SetupDriver.driver.findElement(By.xpath("//android.widget.Button[@text='Not Now']")).click();
            SetupDriver.driver.findElement(By.id("com.android.packageinstaller:id/permission_allow_button")).click();
            WebElement element = SetupDriver.driver.findElement(By.xpath("//android.view.ViewGroup[@instance=2]"));
            element.click();
            Thread.sleep(2000);
            SetupDriver.driver.findElement(By.id("com.facebook.katana:id/composer_status_text")).sendKeys("Hi My automation ready for posting status");
            Thread.sleep(2000);
            SetupDriver.driver.findElement(By.id("com.facebook.katana:id/primary_named_button")).click();
            Thread.sleep(1000);
            SetupDriver.driver.findElement(By.id("com.facebook.katana:id/feed_feedback_share_container")).click();

            SetupDriver.driver.findElement(By.id("com.facebook.katana:id/fbui_popover_list_item_title")).click();
            Thread.sleep(1000);
            //SetupDriver.driver.findElement(By.id("com.facebook.katana:id/fbui_popover_list_item_description")).click();
            Thread.sleep(2000);
            //Logout
            SetupDriver.driver.findElement(By.id("com.facebook.katana:id/bookmarks_tab")).click();

            SetupDriver.driver.scrollTo("Log Out");
            Thread.sleep(1000);
            SetupDriver.driver.findElement(By.xpath("//com.facebook.fbui.widget.contentview.ContentView[@index='9']")).click();
          // content-desc= Log Out

            SetupDriver.driver.findElement(By.id("com.facebook.katana:id/button1")).click();




        }catch(Exception e){
            e.printStackTrace();
            logger.error(e.getMessage());
            logger.error("message error as",e);
        }


    }

}
