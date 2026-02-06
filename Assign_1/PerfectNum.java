import java.util.*;
public class PerfectNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int temp = num;
		int sum=0;
		for(int i=1;i<=num/2;i++) {
			if(num%i==0) {
				sum = sum+i;
			}
		}
		if(temp==sum) {
			System.out.println("Perfect number");
		}else {
			System.out.println("Not a Perfect number");

		}
 	}

}
