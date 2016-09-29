package Ravikumar.Sujatha.HoldingObjects;

import java.util.ArrayList;

/**
 * Created by sujatharavikumar on 9/28/16.
 */
public class PhoneBookApplication {

    private PhoneBook phoneBookObject = new PhoneBook();

    public void testPhoneBook(){
        //PhoneBook phoneBookObject = new PhoneBook();

        phoneBookObject.addContact("Sujatha", "3182784690");
        phoneBookObject.addAnotherPhoneNumberToExistingContact("Sujatha", "2346483758");
        phoneBookObject.addContact("Vinod", "3478583587");
        phoneBookObject.addAnotherPhoneNumberToExistingContact("Vinod", "3182782034");

        phoneBookObject.listEntriesFromMultiplePhoneNumbersMap();

        phoneBookObject.removeContact("Sujatha");
        System.out.println("Removed Contact Sujatha....");

        phoneBookObject.listEntriesFromMultiplePhoneNumbersMap();


        ArrayList<String> phoneNumbers = phoneBookObject.lookUp("Vinod");
        System.out.println("Looking up Vinod...");
        for (int i=0; i<phoneNumbers.size(); i++){
            System.out.println(phoneNumbers.get(i));
        }

        System.out.println("Adding Priya...");
        phoneBookObject.addContact("Priya", "3184809076");
        phoneBookObject.listEntriesFromMultiplePhoneNumbersMap();


        String name = phoneBookObject.reverseLookUp("3182782034");
        System.out.println("The name associated with the phone number 3182782034 is "+name);

    }


    public static void main(String[] args) {

        PhoneBookApplication application = new PhoneBookApplication();
        application.testPhoneBook();


    }

}
