package Ravikumar.Sujatha.HoldingObjects;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.Set;
import java.util.ArrayList;

/**
 * Created by sujatharavikumar on 9/28/16.
 */
public class PhoneBook {

    public Map<String,ArrayList<String>> multiplePhoneNumbersMap = new TreeMap<String, ArrayList<String>>();


    public void addContact(String key, String value){

        ArrayList<String> listOfPhoneNumbers = new ArrayList<String>();
        listOfPhoneNumbers.add(value);
        multiplePhoneNumbersMap.put(key, listOfPhoneNumbers);

    }

    public void addAnotherPhoneNumberToExistingContact(String key, String phoneNumber){
        multiplePhoneNumbersMap.get(key).add(phoneNumber);
    }


    public void listEntriesFromMultiplePhoneNumbersMap(){
        Set set = multiplePhoneNumbersMap.entrySet();
        Iterator iterator = set.iterator();
        System.out.println("*************************");
        while(iterator.hasNext()){
            Map.Entry<String,ArrayList<String>> mapEntry = (Map.Entry)iterator.next();
            System.out.println("Name: " +mapEntry.getKey()+ "\nPhone: ");
            for (int i=0; i<mapEntry.getValue().size(); i++){
                System.out.println("\t"+mapEntry.getValue().get(i));
            }
        }
        System.out.println("**************************");

    }


    public void removeContact(String key){
        multiplePhoneNumbersMap.remove(key);
    }


    public ArrayList<String> lookUp(String key){
        return multiplePhoneNumbersMap.get(key);
    }

    public String reverseLookUp(String value){
        for (Map.Entry<String,ArrayList<String>> entry : multiplePhoneNumbersMap.entrySet()) {
            for (int i=0; i<entry.getValue().size(); i++){
                if(entry.getValue().get(i).equals(value))
                    return (String)entry.getKey();
            }

        }

        return null;
    }



}
