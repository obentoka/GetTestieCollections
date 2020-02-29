package rocks.zipcode;

import org.junit.Test;

import static org.junit.Assert.*;
import java.util.Stack;

public class TestStack {

    Stack<String> stack;

    @org.junit.Before
    public void setUp() throws Exception {
        stack = new Stack<>();
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void TestStackPush() {

        stack.push("Hello world");

        assertEquals(false, stack.isEmpty()); // false
    }

    @Test
    public void testStackPop(){

        stack.push("test");
        stack.pop();

        assertEquals(true, stack.isEmpty());
    }

    @Test
    public void testStackIsEmpty(){
        assertEquals(true, stack.isEmpty());
    }

    @Test
    public void testStackPeek(){

        stack.push("test");

        assertEquals("test", stack.peek());
        assertEquals(false, stack.isEmpty());
    }
}
