package OOPs_Assign;

class DigiWallet {
	private int WalletBal = 100000;
	private int LinkedAccBal = 20000;
	private int DailyTransLim;
	private String history="";
	
	public int getDailyTransLim() {
		return DailyTransLim;
	}
	public void setDailyTransLim(int dailyTransLim) {
		DailyTransLim = dailyTransLim;
	}
	
	public void AddMoney(int amount) {
		WalletBal+=amount;
		System.out.println("Amount Added Successfully");
		history += "Amount Added: " + amount+"\n";
	}
	public void TransferMoney(int transferAmnt) {
		if(transferAmnt > DailyTransLim) {
			System.out.println("Daily limit exceeded → Transfer failed\r\n" 
					+ "Transaction marked as failed");
			history += "Transaction Failed " + "Daily Limit exceeded\n";
		}
		else {
			WalletBal-=transferAmnt;
			System.out.println("Transaction Successful");
			history += "Amount Transfered: " + transferAmnt+"\n";
		}
	}
	
	public int CheckBal() {
		return WalletBal;
	}
	public String ViewTransHistory() {
		return history;
	}
	
}

public class Encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DigiWallet obj = new DigiWallet();
		obj.setDailyTransLim(5000);
		obj.AddMoney(10000);
		obj.TransferMoney(6000);
		System.out.println("Balance: " + obj.CheckBal());
		System.out.println("Transaction Details");
		System.out.println(obj.ViewTransHistory());
	}

}
