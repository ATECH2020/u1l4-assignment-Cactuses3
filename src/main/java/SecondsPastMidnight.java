//Name: Patrick McNulty
//Date: 9-6-20
//Assignment: SecondsPastMidnight

import java.util.Scanner;

class SecondsPastMidnight {
    public static void main(String[] args) {

        //Creates a new scanner for user input
        Scanner scanner = new Scanner(System.in);

        //Reads int from user
        int number = scanner.nextInt();

        //Your code goes here
        int minutes = number / 60;
        int hours = minutes / 60;
        System.out.print(hours + " " + minutes);

        // closing the scanner object
        scanner.close();
    }
}