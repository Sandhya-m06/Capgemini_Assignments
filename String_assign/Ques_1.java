package String_assign;
import java.util.*;
public class Ques_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = sc.nextLine();
		
		boolean isvalid = true;
		if(str.length() < 5 || str.length() > 12 ) { 
			isvalid = false;
		}
		
		for(int i=0;i<str.length();i++) {
			char ch =str.charAt(i);
			if(!Character.isLetterOrDigit(ch)) {
				isvalid = false;
			}
			else if(Character.isDigit(ch)) {
				isvalid = false;
			}
			else if(ch == ' ' ) {
				isvalid = false;
			}
			
			
		}
		if(isvalid) {
			System.out.println("Valid Username");
		}
		else {
			System.out.println("Invalid username");
		}
		
	}

}


