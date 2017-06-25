package number4;

import java.util.ArrayList;

public class TestCompany {

	public static void main(String[] args) {

		// SalariedEmployee(姓名，生日月份，固定工资)
		// (HourlyEmployee)姓名，生日月份，时薪，当前月份，工作小时数
		// (SalesEmployee)姓名，生日月份，提成率，当前月份，销售额

		ArrayList<ColaEmployee> arr = new ArrayList<ColaEmployee>();
		arr.add(new SalariedEmployee("野比大雄", 2, 3500));
		arr.add(new HourlyEmployee("骨川小夫", 4, 15, 2, 184));
		arr.add(new SalesEmployee("刚田武", 6, 0.2, 2, 150000));

		for (ColaEmployee c : arr) {
			Company.Salary(2, c);
		}

	}
}
