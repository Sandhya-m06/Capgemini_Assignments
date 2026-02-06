import java.util.*;
public class RevString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		
		if(s1.length()!=s2.length()) {
			System.out.println("Not Reverse");
			
		}else {
			String rev = "";
			
			for(int j=s2.length()-1;j>=0;j--) {
				rev = rev+s2.charAt(j);
			}
			if(rev.equals(s1)) {
				System.out.println("Reverse");
			}else {
				System.out.println("Not Reverse");
			}
		}
		
		
	}

}
