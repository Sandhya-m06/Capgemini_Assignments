import java.util.*;
public class StringLen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String str = sc.nextLine();
		int count=0;
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			count++;
		}
		System.out.println("Count: "+count);
	}

}
