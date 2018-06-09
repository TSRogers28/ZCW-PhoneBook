import java.util.TreeMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.List;
import java.util.Arrays;

/**
 * Created by leon on 1/23/18.
 */
public class PhoneBook {
    private String name;
    private String number;
    Map<String,List<String>> phoneBook =new TreeMap<String, List<String>>();
    List<String> numberSet = new ArrayList<String>();

    public PhoneBook(){

    }
    public void addToPhoneBook(String name, String number){
        ArrayList <String> temp = new ArrayList<>();
        temp.add(number);
        phoneBook.put(name, temp);

    }
    
    public void addToPhoneBookIndividualNumbers(String name, String number){
        numberSet.add(number);
        phoneBook.put(name, numberSet);

    }

    public void removeFromPhoneBook(String name){

        phoneBook.remove(name);

    }

    public void removeFromPhoneBookIndividualNumbers(String name, String number){
        phoneBook.get(name).remove(number);

    }

    public String lookupFromPhoneBook(String name){
        numberSet = phoneBook.get(name);
        return numberSet.toString();
    }

    public String reverseLookupFromPhoneBook(String number){
        String answerKey = null;
        for(String key: phoneBook.keySet()){
            List<String> test = phoneBook.get(key);
            for(String s: test){
                if(number.equals(s)){
                    return key;
                }

            }
        }
        return "nothing is here";
    }

    public String displayFromPhoneBook(){

        return phoneBook.entrySet().toString();

    }

}
