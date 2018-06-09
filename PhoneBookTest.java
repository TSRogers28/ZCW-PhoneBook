import java.util.TreeMap;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class PhoneBookTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class PhoneBookTest
{
    
    PhoneBook phoneBook =new PhoneBook();
    private String name;
    private String number;
    @Test
    public void testAddToPhoneBook1(){

    phoneBook.addToPhoneBook("Zebra", "111-222-333");;
    
    String expectedString = "[Zebra=[111-222-333]]";
    String actualString = phoneBook.displayFromPhoneBook();
    
    assertEquals(expectedString, actualString);
    }
    
    @Test
    public void testAddToPhoneBookIndividualNumbers(){

    phoneBook.addToPhoneBookIndividualNumbers("Zebra", "111-222-333");
    phoneBook.addToPhoneBookIndividualNumbers("Zebra", "222-444-4444");
    
    String expectedString = "[Zebra=[111-222-333, 222-444-4444]]";
    String actualString = phoneBook.displayFromPhoneBook();
    
    assertEquals(expectedString, actualString);
    
    
    }
    
    @Test
    public void testRemoveFromPhoneBook1(){
            PhoneBook phoneBook3 =new PhoneBook();
    phoneBook3.addToPhoneBook("Zebra", "111-222-3333");
    phoneBook3.addToPhoneBook("Dog", "222-444-4444");
    phoneBook3.addToPhoneBook("Cat", "555-666-7777");
    phoneBook3.addToPhoneBook("Alligator", "888-999-1010");
    phoneBook3.addToPhoneBook("Wolf", "111-121-1313");
    phoneBook3.removeFromPhoneBook("Dog");

    String expectedString = "[Alligator=[888-999-1010], Cat=[555-666-7777], Wolf=[111-121-1313], Zebra=[111-222-3333]]";
    
    String actualString = phoneBook3.displayFromPhoneBook();
    
    assertEquals(expectedString, actualString);
    
    
    }
    
    @Test
    public void  testRemoveFromPhoneBookIndividualNumbers(){
    phoneBook.addToPhoneBook("Zebra", "111-222-3333");
    phoneBook.addToPhoneBookIndividualNumbers("Zebra", "222-444-4444");
    phoneBook.removeFromPhoneBookIndividualNumbers("Zebra", "111-222-3333");
    
    String expectedString = "[Zebra=[222-444-4444]]";
    String actualString = phoneBook.displayFromPhoneBook();
    assertEquals(expectedString, actualString);
    }
    
    @Test
    public void testLookupFromPhoneBook(){
                    PhoneBook phoneBook4 =new PhoneBook();
    phoneBook4.addToPhoneBook("Zebra", "111-222-3333");
    phoneBook4.addToPhoneBook("Dog", "222-444-4444");
    phoneBook4.addToPhoneBook("Cat", "555-666-7777");
    phoneBook4.addToPhoneBook("Alligator", "888-999-1010");
    phoneBook4.addToPhoneBook("Wolf", "111-121-1313");
    
    String expectedString = "[555-666-7777]";
    
    
    String actualString = phoneBook4.lookupFromPhoneBook("Cat");
    
    assertEquals(expectedString, actualString);
    
    
    }
    
    @Test
    public void testReverseLookup(){
    phoneBook.addToPhoneBook("Zebra", "111-222-3333");
    phoneBook.addToPhoneBook("Dog", "222-444-4444");
    phoneBook.addToPhoneBook("Cat", "555-666-7777");
    phoneBook.addToPhoneBook("Alligator", "888-999-1010");
    phoneBook.addToPhoneBook("Wolf", "111-121-1313");
    String expectedString = "Wolf";
    
    
    String actualString = phoneBook.reverseLookupFromPhoneBook("111-121-1313");
    
    assertEquals(expectedString, actualString);
    
    
    }
}
