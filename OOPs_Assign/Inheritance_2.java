package OOPs_Assign;
class A {
	void display() {
		System.out.println("Parent Class");
	}
}
class B extends A {
	void display() {
		System.out.println("Child class 1");
	}
}
class C extends B {
	void display() {
		System.out.println("Chils class 2");
	}
}
public class Inheritance_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A obj1 = new B();
		obj1.display();
		B obj2 = new C();
		obj2.display();
	}

}
