package number10;
/*10. 定义一个时间类，提供设定时间和显示时间的方法，其中设定时间的方法需要校验数
据的正确性，并在 main 方法中验证。
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
		System.out.println("小时设置有误，请重新设置");
	}else {
		this.hour = hour;
	}
}
public int getMinute() {
	return minute;
}
public void setMinute(int minute) {
	if (minute<0||minute>60) {
		System.out.println("分钟设置有误，请重新设置");
	}else {
		this.minute =minute;
	}
}
public int getSecond() {
	return second;
}
public void setSecond(int second) {
	if (second<0||second>60) {
		System.out.println("秒数设置有误，请重新设置");
	}else {
		this.second = second;
	}
}

public void showTime() {
	System.out.println("当前的时间是："+getHour()+"时"+getMinute()+"分"+getSecond()+"秒");
}

public static void main(String[] args) {
	Time  t=new Time();
	t.setHour(7);
	t.setMinute(70);
	t.setSecond(42);
	t.showTime();
}
	
}


