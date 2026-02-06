package String_assign;
import java.util.*;
public class Ques_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String s1 = sc.nextLine();
		String s2 = "";
		String arr1[] = s1.split("\\|");
		
		for(String x : arr1) {
			String arr2[] = x.split("-");
			if(arr2[0].equals("ORDERID")) {
				System.out.println("Order ID = " + arr2[1]);
			}
			else if(arr2[0].equals("PRODUCT")) {
				System.out.println("PRODUCT = " + arr2[1]);

			}
			else if(arr2[0].equals("PRICE")) {
				System.out.println("PRICE = " + arr2[1]);

			}
		}
		
	}

}
