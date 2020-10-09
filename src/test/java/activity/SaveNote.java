package activity;

import appiumControl.Button;
import appiumControl.TextBox;
import org.openqa.selenium.By;

public class SaveNote {
    public TextBox titleText;
    public TextBox bodyText;
    public Button  saveButton;

    public SaveNote(){
        titleText= new TextBox(By.id("jikansoftware.com.blocdenotas:id/title"));
        bodyText= new TextBox(By.id("jikansoftware.com.blocdenotas:id/body"));
        saveButton= new Button(By.id("jikansoftware.com.blocdenotas:id/btn_save"));
    }

}

/*
this.driver.findElement(By.id("jikansoftware.com.blocdenotas:id/title")).sendKeys("two title");
this.driver.findElement(By.id("jikansoftware.com.blocdenotas:id/body")).sendKeys("two note");
this.driver.findElement(By.id("jikansoftware.com.blocdenotas:id/btn_save")).click();

*/