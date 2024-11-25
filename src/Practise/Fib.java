package Practise;

// Vypísať fib od 1 do 1000
public class Fib {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int sum = 0;

        while (b < 1000){
            sum = a + b;
            System.out.println(sum);
            a = b;
            b = sum;

        }
    }


}
