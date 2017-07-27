package account;

public class Account {
	private String id;
	private int account;

	public Account() {
		// TODO 自动生成的构造函数存根
	}

	public Account(String id, int account) {
		super();
		this.id = id;
		this.account = account;
	}

	public synchronized void deposit(double money) {
		System.out.print(Thread.currentThread().getName());
		if (money > 0) {
			System.out.println("成功存入：" + money + "元");
			try {
				Thread.sleep(1);
			} catch (InterruptedException ex) {
				ex.printStackTrace();
			}
			account += money;
		} else {
			System.out.println("存款失败！");
		}
		checkBalance();
	}

	public synchronized void withdraw(double drawAmount) {
		System.out.print(Thread.currentThread().getName());
		if (account >= drawAmount) {
			System.out.println("取款成功！吐出钞票：" + drawAmount);
			try {
				Thread.sleep(1);
			} catch (InterruptedException ex) {
				ex.printStackTrace();
			}
			account -= drawAmount;
		} else {
			System.out.println("取钱失败，余额不足");
		}
		checkBalance();
	}

	public void checkBalance() {
		System.out.println("当前账户" + getId() + "的余额为" + getAccount() + "元");
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getAccount() {
		return account;
	}
	// 不允许直接修改余额
	// public void setAccount(int account) {
	// this.account = account;
	// }

	@Override
	public int hashCode() {
		return id.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj != null && obj.getClass() == Account.class) {
			Account target = (Account) obj;
			return target.getId().equals(id);
		}
		return false;
	}

}
