import java.util.*;
public class ArmStrongNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int temp = num;
		int sum = 0;
		int count = 0;

		int t = num;
		while (t > 0) {
		    count++;
		    t = t / 10;
		}
		while (num > 0) {
		    int dig = num % 10;
		    int power = 1;
		    for (int i = 1; i <= count; i++) {
		        power = power * dig;
		    }

		    sum = sum + power;
		    num = num / 10;
		}

		if (temp == sum) {
		    System.out.println("Armstrong Number");
		} else {
		    System.out.println("Not an Armstrong Number");
		}

	}

}
