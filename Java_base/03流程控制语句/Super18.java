
/*
18���ŵ����⣺��һ�����ӣ��ӳ������ 3 ������ÿ���¶���һ�����ӣ�С���ӳ���������
�º�ÿ��������һ�����ӣ��������Ӷ��������� 12 ������ÿ���µ���������Ϊ���٣�����
�Ĺ���Ϊ���� 1,1,2,3,5,8,13,21.... 
 */
public class Super18 {

	public static void main(String[] args) {
		int sum=0;
		for (int i = 1; i <= 12; i++) {
			sum+=f(i);
			System.out.println("��"+i+"���µ���������Ϊ��"+sum);
		}
	}

	private static int f(int i) {
		if (i == 1 || i == 2) {
			return 1;
		} else {
			return f(i - 1) + f(i - 2);
		}

	}
}
