package Practice_lambda;

public class Highest_dig {
	public static void main(String[] args) {
		Comp_dig high = (a,b)-> a > b;
		
		System.out.println(high.compare(23,45));
	}

	

}
