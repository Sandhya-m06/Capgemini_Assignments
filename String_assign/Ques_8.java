package String_assign;
import java.util.*;
public class Ques_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		
		StringTokenizer s2 = new StringTokenizer(s1,",");
		while(s2.hasMoreTokens()) {
			String token = s2.nextToken();
			System.out.println("Processed Token: "+token);
		}
	}

}
