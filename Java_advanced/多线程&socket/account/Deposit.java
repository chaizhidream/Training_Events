package account;

public class Deposit extends Thread{

	private Account account;
	private double money;

	
 public Deposit(String name ,Account account, double money) {
		super(name);
		this.account = account;
		this.money = money;
	}


		public void run() {
			
			account.deposit(money);
		}


	}