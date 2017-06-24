package super1;
/*（4）假设当前时间是 2002 年 7 月 30 日 22 点 12 分 35 秒，编写一个程序，用
FullTime 类设置时间为以上时间，并打印。*/
public class Test {

	public static void main(String[] args) {
		
		MyDate date=new MyDate();
		date.setYear(2002);
		date.setMonth(7);
		date.setDay(30);
		
		MyTime time=new MyTime();
		time.setHour(22);
		time.setMinute(12);
		time.setSecond(35);
		
		FullTime ft=new FullTime(date,time);
		System.out.println(ft);
	}

}
