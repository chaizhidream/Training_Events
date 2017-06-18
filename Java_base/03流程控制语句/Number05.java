

import java.util.Scanner;

public class Number05 {
	/*
	 * 5．输入一个 0～100 的分数， 如果不是 0～100 之间，打印分数无效， 根据分数等级打印A,B,C,D,E
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			// 这里是主要的代码块
			int x = sc.nextInt();
			if (x > 100 || x < 0) {
				System.out.println("输入数据错误，请重新输入");
			}
			if (x == 100) {
				System.out.println("分数等级为S级");
			}
			x /= 10;// 取十位上的值;
			if (x == 9) {
				System.out.println("分数等级为A级");
			} else if (x == 8) {
				System.out.println("分数等级为B级");
			} else if (x == 7) {
				System.out.println("分数等级为C级");
			} else if (x == 6) {
				System.out.println("分数等级为D级");
			} else {
				System.out.println("分数等级为E级");
			}

		}
		sc.close();
	}
}
