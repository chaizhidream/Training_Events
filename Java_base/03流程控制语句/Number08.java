

import java.util.Scanner;

public class Number08 {
	/*
	 * 8����һ�������� 5 λ���������������Ǽ�λ�����ֱ��ӡ��ÿһλ���֡�
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int n = sc.nextInt();
			String s = n + "";
			System.out.println(n + "��" + s.length() + "λ��");
			System.out.print("ÿһλ����Ϊ��");
			for (int i = 0; i < s.length(); i++) {
				System.out.print(" " + s.charAt(i));
			}
		}
		sc.close();
	}
}
