package number4;

/*
 * (4) SalesEmployee ��ColaEmployee �����࣬������Ա�������������۶������ʾ�
�������ԣ������۶�����
 */
public class SalesEmployee extends ColaEmployee {
	private int monthlyRates[] = new int[12];
	private double commissionRate;

	@Override
	public double getSalary(int month) {
		double salary = 0.0;
		salary = getMonthlyRatesByMonth(month) * commissionRate;
		if (month == birthdayMonth) {
			salary += 100;
			System.out.println(name+"�����ն��⽱��100");
		}
		return salary;
	}

	public SalesEmployee() {

	}

	public SalesEmployee(int commissionRate, int month, int rates) {
		setMonthlyRatesByMonth(month, rates);
		this.commissionRate = commissionRate;
	}

	public SalesEmployee(String name, int birthdayMonth, double commissionRate, int month, int rates) {
		super(name, birthdayMonth);
		setMonthlyRatesByMonth(month, rates);
		this.commissionRate = commissionRate;
	}

	public void setMonthlyRatesByMonth(int month, int rates) {
		monthlyRates[month - 1] = rates;
	}

	public int getMonthlyRatesByMonth(int month) {
		return monthlyRates[month - 1];
	}

	public int[] getMonthlyRates() {
		return monthlyRates;
	}

	public void setMonthlyRates(int[] monthlyRates) {
		this.monthlyRates = monthlyRates;
	}

	public double getCommissionRate() {
		return commissionRate;
	}

	public void setCommissionRate(double commissionRate) {
		this.commissionRate = commissionRate;
	}

}
