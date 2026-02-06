import java.util.*;
public class IntAsc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=0;i<=9;i++) {
			int temp =n;
			while (temp > 0) {
                if (temp % 10 == i) {
                    System.out.print(i);
                    break;
                }
                temp = temp / 10;
		}}
	}

}
