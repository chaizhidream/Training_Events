package number4;

/*
 (3) HourlyEmployee ：ColaEmployee 的子类，按小时拿工资的员工，每月工作超出
160 小时的部分按照 1.5 倍工资发放。
属性：每小时的工资、每月工作的小时数
 */
public class HourlyEmployee extends ColaEmployee {
	private int hourlySalary;
	private int workingHours[] = new int[12];

	// 计算工资的方法
	@Override
	public double getSalary(int month) {
		double salary = 0.0;
		if (getWorkingHoursByMonth(month) > 160) {
			salary = (getWorkingHoursByMonth(month) - 160) * 1.5 * hourlySalary + 160 * hourlySalary;
		} else {
			salary = getWorkingHoursByMonth(month) * hourlySalary;
		}

		if (month == birthdayMonth) {
			salary += 100;
			System.out.println(name+"过生日额外奖励100");
		}
		return salary;
	}

	public HourlyEmployee(int hourlySalary, int month, int hour) {
		setWorkingHoursByMonth(month, hour);
		this.hourlySalary = hourlySalary;
	}

	public HourlyEmployee(String name, int birthdayMonth, int hourlySalary, int month, int hour) {
		super(name, birthdayMonth);
		setWorkingHoursByMonth(month, hour);
		this.hourlySalary = hourlySalary;
	}

	public int getHourlySalary() {
		return hourlySalary;
	}

	public void setHourlySalary(int hourlySalary) {
		this.hourlySalary = hourlySalary;
	}

	public int[] getWorkingHours() {
		return workingHours;
	}

	public void setWorkingHours(int[] workingHours) {
		this.workingHours = workingHours;
	}

	public void setWorkingHoursByMonth(int month, int hour) {
		workingHours[month - 1] = hour;
	}

	public int getWorkingHoursByMonth(int month) {
		return workingHours[month - 1];
	}

}
