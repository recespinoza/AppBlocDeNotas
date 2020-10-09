package activity;

import appiumControl.Button;
import appiumControl.Label;
import org.openqa.selenium.By;

public class AddNote {
    public Button addButton;
    public Label  searchNote;
    // this.driver.findElement(By.id("jikansoftware.com.blocdenotas:id/addnotebutton")).click();  //
    public AddNote(){
        addButton = new Button(By.id("jikansoftware.com.blocdenotas:id/addnotebutton"));
    }

    public boolean isDisplayedNote(String note){
        this.searchNote = new Label(By.xpath("//*[contains(@resource-id,'text1') and contains(@text,'"+note+"')] "));
        return this.searchNote.isDisplayed();
    }
}
