

import java.util.Scanner;

public class Number05 {
	/*
	 * 5������һ�� 0��100 �ķ����� ������� 0��100 ֮�䣬��ӡ������Ч�� ���ݷ����ȼ���ӡA,B,C,D,E
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			// ��������Ҫ�Ĵ����
			int x = sc.nextInt();
			if (x > 100 || x < 0) {
				System.out.println("�������ݴ�������������");
			}
			if (x == 100) {
				System.out.println("�����ȼ�ΪS��");
			}
			x /= 10;// ȡʮλ�ϵ�ֵ;
			if (x == 9) {
				System.out.println("�����ȼ�ΪA��");
			} else if (x == 8) {
				System.out.println("�����ȼ�ΪB��");
			} else if (x == 7) {
				System.out.println("�����ȼ�ΪC��");
			} else if (x == 6) {
				System.out.println("�����ȼ�ΪD��");
			} else {
				System.out.println("�����ȼ�ΪE��");
			}

		}
		sc.close();
	}
}
