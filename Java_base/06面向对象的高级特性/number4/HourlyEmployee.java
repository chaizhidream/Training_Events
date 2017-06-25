package number4;

/*
 (3) HourlyEmployee ��ColaEmployee �����࣬��Сʱ�ù��ʵ�Ա����ÿ�¹�������
160 Сʱ�Ĳ��ְ��� 1.5 �����ʷ��š�
���ԣ�ÿСʱ�Ĺ��ʡ�ÿ�¹�����Сʱ��
 */
public class HourlyEmployee extends ColaEmployee {
	private int hourlySalary;
	private int workingHours[] = new int[12];

	// ���㹤�ʵķ���
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
			System.out.println(name+"�����ն��⽱��100");
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
