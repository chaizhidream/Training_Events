package super1;
/*1、（1）编写一个时间类 MyTime，包含一个构造方法，3 个私有成员变量
hour,minute,second 以及与它们相对应的 get 与 set 方法(如 hour 有 getHour 和
setHour 方法，分别表示获得和设置 hour），再加上一个转换成字符串的方法
toString。*/
public class MyTime {
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
	
	public String toString() {
		return ""+getHour()+"时"+getMinute()+"分"+getSecond()+"秒";
	}
	
}
