package super1;
/*1����1����дһ��ʱ���� MyTime������һ�����췽����3 ��˽�г�Ա����
hour,minute,second �Լ����������Ӧ�� get �� set ����(�� hour �� getHour ��
setHour �������ֱ��ʾ��ú����� hour�����ټ���һ��ת�����ַ����ķ���
toString��*/
public class MyTime {
	private int hour;
	private int minute;
	private int second;
	
	public int getHour() {
		return hour;
	}
	public void setHour(int hour) {
		if (hour<0||hour>24) {
			System.out.println("Сʱ������������������");
		}else {
			this.hour = hour;
		}
	}
	
	public int getMinute() {
		return minute;
	}
	
	public void setMinute(int minute) {
		if (minute<0||minute>60) {
			System.out.println("����������������������");
		}else {
			this.minute =minute;
		}
	}
	
	public int getSecond() {
		return second;
	}
	
	public void setSecond(int second) {
		if (second<0||second>60) {
			System.out.println("����������������������");
		}else {
			this.second = second;
		}
	}
	
	public String toString() {
		return ""+getHour()+"ʱ"+getMinute()+"��"+getSecond()+"��";
	}
	
}
