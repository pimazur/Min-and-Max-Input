package academy.learnprogramming;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int min;
        int max;
       
        System.out.println("Enter the number: ");
        if(scanner.hasNextInt()){
            int recentNumber = scanner.nextInt();
            min = recentNumber;
            max = recentNumber;
        } else {
            return;
        }
        scanner.nextLine();

        System.out.println("Enter the number:");

        while(scanner.hasNextInt()){
            int recentNumber = scanner.nextInt();

            if(recentNumber>max){
                max = recentNumber;
            } else if(recentNumber<min){
                min = recentNumber;
            }

            scanner.nextLine();
            System.out.println("Enter the number:");
        }
        scanner.close();
        System.out.println("Minimum: " + min + " ,Maximum: " + max);
    }
}
