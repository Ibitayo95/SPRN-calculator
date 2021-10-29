import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestingClass {
private final PrintStream standardOut = System.out;
private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

@Before

public void setUp() {
    System.setOut(new PrintStream(outputStreamCaptor));
}


@Test

public void test1(){
    //set up
    SRPN testCalc = new SRPN();
    
    testCalc.processCommand("11");
    testCalc.processCommand("3");
    testCalc.processCommand("-");
    testCalc.processCommand("=");

    //expected value
    String expectedValue = "8";

    //assertEquals to get actual value
    assertEquals(expectedValue, outputStreamCaptor.toString().trim());
}

@Test

public void test2(){
    //set up
    SRPN testCalc = new SRPN();
    
    testCalc.processCommand("10");
    testCalc.processCommand("2");
    testCalc.processCommand("+");
    testCalc.processCommand("=");

    //expected value
    String expectedValue = "12";

    //assertEquals to get actual value
    assertEquals(expectedValue, outputStreamCaptor.toString().trim());
}

@Test
public void test3(){
    //set up
    SRPN testCalc = new SRPN();
    
    testCalc.processCommand("9");
    testCalc.processCommand("4");
    testCalc.processCommand("*");
    testCalc.processCommand("=");

    //expected value
    String expectedValue = "36";

    //assertEquals to get actual value
    assertEquals(expectedValue, outputStreamCaptor.toString().trim());
}
@Test
public void test4(){
    //set up
    SRPN testCalc = new SRPN();
    
    testCalc.processCommand("11");
    testCalc.processCommand("3");
    testCalc.processCommand("/");
    testCalc.processCommand("=");

    //expected value
    String expectedValue = "3";

    //assertEquals to get actual value
    assertEquals(expectedValue, outputStreamCaptor.toString().trim());
}
@Test
public void test5(){
    //set up
    SRPN testCalc = new SRPN();
    
    testCalc.processCommand("11");
    testCalc.processCommand("3");
    testCalc.processCommand("%");
    testCalc.processCommand("=");

    //expected value
    String expectedValue = "2";

    //assertEquals to get actual value
    assertEquals(expectedValue, outputStreamCaptor.toString().trim());
}
@Test
public void test6(){
    //set up
    SRPN testCalc = new SRPN();
    
    testCalc.processCommand("1");
    testCalc.processCommand("+");
    
    
    //expected value
    String expectedValue = "Stack underflow.";

    //assertEquals to get actual value
    assertEquals(expectedValue, outputStreamCaptor.toString().trim());
}

@After
public void tearDown() {
    System.setOut(standardOut);
}

}
