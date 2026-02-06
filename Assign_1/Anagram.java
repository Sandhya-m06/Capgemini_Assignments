import java.util.*;
public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		
		if(s1.length()!=s2.length()) {
			System.out.println("Not Anagram");
		}
		char[] ch1;
		char[] ch2;
		ch1 = s1.toCharArray();
		ch2 = s2.toCharArray();
		
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
		if(Arrays.equals(ch1, ch2)) {
			System.out.println("Anagram");
		} else {
			System.out.println("Not Anagram");
		}
	}

}
