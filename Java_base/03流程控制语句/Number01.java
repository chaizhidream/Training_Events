

import java.util.Scanner;

public class Number01 {
	/*
	 * 1． 输入一个数字，判断是一个奇数还是偶数（知识点：条件语句）
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			  //这里是主要的代码块
			boolean flag = true;
			if (sc.nextInt() % 2 == 0) {
				flag = false;
			}
			if (flag) {
				System.out.println("这个数是奇数");
			} else {
				System.out.println("这个数是偶数");
			}

		}
		sc.close();

	}

}
