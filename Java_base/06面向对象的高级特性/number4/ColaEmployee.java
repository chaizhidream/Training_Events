package number4;

/*
4��Cola ��˾�Ĺ�Ա��Ϊ���������ࣺ(֪ʶ�㣺��̬)
(1) ColaEmployee ����������Ա���ܵĸ��࣬���ԣ�Ա��������,Ա���������·ݡ�
������getSalary(int month) ���ݲ����·���ȷ�����ʣ��������Ա�������գ�
��˾����⽱�� 100 Ԫ��
*/

public abstract  class ColaEmployee {
	protected String name;
	protected int birthdayMonth;

	public abstract  double getSalary(int month);

	public ColaEmployee() {
		// TODO �Զ����ɵĹ��캯�����
	}

	public ColaEmployee(String name, int birthdayMonth) {
		this.name=name;
		this.birthdayMonth=birthdayMonth;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBirthdayMonth() {
		return birthdayMonth;
	}

	public void setBirthdayMonth(int birthdayMonth) {
		this.birthdayMonth = birthdayMonth;
	}
}
