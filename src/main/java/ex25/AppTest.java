

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Sebastian Steele
 */

package ex25;

import ex24.App;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit test for simple App.
 */
public class AppTest
{
    /**
     * Rigorous Test :-)
     */
    @Test
    @DisplayName("invaled test '%^$#'")
    public void test__set0(){
        // simple check, no case differences
        ex25.App check = new ex25.App();
        int actual = check.passwordValidator("%^$#");
        int expected = 0;
        assertEquals(expected, actual);
    }
    @Test
    @DisplayName("very weak test '12345'")
    public void test__set1(){
        // simple check, no case differences
        ex25.App check = new ex25.App();
        int actual = check.passwordValidator("12345");
        int expected = 1;
        assertEquals(expected, actual);
    }
    @Test
    @DisplayName("weak test 'abcd'")
    public void test__set2(){
        // simple check, no case differences
        ex25.App check = new ex25.App();
        int actual = check.passwordValidator("abcd");
        int expected = 2;
        assertEquals(expected, actual);
    }
    @Test
    @DisplayName("strong test 'abcd123xyz'")
    public void test__set3(){
        // simple check, no case differences
        ex25.App check = new ex25.App();
        int actual = check.passwordValidator("abcd123xyz");
        int expected = 3;
        assertEquals(expected, actual);
    }
    @Test
    @DisplayName("very strong test '1337h@xor!'")
    public void test__set4(){
        // simple check, no case differences
        ex25.App check = new ex25.App();
        int actual = check.passwordValidator("1337h@xor!");
        int expected = 4;
        assertEquals(expected, actual);
    }


}