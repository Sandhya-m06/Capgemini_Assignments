import java.util.*;
public class PrimeFac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for(int i=2;i<=num;i++) {
			while(num%i == 0) {
				System.out.print(i+" ");
				num=num/i;
			}
		}

	}

}
