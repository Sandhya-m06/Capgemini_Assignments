package String_assign;
import java.util.*;
public class Ques_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Text");
		String txt = sc.nextLine();
		
		for(int i=0;i<txt.length();i++) {
			char ch = txt.charAt(i);
			int count = 0;
			if(i!= txt.indexOf(ch)) {
				continue;
				
			}
			for(int j=0;j<txt.length();j++) {
				if(ch == txt.charAt(j)) {
					count++;
				}
			}
			System.out.println(ch + " = " + count);
		}
		
	}

}
