package common;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        Competitor first = new Competitor();
        first.outPutName(input);
    }
}
