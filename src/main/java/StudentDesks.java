//Name: Patrick McNulty
//Date: 9-6-20
//Assignment: StudentDesks

import java.util.Scanner;

class StudentDesks {
    public static void main(String[] args) {

        //Creates a new scanner for user input
        Scanner scanner = new Scanner(System.in);

        //Reads ints from user
        int classA = scanner.nextInt();
        int classB = scanner.nextInt();
        int classC = scanner.nextInt();

        /*
         *  your code goes here
         */
        int deskTotal = 0;
        
        if(classA % 2 == 1)
        {
          deskTotal = deskTotal + 1;
          classA = classA - 1;
        }

        if(classB % 2 == 1)
        {
          deskTotal = deskTotal + 1;
          classB = classB - 1;
        }

        if(classC % 2 == 1)
        {
          deskTotal = deskTotal + 1;
          classC = classC - 1;
        }

        deskTotal += (classA/2) + (classB/2) + (classC/2);

        System.out.print(deskTotal);

        // closing the scanner object
        scanner.close();
    }
}