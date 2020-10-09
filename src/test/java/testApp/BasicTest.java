package testApp;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class BasicTest{
    private AppiumDriver driver;

    @Before
    public void before() throws MalformedURLException {
        System.out.println("Start Connection bloc note apk.....");

        DesiredCapabilities capabilities= new DesiredCapabilities();
        capabilities.setCapability("deviceName","LG.G5");
        capabilities.setCapability("platformVersion","8.0.0");
        capabilities.setCapability("appPackage","jikansoftware.com.blocdenotas");
        capabilities.setCapability("appActivity","jikansoftware.com.blocdenotas.ui.notes.NotesActivity");
        capabilities.setCapability("platformName","Android");

        this.driver=new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
        this.driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
    }

    @Test
    public void myfirstTest(){

        //  Action + Cual elemento? + En Donde esta el Elemento
        //  Click on [Login] Button in Login Page

        this.driver.findElement(By.id("jikansoftware.com.blocdenotas:id/addnotebutton")).click();  //

        this.driver.findElement(By.id("jikansoftware.com.blocdenotas:id/title")).sendKeys("one title");
        this.driver.findElement(By.id("jikansoftware.com.blocdenotas:id/body")).sendKeys("one note");
        this.driver.findElement(By.id("jikansoftware.com.blocdenotas:id/btn_save")).click();

        this.driver.findElement(By.id("jikansoftware.com.blocdenotas:id/addnotebutton")).click();  //

        this.driver.findElement(By.id("jikansoftware.com.blocdenotas:id/title")).sendKeys("two title");
        this.driver.findElement(By.id("jikansoftware.com.blocdenotas:id/body")).sendKeys("two note");
        this.driver.findElement(By.id("jikansoftware.com.blocdenotas:id/btn_save")).click();

        System.out.println("Task: " + this.driver.findElement(By.xpath("//*[contains(@resource-id,'text1') and contains(@text,'two')] ")).getText());



    }

    @After
    public void after(){
        System.out.println("AFTER.....");
        try {
            Thread.sleep(5555);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.driver.quit();
    }

}
