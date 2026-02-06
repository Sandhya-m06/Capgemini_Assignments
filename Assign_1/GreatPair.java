import java.util.*;
public class GreatPair {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		int sum = arr[0]+arr[1];
		int p1 =0;
		int p2=0;
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(sum < arr[i]+arr[j]) {
					sum=arr[i]+arr[j];
					p1=i;
					p2=j;
				}
			}
		}
		System.out.println("Pair: "+arr[p1]+" "+arr[p2]);

	}

}
