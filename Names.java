/**
 * Class: CIST 2371 Java Programming I
 * Term: Fall 2022
 * Instructor: Chris Bishop
 * Description: Solution to Lab #2
 * Author: Ekene Ezeobi
 * By turning in this code, I Pledge:
 * 1. That I have completed the programming assignment independently.
 * 2. I have not copied the code from a student or any source.
 * 3. I have not given my code to any student. *
 */

import java.util.Scanner;

public class Names {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String firstName;
        String lastName;

        //prompt to enter firstName
        System.out.print("Enter firstName: ");
        firstName = input.nextLine();



        //prompt to enter lastName
        System.out.print("Enter lastName: ");
        lastName = input.nextLine();


        System.out.println("My name is " + firstName + " " + lastName + ".");

        input.close();
    }
}
