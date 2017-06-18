

import java.util.Scanner;

public class Number13 {
	/*
	 * 13． 由命令行输入一个成绩 a，使用 switch 结构求出 a 的等级。
	 * A：90-100，B：80-89，C：70-79，D：60-69，E：0~59
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int a = sc.nextInt();
			if (a >= 0 && a <= 100) {
				Level(a);
			} else {
				System.out.println("成绩有误");
			}
		}
		sc.close();

	}

	private static void Level(int a) {
		a /= 10;
		switch (a) {
		case 10:
			System.out.println("等级为A");
			break;
		case 9:
			System.out.println("等级为A");
			break;
		case 8:
			System.out.println("等级为B");
			break;
		case 7:
			System.out.println("等级为C");
			break;
		case 6:
			System.out.println("等级为D");
			break;
		default:
			System.out.println("等级为E");
			break;

		}

	}
}
