package Ravikumar.Sujatha.HoldingObjects;

import org.junit.Assert;
import org.junit.Test;
import java.util.ArrayList;

/**
 * Created by sujatharavikumar on 9/28/16.
 */
public class PhoneBookTest {

    @Test
    public void addContactTest(){
        PhoneBook phoneBookObject = new PhoneBook();
        phoneBookObject.addContact("Sujatha", "3182784690");
        ArrayList<String> list = phoneBookObject.multiplePhoneNumbersMap.get("Sujatha");
        String actualOutput = list.get(0);
        String expectedOutput = "3182784690";
        Assert.assertTrue(actualOutput.equals(expectedOutput));
    }


    @Test
    public void addAnotherPhoneNumberToExistingContactTest(){
        PhoneBook phoneBookObject = new PhoneBook();
        phoneBookObject.addContact("Sujatha", "3182784690");
        phoneBookObject.addAnotherPhoneNumberToExistingContact("Sujatha", "4648346375");
        ArrayList<String> list = phoneBookObject.multiplePhoneNumbersMap.get("Sujatha");
        String actualOutput1 = list.get(0);
        String expectedOutput1 = "3182784690";
        String actualOutput2 = list.get(1);
        String expectedOutput2 = "4648346375";
        Assert.assertTrue(actualOutput1.equals(expectedOutput1));
        Assert.assertTrue(actualOutput2.equals(expectedOutput2));

    }


    @Test
    public void removeContactTest(){
        PhoneBook phoneBookObject = new PhoneBook();
        phoneBookObject.addContact("Sujatha", "3182784690");
        phoneBookObject.addAnotherPhoneNumberToExistingContact("Sujatha", "4648346375");
        phoneBookObject.addContact("Vinod", "3182782034");
        phoneBookObject.removeContact("Sujatha");
        ArrayList<String> list = phoneBookObject.multiplePhoneNumbersMap.get("Sujatha");
        Assert.assertTrue(list==null);

    }


    @Test
    public void lookUpTest(){
        PhoneBook phoneBookObject = new PhoneBook();
        phoneBookObject.addContact("Sujatha", "3182784690");
        phoneBookObject.addAnotherPhoneNumberToExistingContact("Sujatha", "4648346375");
        ArrayList<String> list = phoneBookObject.lookUp("Sujatha");
        String actualOutput1 = list.get(0);
        String expectedOutput1 = "3182784690";
        String actualOutput2 = list.get(1);
        String expectedOutput2 = "4648346375";
        Assert.assertTrue(actualOutput1.equals(expectedOutput1));
        Assert.assertTrue(actualOutput2.equals(expectedOutput2));

    }


    @Test
    public void reverseLookupTest(){
        PhoneBook phoneBookObject = new PhoneBook();
        phoneBookObject.addContact("Sujatha", "3182784690");
        phoneBookObject.addAnotherPhoneNumberToExistingContact("Sujatha", "4648346375");
        phoneBookObject.addContact("Vinod", "3182782034");
        String actualOutput = phoneBookObject.reverseLookUp("3182782034");
        String expectedOutput = "Vinod";
        Assert.assertEquals("ReverseLookup should return Vinod", expectedOutput, actualOutput);

    }


}
