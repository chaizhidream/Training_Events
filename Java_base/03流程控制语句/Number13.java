

import java.util.Scanner;

public class Number13 {
	/*
	 * 13�� ������������һ���ɼ� a��ʹ�� switch �ṹ��� a �ĵȼ���
	 * A��90-100��B��80-89��C��70-79��D��60-69��E��0~59
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int a = sc.nextInt();
			if (a >= 0 && a <= 100) {
				Level(a);
			} else {
				System.out.println("�ɼ�����");
			}
		}
		sc.close();

	}

	private static void Level(int a) {
		a /= 10;
		switch (a) {
		case 10:
			System.out.println("�ȼ�ΪA");
			break;
		case 9:
			System.out.println("�ȼ�ΪA");
			break;
		case 8:
			System.out.println("�ȼ�ΪB");
			break;
		case 7:
			System.out.println("�ȼ�ΪC");
			break;
		case 6:
			System.out.println("�ȼ�ΪD");
			break;
		default:
			System.out.println("�ȼ�ΪE");
			break;

		}

	}
}
