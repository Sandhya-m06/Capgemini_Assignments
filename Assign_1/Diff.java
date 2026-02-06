import java.util.*;
public class Diff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String 1");
		String s1 = sc.nextLine();
		System.out.println("Enter String 2");
		String s2 = sc.nextLine();
		String s3 = s1;
		
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
	}

}
