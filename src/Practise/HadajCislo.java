package Practise;

import java.util.Scanner;

public class HadajCislo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 7;

        int guess = 0;
        while (true){
            if (guess == n){
            System.out.println("Koniec programu, uhadol si!");
            break;
        } else {
                System.out.println("Uhadni cislo od 1 do 10:");
                try {
                    guess = scanner.nextInt();
                } catch (Exception e) {
                    System.out.println("Invalid input, try again ");
                    scanner.nextLine();
                    System.out.println("lokaf");
                }
            }
        }


    }
}
