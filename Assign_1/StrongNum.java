import java.util.*;
public class StrongNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int temp = num;
		int dig=0;
		int res=0;
		while(num>0) {
			dig = num%10;
			int fact=1;
			for(int i=1;i<=dig;i++) {
				fact = i*fact;
			}
			res = res+fact;
			num=num/10;
		}
		if(temp==res) {
			System.out.println("Strong Number");
		}else {
			System.out.println("Not a Strong Number");

		}
		
	}

}
