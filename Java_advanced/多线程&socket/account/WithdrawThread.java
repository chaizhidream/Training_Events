package account;

public class WithdrawThread extends Thread {
private Account account;
private double drawAmount;


public WithdrawThread(String name ,Account account, double drawAmount) {
	super(name);
	this.account = account;
	this.drawAmount = drawAmount;
}


	public void run() {
	
		account.withdraw(drawAmount);
	}


}
