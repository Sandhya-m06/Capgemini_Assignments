import java.util.*;
public class PrimeNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		for(int i=num1;i<=num2;i++) {
			if(i>1) {
				int count=0;
				for (int j = 2; j < i; j++) {
		            if (i % j == 0) {
		                count++;
		                break;
		            }
		        }
				if(count==0) {
					System.out.println(i);
				}
			}
		}
	}

}
