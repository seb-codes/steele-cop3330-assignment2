/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Sebastian Steele
 */
package ex24;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class App {
    public static String stringSort(String input){
        // sort the string
        char[] strHolder = input.toCharArray();

        Arrays.sort(strHolder);

        return new String(strHolder);
    }
    public static int AnagramCheck(String str_one, String str_two){
        // 0 is false(not Anagram)
        int one_length= str_one.length();
        int two_length= str_two.length();

        if(one_length!=two_length)
            return 0;

        // make sure this is not case sensitive.
        String sorted_strone = stringSort(str_one.toLowerCase());
        String sorted_strtwo = stringSort(str_two.toLowerCase());

        if(sorted_strone.equals(sorted_strtwo))
            return 1;
        else
            return 0;
    }



    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two strings and I'll tell you if they are anagrams:");
        System.out.print("Enter the first string:");
        String str_one = scan.nextLine();
        System.out.print("Enter the second string:");
        String str_two = scan.nextLine();

        int res = AnagramCheck(str_one, str_two);

        if(res==1)
            System.out.println(String.format("%s and %s are anagrams",str_one,str_two));
        else
            System.out.println(String.format("%s and %s are NOT anagrams",str_one,str_two));
    }
}
