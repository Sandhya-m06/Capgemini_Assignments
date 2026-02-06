package String_assign;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Ques_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the File name");
		String file=sc.nextLine();
		
		String date = LocalDate.now().format(DateTimeFormatter.ofPattern("yyyyMMdd"));
		System.out.println("Timestamp is: "+date);
		String name = "_".concat(file);
		String org = date.concat(name);
		System.out.println("New File Name: "+org);
	}

}
