package super1;
/*��2����дһ�������� MyDate������һ�����췽����3 ��˽�г�Ա����
year,month,day �Լ����������Ӧ�� get �� set �������ټ���һ��ת�����ַ���
�ķ��� toString��
*/
public class MyDate {
	private int year;
	private int month;
	private int day;
	
	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}



	public String toString() {
		return ""+getYear()+"��"+getMonth()+"��"+getDay()+"��";
	}
	
}
