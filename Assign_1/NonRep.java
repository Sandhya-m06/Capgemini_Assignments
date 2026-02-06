import java.util.*;
public class NonRep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the sie of an array");
		int n=sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i=0;i<n;i++) {
			int count = 0;
			for(int j=0;j<n;j++) {
				if(arr[i] == arr[j]) {
					count++;
				}
			}
			if(count==1) {
				System.out.println(arr[i]);
			}
		}
		
		
	}

}
