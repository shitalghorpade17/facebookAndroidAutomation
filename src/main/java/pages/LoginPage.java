package pages;

import io.appium.java_client.MobileElement;
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
    @Test
    public void login(){
        try {
            SetupDriver.driver.findElement(By.id("com.facebook.katana:id/login_username")).getText();
         //   SetupDriver.driver.findElement(By.id("com.facebook.katana:id/login_username"))
            SetupDriver.driver.findElement(By.id("com.facebook.katana:id/login_username")).sendKeys("ooyalarelease01@gmail.com");


            SetupDriver.driver.findElement(By.id("com.facebook.katana:id/login_password")).sendKeys("!Password1");

            SetupDriver.driver.findElement(By.id("com.facebook.katana:id/login_login")).click();

            SetupDriver.driver.findElement(By.xpath("//android.widget.Button[@text='Not Now']")).click();


            WebElement element = SetupDriver.driver.findElement(By.xpath("//android.view.ViewGroup[@instance=2]"));
            element.click();
            Thread.sleep(2000);

            SetupDriver.driver.findElement(By.id("com.facebook.katana:id/composer_status_text")).sendKeys("Mi Automation Shikle");
            Thread.sleep(2000);

            SetupDriver.driver.findElement(By.id("com.facebook.katana:id/primary_named_button")).click();

            Thread.sleep(1000);


      //      SetupDriver.driver.findElement(By.id("com.android.packageinstaller:id/permission_allow_button")).click();

       //     SetupDriver.driver.findElement(By.id("com.facebook.katana:id/bookmarks_tab")).click();


       //     SetupDriver.driver.findElement(By.xpath("com.facebook.fbui.widget.contentview.ContentView[@index='1']")).click();

     //       SetupDriver.driver.findElement(By.xpath("com.facebook.fbui.widget.contentview.ContentView[@content-desc='Mahesh Ooyala. View your profile']"));

      //      SetupDriver.driver.findElement(By.xpath("android.view.View[@index='7']")).click();

//            WebElement element = SetupDriver.driver.findElement(By.xpath("//android.view.ViewGroup[@instance=2]"));
  //          element.click();

                    Thread.sleep(5000);
       //     MobileElement el1 = (MobileElement) SetupDriver.driver.findElement(By.xpath("//android.view.ViewGroup[@text='Whats on your Mind?']"));
        //    el1.click();


           // SetupDriver.driver.tap(0,614,1080,815);
         //   SetupDriver.driver.findElement (By.xpath("//android.view.ViewGroup[@index='3']"));
           //  SetupDriver.driver.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.support.v4.view.ViewPager[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.support.v7.widget.RecyclerView[1]/android.view.ViewGroup[2]")).click();
/*
            WebDriverWait wait = new WebDriverWait(SetupDriver.driver, 10000);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.view.ViewGroup[@index='3']")));
*/
           //List<WebElement> elements = SetupDriver.driver.findElements(By.xpath("//android.view.ViewGroup"));

//WebElement element = SetupDriver.driver.findElement(By.xpath("//android.view.ViewGroup[@instance=2]"));
//            SetupDriver.driver.tap(1,element, 2);


            //System.out.println("Test7 number of elements: " + elements.size());

            //String myxpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.support.v4.view.ViewPager/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.support.v7.widget.RecyclerView/android.view.ViewGroup[2]";
/*            WebElement element = SetupDriver.driver.findElement(By.xpath("//android.view.ViewGroup[@index='2']"));
            System.out.println(">>>>>>>" + element.isDisplayed() + " " + element.isEnabled());
            Thread.sleep(5000);
            SetupDriver.driver.tap(1,element,2);*/

 /*                          SetupDriver.driver.findElement(By.id("com.facebook.katana:id/composer_status_text")).click();

            SetupDriver.driver.findElement(By.id("com.facebook.katana:id/composer_status_text")).sendKeys("To take party from Rohit");
            SetupDriver.driver.findElement(By.id("com.facebook.katana:id/primary_named_button")).click();*/


        }catch(Exception e){
            e.printStackTrace();
        }


    }

}
