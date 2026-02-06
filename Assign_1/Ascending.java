import java.util.*;
public class Ascending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		char ch[] = s1.toCharArray();
		Arrays.sort(ch);
		System.out.println(ch);
	}

}
