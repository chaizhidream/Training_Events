package super1;

/*
 ��3����дһ�� FullTime �࣬����һ�� MyTime ���͵�˽�г�Ա���� time ��һ
�� MyDate ���͵ĳ�Ա���� date���Լ����������Ӧ�� get �� set ������һ����
�췽�����ټ���һ��ת�����ַ����ķ��� toString��
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
