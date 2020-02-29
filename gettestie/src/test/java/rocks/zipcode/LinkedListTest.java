package rocks.zipcode;

import org.junit.Before;

import java.util.ArrayList;
import java.util.List;

public class LinkedListTest {

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
}
