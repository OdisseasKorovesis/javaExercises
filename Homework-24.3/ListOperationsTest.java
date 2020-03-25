package testingtutorial;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

public class ListOperationsTest {

    private ListOperations listOperations;

    public ListOperationsTest() {
    }

    @Before
    public void setUp() {
        listOperations = new ListOperations();
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testAddNameToListCheckSize() {
        String toBeAdded = "Andy";
        boolean changed = listOperations.addNameToList(toBeAdded);
        assertTrue(changed);
    }

    @Test
    public void testAddNameToListCheckName() {
        String toBeAdded = "Andy";
        listOperations.addNameToList(toBeAdded);
        String real = listOperations.getNames().get(listOperations.getSizeOfList() - 1);
        assertEquals(real, toBeAdded);
    }

    @Test
    public void testAddNameToListManyNames() {
        listOperations.addNameToList("Mary");
        listOperations.addNameToList("Andy");
        listOperations.addNameToList("Peter");
        int sizeOfList = listOperations.getSizeOfList();
        assertEquals(3, sizeOfList);
    }

    @Test
    public void testAddNameToListNull() {
        listOperations.addNameToList(null);
        int sizeOfList = listOperations.getSizeOfList();
        assertEquals(0, sizeOfList);
    }

    @Test
    public void testRemoveNameFromListCheckSize() {
        listOperations.addNameToList("George");
        boolean changed = listOperations.removeNameFromList("George");
        assertTrue(changed);
    }

    @Test
    public void testRemoveNameFromListCheckName() {
        listOperations.addNameToList("Mary");
        listOperations.addNameToList("Andy");
        listOperations.addNameToList("Peter");
        boolean exists = listOperations.removeNameFromList("Andy");
        assertTrue(exists);
    }

    @Test
    public void testRemoveNameFromListRemoveMultiple() {
        listOperations.addNameToList("Mary");
        listOperations.addNameToList("Andy");
        listOperations.addNameToList("Peter");
        boolean exists = listOperations.removeNameFromList("Andy")
                && listOperations.removeNameFromList("Mary")
                && listOperations.removeNameFromList("Peter");
        assertTrue(exists);
    }

    @Test
    public void testRemoveNameFromListNullList() {
        boolean check = listOperations.removeNameFromList("George");
        assertFalse(check);

    }

    @Test
    public void testGetSizeOfList() {
        int additions = 1000;
        int counter = 0;
        while (counter < additions) {
            listOperations.addNameToList("George");
            counter++;
        }
        int sizeOfList = listOperations.getSizeOfList();
        assertEquals(additions, sizeOfList);

    }

    @Test
    public void testGetSizeOfListNullList() {
    int sizeOfList = listOperations.getSizeOfList();
    assertEquals(-1, sizeOfList);
    }

}
