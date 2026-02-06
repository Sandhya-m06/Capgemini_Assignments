import java.util.*;
public class NegPower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		System.out.println("enter the neg power");
		int p=sc.nextInt();
		int p1 = -1*p;
		int res = 1;
		float rec = 1;
		if(p1==0) {
			System.out.println(res);
		}else {
			for(int i=1;i<=p1;i++) {
				res = res*n;
				
			}
			rec = rec/res;
			System.out.println(rec);
		}
	}

}
