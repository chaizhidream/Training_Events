package number4;

import java.util.ArrayList;

public class TestCompany {

	public static void main(String[] args) {

		// SalariedEmployee(�����������·ݣ��̶�����)
		// (HourlyEmployee)�����������·ݣ�ʱн����ǰ�·ݣ�����Сʱ��
		// (SalesEmployee)�����������·ݣ�����ʣ���ǰ�·ݣ����۶�

		ArrayList<ColaEmployee> arr = new ArrayList<ColaEmployee>();
		arr.add(new SalariedEmployee("Ұ�ȴ���", 2, 3500));
		arr.add(new HourlyEmployee("�Ǵ�С��", 4, 15, 2, 184));
		arr.add(new SalesEmployee("������", 6, 0.2, 2, 150000));

		for (ColaEmployee c : arr) {
			Company.Salary(2, c);
		}

	}
}
