package academy.learnprogramming;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int min = 0;
        int max = 0;
        //boolean firstLoop = true;
        System.out.println("Enter the number: ");
        boolean hasNextInt = scanner.hasNextInt();
        if(hasNextInt){
            int recentNumber = scanner.nextInt();
                min = recentNumber;
                max = recentNumber;
        } else {
            return;
        }
        scanner.nextLine();


        while(true){

            System.out.println("Enter the number:");
            hasNextInt = scanner.hasNextInt();

            if(hasNextInt){
                int recentNumber = scanner.nextInt();
                    if(recentNumber>max){
                        max = recentNumber;
                    } else if(recentNumber<min){
                        min = recentNumber;
                    }
            } else {
                break;
            }
           scanner.nextLine();
        }
        System.out.println("Minimum: " + min + " ,Maximum: " + max);
        scanner.close();
    }
}
