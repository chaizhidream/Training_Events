

public class Number16 {
	/*
	 * 16������ĳԱ���������н�� 30000 Ԫ����н���������� 6%����дһ�� Java Ӧ�ó������ ��Ա�� 10 ������н����ͳ��δ�� 10
	 * �꣨�ӽ������������롣
	 */
	public static void main(String[] args) {
		int sal = 30000;
		int sum = 0;

		for (int i = 0; i < 10; i++) {
			sum = sum + sal;
			sal *= 1.06;
		}
		System.out.println("10������нΪ" + sal + "Ԫ");
		System.out.println("10���������Ϊ" + sum + "Ԫ");
	}

}
