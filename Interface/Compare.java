package Practice_lambda;
import java.util.*;
public class Compare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<>();
		list.add("b");
		list.add("p");
		list.add("g");
		list.add("v");
		list.add("a");
		
		Collections.sort(list,(s1,s2)->s1.compareTo(s2));
		System.out.println(list);
	}

}
