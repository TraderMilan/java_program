package Practise;

import java.util.Scanner;

public class SucetPriemerOdUzivatela {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum = 0;
        int count = 0;

        while (true) {
            System.out.println("Zadaj cislo: ");
            String userInput = scanner.nextLine();
            if (userInput.equals("q")) {
                System.out.println("Koniec programu");
                break;
            }
            try {
                double number = Double.parseDouble(userInput);
                sum +=number;
                count++;

            } catch (Exception e) {
                System.out.println("Invalid input, try again ");
            }

        }
        double avg = sum/count;
        System.out.println("Sucet cisel je: " + sum + " a sucin cisel je: " + avg);


    }

}
