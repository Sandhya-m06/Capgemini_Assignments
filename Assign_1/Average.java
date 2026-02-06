import java.util.*;
public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int dig;
		int n = sc.nextInt();
		int sum = 0;
		int rem;
		int count=0;
		while(n>0) {
			dig = n%10;
			sum = sum+dig;
			n = n/10;
			count++;
		}
		int avg;
		avg = sum/count;
		System.out.println("Average: "+avg);
	}

}
