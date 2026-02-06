package String_assign;
import java.util.*;
public class Ques_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		StringBuilder str1 = new StringBuilder(str);
		
		if(str.equals(str1.reverse().toString())) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not Palindrome");
		}
	}

}
