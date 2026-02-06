import java.util.*;
public class SmallSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n = sc.nextInt();
		
		System.out.println("ENter the elements");
		int[] array = new int[n];
		for(int i=0;i<n;i++) {
			array[i] = sc.nextInt();
		}
		
		int smallsum=array[0]+array[1];
		int sum = 0;
		for(int i=0;i<n-1;i++) {
			sum = array[i]+array[i+1];
			if(sum<smallsum) {
				smallsum = sum;
			}
		}
		System.out.println(smallsum);
		
	}

}
