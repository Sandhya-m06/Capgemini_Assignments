import java.util.*;
public class Power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		System.out.println("enter the power");
		int p=sc.nextInt();
		int res = 1;
		if(p==0) {
			System.out.println(res);
		}else {
			for(int i=1;i<=p;i++) {
				res = res*n;
			}
			System.out.println(res);
		}
	}

}
