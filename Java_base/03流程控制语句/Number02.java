

import java.util.Scanner;

public class Number02 {
	/*
	 * 2�� ��д���� �ж�һ������ x ��ֵ��
	 * ����� 1����� x=1��
	 * ����� 5����� x=5��
	 * ����� 10����� x=10��
	 * �������ϼ���ֵ������� x=none��
	 */	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			  //��������Ҫ�Ĵ����
			int x=sc.nextInt();
			if (x==1) {
				System.out.println("x=1");
			}else if (x==5) {
				System.out.println("x=5");
			}else if (x==10) {
				System.out.println("x=10");
			}else {
				System.out.println("x="+x);
			}
		}
		sc.close();
	}
}
