package test.java.com.addressbook.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ContactTest {

    @Test
    public void returnContactDetailsTest(){
        // ARRANGE
        Contact tempContact = new Contact("Max Hutchings", 077123453, "maxraxlax@gmail.com");

        // ACT
        String contactDetails = tempContact.getContactDetails();

        // ASSERT
        assertEquals("Max Hutchings, 077123453, maxraxlax@gmail.com", contactDetails);
    }
}
