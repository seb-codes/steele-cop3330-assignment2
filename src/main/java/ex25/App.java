/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Sebastian Steele
 */
package ex25;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App {
    public static boolean numOnly(String val){
        if(val.matches("[0-9]+"))
            return true;
        else
            return false;
    }

    public static boolean letOnly(String val){
        if(val.matches("[a-zA-Z]+"))
            return true;
        else
            return false;
    }

    public static boolean numletOnly(String val){
        val = val.toUpperCase();
        if(val.matches("^(?=.*[A-Z])(?=.*[0-9])[A-Z0-9]+$"))
            return true;
        else
            return false;
    }

    public static boolean specCheck(String val){
        Pattern p = Pattern.compile("[^a-zA-Z0-9 ]", Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher(val);
        boolean b = m.find();

        return b;
    }

    public static boolean lenCheck(String val){
        int len = val.length();
        if(len<8)
            return false;
        else
            return true;
    }

    public static boolean veryWeak(String val){
        boolean b_len = lenCheck(val);
        boolean b_num = numOnly(val);

        if(b_len==false && b_num==true)
            return true;
        else
            return false;
    }

    public static boolean Weak(String val){
        boolean b_len = lenCheck(val);
        boolean b_let = letOnly(val);

        if(b_len==false && b_let==true)
            return true;
        else
            return false;
    }

    public static boolean Strong(String val){
        boolean b_len = lenCheck(val);
        boolean b_numlet = numletOnly(val);

        if(b_numlet==true && b_len==true)
            return true;
        else
            return false;
    }

    public static boolean veryStrong(String val){
        boolean b_len = lenCheck(val);
        boolean b_spec = specCheck(val);

        if(b_spec==true && b_len==true)
            return true;
        else
            return false;
    }

    public static int passwordValidator(String val){
        if(veryWeak(val))
            return 1;
        if(Weak(val))
            return 2;
        if(Strong(val))
            return 3;
        if(veryStrong(val))
            return 4;

        return 0;
    }

    public static Map<Integer, String> mapBuilder(){
        Map<Integer, String> m = new HashMap<Integer, String>();
        m.put(0,"is an invalid password.");
        m.put(1,"is a very weak password.");
        m.put(2,"is a weak password.");
        m.put(3,"is a strong password.");
        m.put(4,"is a very strong password.");

        return m;
    }





    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter a password: ");
        String password = scan.nextLine();

        Map<Integer, String> m = mapBuilder();

        int result = passwordValidator(password);

        System.out.println(String.format("The password '%s' %s",password,m.get(result)));

    }}
