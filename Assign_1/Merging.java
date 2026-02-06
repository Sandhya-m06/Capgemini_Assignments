import java.util.*;
public class Merging {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int n=sc.nextInt();
		int[] arr1 = new int[n];
		for(int i=0;i<n;i++) {
			arr1[i] = sc.nextInt();
		}
		int[] arr2 = new int[n];
		for(int i=0;i<n;i++) {
			arr2[i] = sc.nextInt();
		}
		
		int[] merge = new int[n*2];
		int k=0;
		for(int i=0;i<n;i++) {
			merge[k++] = arr1[i];
		}
		for(int i=0;i<n;i++) {
			merge[k++] = arr2[i];
		}
		for(int i=0;i<n*2;i++) {
			System.out.print(merge[i]+" ");
		}
	}

}
