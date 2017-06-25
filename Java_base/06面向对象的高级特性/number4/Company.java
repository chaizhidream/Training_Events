package number4;
/*
(5) 定义一个类 Company，在该类中写一个方法，调用该方法可以打印出某月某个员工
的工资数额，写一个测试类 TestCompany,在 main 方法，把若干各种类型的员工放在一个
ColaEmployee 数组里，并单元出数组中每个员工当月的工资。
*/
public class Company {  
	
	public static void Salary(int month,ColaEmployee c){     
		System.out.println(month+"月份"+c.getName()+"的工 资是:"+c.getSalary(month)); 
		}
}