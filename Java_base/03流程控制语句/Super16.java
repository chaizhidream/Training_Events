import java.util.Scanner;

/*
16．输入两个正整数 m 和 n，求其最大公约数和最小公倍数
 */
public class Super16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入m和n");
		while (sc.hasNext()) {
			int m = sc.nextInt();
			int n = sc.nextInt();
			System.out.println("最大公约数为：" + divisor(m, n));
			System.out.println("最小公倍数为：" + multiple(m, n));
			System.out.println("请输入m和n");
		}
		sc.close();
	}

	private static int divisor(int x, int y) {
		// 求最大公约数,辗转相除法
		if (x < y) {
			int c = x;
			x = y;
			y = c;
		}
		while (y != 0) {
			int temp = x % y;
			x = y;
			y = temp;
		}
		return x;

	}

	private static int multiple(int x, int y) {
		// 求最小公倍数
		return x * y / divisor(x, y);
	}

}
