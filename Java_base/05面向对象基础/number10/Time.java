package number10;
/*10. ����һ��ʱ���࣬�ṩ�趨ʱ�����ʾʱ��ķ����������趨ʱ��ķ�����ҪУ����
�ݵ���ȷ�ԣ����� main ��������֤��
*/

public class Time {
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

public void showTime() {
	System.out.println("��ǰ��ʱ���ǣ�"+getHour()+"ʱ"+getMinute()+"��"+getSecond()+"��");
}

public static void main(String[] args) {
	Time  t=new Time();
	t.setHour(7);
	t.setMinute(70);
	t.setSecond(42);
	t.showTime();
}
	
}


