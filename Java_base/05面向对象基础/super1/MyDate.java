package super1;
/*（2）编写一个日期类 MyDate，包含一个构造方法，3 个私有成员变量
year,month,day 以及与它们相对应的 get 与 set 方法，再加上一个转换成字符串
的方法 toString。
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
		return ""+getYear()+"年"+getMonth()+"月"+getDay()+"日";
	}
	
}
