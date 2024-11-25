package Practise;

import java.util.Scanner;

public class iceCream {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);



        while (true) {
            System.out.println("zadaj pocet kopcekov: ");
            int pocet = scanner.nextInt();
            double pricePar = 0;
            double priceNepar = 0;
            for (int i = 1; i <= pocet; i++) {
                if (pocet % 2 == 0) {
                    pricePar += 1.5;
                } else if (pocet % 2 == 1) {
                    priceNepar += 1.25;
                }
            }

            if (pocet % 2 == 0) {
                System.out.println(pricePar);
            } else {
                System.out.println(priceNepar);
            }
        }
    }
}
