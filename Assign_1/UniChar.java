import java.util.*;

public class UniChar {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");

        String str = sc.nextLine();
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            int freq = 0;

            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    freq++;
                }
            }

            if (freq == 1) {
                count++;
            }
        }

        System.out.println("Number of unique characters: " + count);
    }
}
