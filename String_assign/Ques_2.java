package String_assign;
import java.util.*;
public class Ques_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the stored Password");
		String stored = sc.nextLine();
		System.out.println("Enter the Password");
		String entered = sc.nextLine();
		
		if(stored.equals(entered)) {
			System.out.println("Login Success");
		} 
		else {
			System.out.println("Login Failed");

		}
	}

}
