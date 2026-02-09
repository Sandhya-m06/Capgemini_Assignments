package Practice_lambda;

public class Greet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Greeting say = (name)->{ System.out.println("Hello"+name);
		};
		
		say.sayHello("sandhya");
	}

}
