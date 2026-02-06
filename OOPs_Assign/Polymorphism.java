package OOPs_Assign;
class Customer {

    public double calculateDiscount(double amount) {
        System.out.println("No discount applied");
        return amount;
    }

    public double validateCoupon(double amount) {
    	System.out.println("Additional coupon discount applied");
        return amount - 500;
    }

    public double applyFinalPrice(double amount) {
        return amount;
    }
}

class RegularCustomer extends Customer {

    public double calculateDiscount(double amount) {
        System.out.println("Regular customer discount applied");
        return amount - (amount * 0.05);
    }
}

class PremiumCustomer extends Customer {

    public double calculateDiscount(double amount) {
        System.out.println("Premium discount applied");
        return amount - (amount * 0.15);
    }
}

class CorporateCustomer extends Customer {

    public double calculateDiscount(double amount) {
        System.out.println("Corporate discount applied");
        return amount - (amount * 0.25);
    }
}

public class Polymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer c1= new PremiumCustomer();            

        double orderAmount = 10000;

        double AfterDisAmount = c1.calculateDiscount(orderAmount);
        double FinalAmount = c1.validateCoupon(AfterDisAmount);
        System.out.println("Final Payable Amount: ₹" + FinalAmount );
	}

}
