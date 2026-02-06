import java.util.*;
public class VowCons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		String str2 = str1.toLowerCase();
		int count1=0;
		int count2=0;
		for(int i=0;i<=str2.length()-1;i++) {
			if(str2.charAt(i)=='a'||str2.charAt(i)=='e'||str2.charAt(i)=='i'||str2.charAt(i)=='o'||str2.charAt(i)=='u') {
				count1++;
			}else {
				count2++;
			}
		}
		System.out.println("Vowels: "+count1+" and Consonants: "+count2);
	}

}
