package AddressBook;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddressBookTest {

    Person p1 = new Person("James", "Hood", "1234 springfield", "Fort Myers",
            "FL", "12345","1234567890");
    Person p2 = new Person("Homer", "Simpson", "1234 springfield", "Fort Myers",
            "FL", "12345","1234567890");
    Person p3 = new Person("Frank", "Simpson", "1234 springfield", "Fort Myers",
            "FL", "12345","1234567890");
    AddressBook addressBook = new AddressBook();
    Person[]  personAr1 = new Person[] {p1};
    Person[]  personAr2 = new Person[] {p1, p2};
    Person[] personAr3 = new Person[] {p1,p2,p3};

    @Test
    void getPersons() {
        addressBook.add(p1);
        addressBook.add(p2);
        assertArrayEquals(personAr2,addressBook.getPersons());
        assertNotEquals(personAr3, addressBook.getPersons());

    }

    @Test
    void add() {
        addressBook.add(p1);
        addressBook.add(p2);
        assertEquals(p1 , addressBook.get(0));
        assertEquals(p2, addressBook.get(1));
        assertNotEquals(p1, addressBook.get(1));
        assertNotEquals(p2,addressBook.get(0));
    }

    @Test
    void set() {
        addressBook.add(p1);
        addressBook.add(p2);
        addressBook.set(1,p1);
        addressBook.set(0,p2);
        assertEquals(p1, addressBook.get(1));
        assertEquals(p2, addressBook.get(0));
        assertNotEquals(p2, addressBook.get(1));
        assertNotEquals(p1, addressBook.get(0));

    }

    @Test
    void remove() {
        addressBook.add(p1);
        addressBook.add(p2);
        addressBook.add(p3);
        addressBook.remove(2);
        // Test 2 element Array
        assertArrayEquals(personAr2,addressBook.getPersons());
        //Test 1 element Array
        addressBook.remove(1);
        assertArrayEquals(personAr1, addressBook.getPersons());
    }

    @Test
    void get() {
    }

    @Test
    void clear() {
    }
}