

import java.util.Scanner;

public class Number01 {
	/*
	 * 1�� ����һ�����֣��ж���һ����������ż����֪ʶ�㣺������䣩
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			  //��������Ҫ�Ĵ����
			boolean flag = true;
			if (sc.nextInt() % 2 == 0) {
				flag = false;
			}
			if (flag) {
				System.out.println("�����������");
			} else {
				System.out.println("�������ż��");
			}

		}
		sc.close();

	}

}
