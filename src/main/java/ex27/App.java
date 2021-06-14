/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Sebastian Steele
 */
package ex27;


import java.util.Scanner;

public class App {
    public static boolean fnameValidate(String name){
        int len = name.length();

        if(name.isBlank())
            System.out.println("The first name must be filled in.");

        if(len < 2) {
            System.out.println("The first name must be at least 2 characters long.");
            return false;
        }

        if(name.matches("[a-zA-Z]+"))
            return true;
        else {
            System.out.println("The first name must be letters only.");
            return false;
        }
    }
    public static boolean lnameValidate(String name){
        int len = name.length();

        if(name.isBlank())
            System.out.println("The last name must be filled in.");

        if(len < 2) {
            System.out.println("The last name must be at least 2 characters long.");
            return false;
        }

        if(name.matches("[a-zA-Z]+"))
            return true;
        else {
            System.out.println("The last name must be letters only.");
            return false;
        }
    }

    public static boolean zipValidate(String zip){
        int len = zip.length();

        if(len != 5){
            System.out.println("The zipcode must be a 5 digit number.");
            return false;
        }

        if(zip.matches("[0-9]+"))
            return true;
        else {
            System.out.println("The zipcode must only contain numbers");
            return false;
        }
    }

    public static boolean empidValidate(String emp_id){
        // The employee ID must be in the format of AA-1234.
        if(emp_id.matches("\\p{IsAlphabetic}{2}-\\d{4}"))
            return true;

        else {
            System.out.println("The employee ID must be in the format of AA-1234.");
            return false;
        }

    }


    public static boolean validateInput(String f_name, String l_name, String zipcode, String emp_id){

        boolean f_name_valid = fnameValidate(f_name);
        boolean l_name_valid = lnameValidate(l_name);
        boolean zip_valid = zipValidate(zipcode);
        boolean emp_id_valid = empidValidate(emp_id);

        if(f_name_valid==true && l_name_valid==true && zip_valid==true && emp_id_valid==true) {
            System.out.println("There were no errors found.");
            return true;
        }
        else
            return false;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the first name: ");
        String f_name = scan.nextLine();
        System.out.print("Enter the last name: ");
        String l_name = scan.nextLine();
        System.out.print("Enter the ZIP code: ");
        String zipcode = scan.nextLine();
        System.out.print("Enter the employee ID: ");
        String emp_id = scan.nextLine();

        boolean result = validateInput(f_name, l_name, zipcode, emp_id);


    }

}


