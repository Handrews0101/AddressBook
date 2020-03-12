package AddressBook;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void should_throw_exception_when_first_name_is_null()
    {
        // checks to if the exception is thrown
        // this will only return an exception if its an IllegalArgumentException
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            Person noFirstName = new Person(null, "McGuire", null, null, null, null, null);
        });

        String expectedException = "First name cannot be empty";
        String actualException = exception.getMessage();

        // checks to see if the exception is the wright message
        assertTrue(actualException.contains(expectedException));
    }

    @Test
    void should_throw_exception_when_first_name_is_empty()
    {
        // checks to if the exception is thrown
        // this will only return an exception if its an IllegalArgumentException
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            Person noFirstName = new Person("", "McGuire", null, null, null, null, null);
        });

        String expectedException = "First name cannot be empty";
        String actualException = exception.getMessage();

        // checks to see if the exception is the wright message
        assertTrue(actualException.contains(expectedException));
    }

    @Test
    void should_throw_exception_when_last_name_is_null()
    {
        // checks to if the exception is thrown
        // this will only return an exception if its an IllegalArgumentException
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            Person noFirstName = new Person("Ryan", null, null, null, null, null, null);
        });

        String expectedException = "Last name cannot be empty";
        String actualException = exception.getMessage();

        // checks to see if the exception is the wright message
        assertTrue(actualException.contains(expectedException));
    }

    @Test
    void should_throw_exception_when_last_name_is_empty()
    {
        // checks to if the exception is thrown
        // this will only return an exception if its an IllegalArgumentException
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            Person noFirstName = new Person("Ryan", "", null, null, null, null, null);
        });

        String expectedException = "Last name cannot be empty";
        String actualException = exception.getMessage();

        // checks to see if the exception is the wright message
        assertTrue(actualException.contains(expectedException));
    }
}