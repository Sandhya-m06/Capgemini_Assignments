package String_assign;
import java.util.*;
public class Ques_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Account Number");
		String acc = sc.nextLine();
		String sub1 = acc.substring(0, acc.length()-4);
		String sub2 = acc.substring(acc.length()-4, acc.length());
		StringBuilder s2 = new StringBuilder(sub2);
		String sub3 = s2.reverse().toString();
		System.out.println("Masked Vlaue: "+sub1.concat(sub3));
	}

}
