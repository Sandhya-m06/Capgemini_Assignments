import java.util.*;

public class PermuStr {

    static void permute(String s1, String ans) {
        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);
            String s2 = s1.substring(0, i);
            String s3 = s1.substring(i + 1);
            String res = s2 + s3;
            permute(res, ans + ch);   // 🔥 missing step
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        permute(s1, "");
    }
}
