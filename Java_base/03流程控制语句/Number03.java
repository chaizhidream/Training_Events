

import java.util.Scanner;

public class Number03 {
/*
 * 3�� �ж�һ�������Ƿ��ܱ� 5�� 6ͬʱ��������ӡ�ܱ� 5�� 6��������
 * ��ֻ�ܱ�5��������ӡ�ܱ� 5��������
 * ��ֻ�ܱ� 6����������ӡ�ܱ� 6 ��������
 * ���ܱ� 5 �� 6 ����������ӡ���ܱ� 5 �� 6 ������
 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			  //��������Ҫ�Ĵ����
			int x=sc.nextInt();
			if (x%30==0) {
				System.out.println(x+"�ܱ� 5�� 6����");
			}
			if ((x%5==0)&&(x%6!=0)) {
				System.out.println(x+"ֻ�ܱ� 5����");
			}
			if ((x%5!=0)&&(x%6==0)) {
				System.out.println(x+"ֻ�ܱ� 6����");
			}
			if (x%30!=0) {
				System.out.println(x+"���ܱ� 5�� 6����");
			}
		}
		sc.close();

	}

}
