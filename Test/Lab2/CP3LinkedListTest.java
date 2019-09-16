package Lab2;

import Lab2.CP3LinkedList;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CP3LinkedListTest {

    CP3LinkedList<String> myList = new CP3LinkedList();

    @Test
    void getFirst()
    {

        myList.addFirst("orange");

        String actualGet = myList.getFirst();
        /**no pass
        String expectedGet = "helicopter"; */
        //pass
        String expectedGet = "orange";

        assertEquals(expectedGet, actualGet);

    }

    @Test
    void removeFirst()
    {


        myList.addFirst("orange");

        String actualRemove = myList.removeFirst();
        System.out.println(actualRemove);

        /**no pass
         * String expectedRemove = "apple"; */
        //pass
        String expectedRemove = "orange";

        assertEquals(expectedRemove, actualRemove);


    }

    @Test
    void isEmpty()
    {

        boolean actual = myList.isEmpty();
        boolean expected = true;
        //if the list is empty
        assertEquals(expected, actual);

        myList.addFirst("banana");
        myList.addFirst("apple");
        myList.addFirst("orange");

        actual = myList.isEmpty();
        expected = false;

        assertEquals(expected, actual);



    }

    @Test
    void size()
    {
        int actualSize = myList.size();
        int expectedSize = 0;

        assertEquals(expectedSize, actualSize);

        myList.addFirst("banana");
        myList.addFirst("apple");
        myList.addFirst("orange");

        actualSize = myList.size();
        expectedSize = 3;

        assertEquals(expectedSize, actualSize);
    }

}