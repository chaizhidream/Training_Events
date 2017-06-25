package number4;

/*
 * (4) SalesEmployee ：ColaEmployee 的子类，销售人员，工资由月销售额和提成率决
定。属性：月销售额、提成率
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
			System.out.println(name+"过生日额外奖励100");
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
