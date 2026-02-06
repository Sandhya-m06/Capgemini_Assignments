import java.util.*;
public class CapsStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		String str2 ="";
		char ch;
		for(int i=0;i<str1.length();i++) {
			ch = str1.charAt(i);
			if(i==0 || i==str1.length()-1) {
				str2=str2+Character.toUpperCase(ch);
			}else {
				str2=str2+ch;
			}
		}
		System.out.println(str2);
	}

}
