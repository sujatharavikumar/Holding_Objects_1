package Ravikumar.Sujatha.HoldingObjects;

import java.math.BigInteger;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.Set;

/**
 * Created by sujatharavikumar on 9/28/16.
 */
public class PhoneBook {

    public Map<String, String> phoneMap = new TreeMap<String, String>();

    public String lookUp(String key){
        return phoneMap.get(key);
    }

    public void addEntry(String key, String value){
        phoneMap.put(key,value);
    }

    public void removeEntry(String key){
        phoneMap.remove(key);
    }

    public void listPhoneBookEntries(){
        Set set = phoneMap.entrySet();
        Iterator iterator = set.iterator();
        while(iterator.hasNext()){
            Map.Entry mapEntry = (Map.Entry)iterator.next();
            System.out.print("Name: " +mapEntry.getKey()+ "\tPhone Number: ");
            System.out.println(mapEntry.getValue());
        }
        System.out.println("*************************************");

    }


    public String reverseLookUp(String value){
        for (Map.Entry entry : phoneMap.entrySet()) {
            if (entry.getValue().equals(value)) {
                return (String)entry.getKey();
            }
        }

        return null;
    }


}
