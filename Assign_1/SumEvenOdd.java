import java.util.*;

public class SumEvenOdd {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Number of Integers");
        int n = sc.nextInt();   // number of integers
        int even = 0;
        int odd = 0;
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();

            if (num % 2 == 0) {
                even = even + num;
            } else {
                odd = odd + num;
            }
        }

        System.out.println("Even Sum = " + even);
        System.out.println("Odd Sum = " + odd);
    }
}
