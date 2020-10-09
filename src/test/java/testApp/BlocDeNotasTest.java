package testApp;

import activity.AddNote;
import activity.SaveNote;
import org.junit.Assert;
import org.junit.Test;

import java.net.MalformedURLException;

public class BlocDeNotasTest {

    AddNote addNote = new AddNote();
    SaveNote saveNote = new SaveNote();

    @Test
    public void verifyCreateNote() throws MalformedURLException {
        String note = "nota X";

        addNote.addButton.click();
        saveNote.titleText.type(note);
        saveNote.bodyText.type("cuerpo de la nota X");
        saveNote.saveButton.click();

        // Verification
        Assert.assertTrue("ERROR, la nota no fue creado!!! ", addNote.isDisplayedNote(note));
    }


    @Test
    public void verifyCreateNotes() throws MalformedURLException {

        for (int i=1; i <= 5; i++){
            addNote.addButton.click();
            saveNote.titleText.type("nota "+i);
            saveNote.bodyText.type("cuerpo de la nota "+i);
            saveNote.saveButton.click();
        }

        // Verification
        Assert.assertTrue("ERROR, la nota no fue creado!!! ", addNote.isDisplayedNote("nota 5"));


    }
}