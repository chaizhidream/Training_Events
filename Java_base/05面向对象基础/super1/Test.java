package super1;
/*��4�����赱ǰʱ���� 2002 �� 7 �� 30 �� 22 �� 12 �� 35 �룬��дһ��������
FullTime ������ʱ��Ϊ����ʱ�䣬����ӡ��*/
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
