package Ravikumar.Sujatha.HoldingObjects;

/**
 * Created by sujatharavikumar on 9/28/16.
 */
public class PhoneBookApplication {

    public static void main(String[] args) {

        PhoneBook phoneBookObject = new PhoneBook();
        phoneBookObject.addEntry("Sujatha", "3182784690");
        phoneBookObject.addEntry("Vinod", "3182782034");
        phoneBookObject.addEntry("Priya", "3184809076");
        phoneBookObject.listPhoneBookEntries();
        System.out.println("Removing entry Priya......");
        phoneBookObject.removeEntry("Priya");
        phoneBookObject.listPhoneBookEntries();
        String phoneNumber = phoneBookObject.lookUp("Vinod");
        System.out.println("Vinod's phone number is: "+phoneNumber);
        String name = phoneBookObject.reverseLookUp("3182784690");
        System.out.println("The name associated with the phone number 3182784690 is "+name);

    }

}
