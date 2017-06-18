

import java.util.Scanner;

public class Number08 {
	/*
	 * 8．有一个不多于 5 位的正整数，求它是几位数，分别打印出每一位数字。
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int n = sc.nextInt();
			String s = n + "";
			System.out.println(n + "是" + s.length() + "位数");
			System.out.print("每一位依次为：");
			for (int i = 0; i < s.length(); i++) {
				System.out.print(" " + s.charAt(i));
			}
		}
		sc.close();
	}
}
