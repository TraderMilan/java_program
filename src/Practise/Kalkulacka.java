package Practise;

import java.util.Scanner;

public class Kalkulacka {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("zadaj prve a posledne cislo tvojho intervalu: ");
        int start = scanner.nextInt();
        int stop = scanner.nextInt();
        sumAvg(start,stop);


    }

    public static void sumAvg(int start, int stop){
        int sum = 0;
        double avg = 0;
        int pocet = stop - start + 1;
        for (int i = start; i <= stop; i++){
            sum += i;
        }
        avg = (double)sum/pocet;
        System.out.println("Sucet je: " + sum + " a priemer je: " + avg);
    }
}
