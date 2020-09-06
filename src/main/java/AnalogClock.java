//Name: Patrick McNulty
//Date: 9-6-20
//Assignment: AnalogClock

import java.util.Scanner;

class AnalogClock {
    public static void main(String[] args) {

        //Creates a new scanner for user input
        Scanner scanner = new Scanner(System.in);

        //Reads ints from user
        double inputAngle = scanner.nextDouble();

        /*
         *  your code goes here
         */
        double minutes = (inputAngle * 2) % 60;
        
        int minuteAngle = (int) minutes * 6;

        System.out.print(minuteAngle);

        // closing the scanner object
        scanner.close();
    }
}