
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
