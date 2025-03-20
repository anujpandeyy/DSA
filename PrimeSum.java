import java.util.*;

public class PrimeSum {
    public static void main(String[] args) {
        int sum = 0;
        int num;
        boolean isPrime = true;
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        for (int i = 2; i <= num; i++) {
            isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                sum += i;
            }
        }
        System.out.println("Sum of prime numbers: " + sum);
        sc.close();
    }
}