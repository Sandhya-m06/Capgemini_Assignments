import java.util.*;
public class OddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int n=sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i=0;i<n;i++) {
			System.out.print("Even Numbers: ");
			if(arr[i]==0||arr[i]%2==0) {
				System.out.print(arr[i]+" ");
			}
			System.out.print("Odd Numbers: ");
			if(arr[i]%2!=0) {
				System.out.print( arr[i]+" ");

			}
		}
	}

}
