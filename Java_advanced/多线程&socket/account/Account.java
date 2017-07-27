package account;

public class Account {
	private String id;
	private int account;

	public Account() {
		// TODO �Զ����ɵĹ��캯�����
	}

	public Account(String id, int account) {
		super();
		this.id = id;
		this.account = account;
	}

	public synchronized void deposit(double money) {
		System.out.print(Thread.currentThread().getName());
		if (money > 0) {
			System.out.println("�ɹ����룺" + money + "Ԫ");
			try {
				Thread.sleep(1);
			} catch (InterruptedException ex) {
				ex.printStackTrace();
			}
			account += money;
		} else {
			System.out.println("���ʧ�ܣ�");
		}
		checkBalance();
	}

	public synchronized void withdraw(double drawAmount) {
		System.out.print(Thread.currentThread().getName());
		if (account >= drawAmount) {
			System.out.println("ȡ��ɹ����³���Ʊ��" + drawAmount);
			try {
				Thread.sleep(1);
			} catch (InterruptedException ex) {
				ex.printStackTrace();
			}
			account -= drawAmount;
		} else {
			System.out.println("ȡǮʧ�ܣ�����");
		}
		checkBalance();
	}

	public void checkBalance() {
		System.out.println("��ǰ�˻�" + getId() + "�����Ϊ" + getAccount() + "Ԫ");
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
	// ������ֱ���޸����
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
