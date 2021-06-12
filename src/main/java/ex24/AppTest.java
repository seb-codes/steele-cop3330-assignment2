/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Sebastian Steele
 */

package ex24;

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
    @DisplayName("Are cameralistic and acclimatiser anagrams?")
    public void test_anagram_set1(){
        // simple check, no case differences
        App check = new App();
        boolean actual = App.isAnagram("cameralistic","acclimatiser");
        int expected = true;
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Are Elbow and below anagrams?")
    public void test_anagram_set2(){
        // different casing, still an anagram
        App check = new App();
        boolean actual = App.isAnagram("Elbow","below");
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Are Study and Car anagrams?")
    public void test_anagram_set3(){
        // Not an Anagram, different lengths
        App check = new App();
        boolean actual = App.isAnagram("Study","Car");
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Are Study and Thing anagrams?")
    public void test_anagram_set4(){
        // Not an Anagram, same lengths
        App check = new App();
        boolean actual = App.isAnagram("Study","Thing");
        int expected = 0;
        assertEquals(expected, actual);
    }


}