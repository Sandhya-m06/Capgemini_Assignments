import java.util.*;

public class RemChar {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

        String s3 = s1.toLowerCase();
        String s4 = s2.toLowerCase();

        for (int i = 0; i < s3.length(); i++) {

            if (s4.indexOf(s3.charAt(i)) == -1) {
                System.out.print(s3.charAt(i));
            }
        }
    }
}
