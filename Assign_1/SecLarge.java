import java.util.*;
public class SecLarge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int n=sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		int min = arr[0];
		for(int i=0;i<n;i++) {
			
			if (arr[i]<min) {
				min = arr[i];
			}
		}
		int max=arr[0];
		int secmax=min;
		for(int i=0;i<n;i++) {
			if(max<arr[i] ) {
				secmax=max;
				max=arr[i];
				
			}
		
			else if(arr[i]<max && arr[i]>secmax) {
				secmax=arr[i];
			}
		}
		System.out.println("Second Largest: "+secmax);
	}

}
