package super1;

/*
 （3）编写一个 FullTime 类，包含一个 MyTime 类型的私有成员变量 time 和一
个 MyDate 类型的成员变量 date，以及与它们相对应的 get 与 set 方法，一个构
造方法，再加上一个转换成字符串的方法 toString。
 */
public class FullTime {
	MyTime time = new MyTime();
	MyDate date = new MyDate();
	 public FullTime(MyDate date,MyTime time){
	    this.time=time;
	    this.date=date;
	    }
	 
	public MyTime getTime() {
		return time;
	}
	public void setTime(MyTime time) {
		this.time = time;
	}
	public MyDate getDate() {
		return date;
	}
	public void setDate(MyDate date) {
		this.date = date;
	}
	
	public String toString(){
		return date.toString()+time.toString();
	}

}
