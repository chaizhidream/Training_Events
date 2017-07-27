package account;

public class Test {
	public static void main(String[] args) {
		Account a1 = new Account("100023001", 2000);

		WithdrawThread w1 = new WithdrawThread("a", a1, 100);
		Deposit d1 = new Deposit("a", a1, 340);

		WithdrawThread w2 = new WithdrawThread("b", a1, 200);
		Deposit d2 = new Deposit("b", a1, 340);

		WithdrawThread w3 = new WithdrawThread("c", a1, 350);
		Deposit d3 = new Deposit("c", a1, 340);

		WithdrawThread w4 = new WithdrawThread("d", a1, 400);
		Deposit d4 = new Deposit("d", a1, 340);
		
		WithdrawThread w5 = new WithdrawThread("e", a1, 400);
		Deposit d5 = new Deposit("e", a1, 340);
		
		WithdrawThread w6 = new WithdrawThread("f", a1, 400);
		Deposit d6 = new Deposit("f", a1, 340);
		
		WithdrawThread w7 = new WithdrawThread("g", a1, 400);
		Deposit d7 = new Deposit("g", a1, 340);
		
		w1.start();
		d1.start();
		w2.start();
		d2.start();
		w3.start();
		d3.start();
		w4.start();
		d4.start();
		w5.start();
		d5.start();
		w6.start();
		d6.start();
		w7.start();
		d7.start();

	}
}
