package Practice_lambda;

public class LambdaExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MaxFinder find = (n1,n2) ->n1>n2?n1:n2;//lambda expression
		int res = find.max(43, 55);
		System.out.println(res);
		
		MathOperation op1 = (n1,n2)->n1-n2;
		int res2 = op1.operate(30,20);
		
		MathOperation op2 = (n1,n2)->n1+n2;
		int res3 = op2.operate(30,20);
		System.out.println(res2+" "+res3);
		
	}

}
