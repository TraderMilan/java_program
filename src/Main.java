import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int number = 0;
        while (true) {
            try{
                number = scanner.nextInt();
                if (number > 0 && number <= 10){
                    break;
                } else {
                    System.out.println("Must be between 1 to 10");
                }

            } catch (Exception e) {
                System.out.println("Invalid input");
                scanner.nextLine();
            }

        }
        System.out.println("Your number is: " + number);
    }
}