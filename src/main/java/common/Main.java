package common;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first name");
        String firstName = scan.nextLine();
        System.out.println("Enter your last name");
        String lastName = scan.nextLine();
        System.out.println("Enter country");
        String country = scan.nextLine();
        System.out.println("Enter City");
        String city = scan.nextLine();
        System.out.println("Enter your age");
        int age = scan.nextInt();
        System.out.print(firstName +"\t" + lastName +"\t" + country +"\t   " + city
                +"\t"+ age);





    }
}
