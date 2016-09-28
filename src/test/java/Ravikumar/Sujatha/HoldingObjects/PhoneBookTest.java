package Ravikumar.Sujatha.HoldingObjects;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by sujatharavikumar on 9/28/16.
 */
public class PhoneBookTest {

    @Test
    public void addEntryTest(){
        PhoneBook phoneBookObject = new PhoneBook();
        phoneBookObject.addEntry("Sujatha", "3182784690");
        String actualOutput = phoneBookObject.phoneMap.get("Sujatha");
        String expectedOutput = "3182784690";
        Assert.assertTrue(actualOutput.equals(expectedOutput));
    }

    @Test
    public void removeEntryTest(){
        PhoneBook phoneBookObject = new PhoneBook();
        phoneBookObject.addEntry("Sujatha", "3182784690");
        phoneBookObject.removeEntry("Sujatha");
        String actualOutput = phoneBookObject.phoneMap.get("Sujatha");
        String expectedOutput = null;
        Assert.assertTrue(actualOutput == expectedOutput);
    }


    @Test
    public void lookUpTest(){
        PhoneBook phoneBookObject = new PhoneBook();
        phoneBookObject.addEntry("Sujatha", "3182784690");
        phoneBookObject.addEntry("Vinod", "3182782034");
        String actualOutput = phoneBookObject.lookUp("Vinod");
        String expectedOutput = "3182782034";
        Assert.assertTrue(actualOutput.equals(expectedOutput));
    }


    public void reverseLookUpTest(){
        PhoneBook phoneBookObject = new PhoneBook();
        phoneBookObject.addEntry("Sujatha", "3182784690");
        phoneBookObject.addEntry("Vinod", "3182782034");
        String actualOutput = phoneBookObject.reverseLookUp("3182784690");
        String expectedOutput = "Sujatha";
        Assert.assertTrue(actualOutput.equals(expectedOutput));

    }



}
