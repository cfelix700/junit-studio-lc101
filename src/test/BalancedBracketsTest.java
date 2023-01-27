package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void testHasBalancedBracketsBalancedWithOtherChars(){
        String input = "[Hello] World";
        boolean expectedOutput = true;
        assertEquals(expectedOutput, BalancedBrackets.hasBalancedBrackets((input)));
    }
    @Test
    public void testHasBalancedBracketsEmptyString(){
        String input = "";
        boolean expectedOutput = true;
        assertEquals(expectedOutput, BalancedBrackets.hasBalancedBrackets(input));
    }
    @Test
    public void balancedBracketsMismatchedBrackets(){
        String input = "[{]}";
        boolean expectedOutput = false;
        assertEquals(expectedOutput, BalancedBrackets.hasBalancedBrackets(input));
    }

    @Test
    public void hasBalancedNestedBrackets(){
        String input = "[[{()}]]";
        boolean expectedOutput = true;
        assertEquals(expectedOutput, BalancedBrackets.hasBalancedBrackets(input));
    }

    @Test
    public void hasUnbalancedNestedBrackets(){
        String input = "[[{(}]]";
        boolean expectedOutput = false;
        assertEquals(expectedOutput, BalancedBrackets.hasBalancedBrackets(input));
    }
    @Test
    public void singleBracketsBeforeOtherCharacter(){
        String spec = "a single set of balanced brackets before other characters return true";
        String input = "[]LaunchCode";
        boolean result = BalancedBrackets.hasBalancedBrackets(input);
    }


}
