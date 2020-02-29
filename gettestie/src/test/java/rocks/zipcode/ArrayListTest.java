package rocks.zipcode;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class ArrayListTest {

    List<Person> people;
    Person person1;
    Person person2;
    Person person3;

    @Before
    public void init(){
        people = new ArrayList<>();
        person1 = new Person("Jake", 1991);
        person2 = new Person("Amy", 2001);
        person3 = new Person("Bob", 2011);
    }

    @Test
    public void addAndSizeTest(){
        people.add(person1);
        people.add(person2);
        people.add(person3);
        int expectedSize = 3;

        assertEquals(expectedSize, people.size());
    }

    @Test
    public void removeAndIsEmptyTest(){
        people.add(person3);
        people.add(person2);
        int  expectedSize = 0;

        people.remove(person2);
        people.remove(0);

        assertEquals(expectedSize, people.size());
        assertEquals(true, people.isEmpty());
    }

    @Test
    public void getAndIndexOfTest(){
        people.add(person2);
        people.add(person1);

        Person actual = people.get(people.indexOf(person1));

        assertEquals(person1, actual);
    }
}
