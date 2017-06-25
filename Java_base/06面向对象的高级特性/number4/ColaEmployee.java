package number4;

/*
4、Cola 公司的雇员分为以下若干类：(知识点：多态)
(1) ColaEmployee ：这是所有员工总的父类，属性：员工的姓名,员工的生日月份。
方法：getSalary(int month) 根据参数月份来确定工资，如果该月员工过生日，
则公司会额外奖励 100 元。
*/

public abstract  class ColaEmployee {
	protected String name;
	protected int birthdayMonth;

	public abstract  double getSalary(int month);

	public ColaEmployee() {
		// TODO 自动生成的构造函数存根
	}

	public ColaEmployee(String name, int birthdayMonth) {
		this.name=name;
		this.birthdayMonth=birthdayMonth;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBirthdayMonth() {
		return birthdayMonth;
	}

	public void setBirthdayMonth(int birthdayMonth) {
		this.birthdayMonth = birthdayMonth;
	}
}
