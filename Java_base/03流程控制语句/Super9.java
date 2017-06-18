
/*
10．在控制台输出以下图形
 */
public class Super9 {

	public static void main(String[] args) {
		int m = 8, n = 8;
		for (int i = 0; i <= m; i++) {
			for (int j = 0; j <= n; j++) {
				if (isInRhombus(i, j, m, n)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

	private static boolean isInRhombus(int x, int y, int m, int n) {
		// 利用线性规划可实现更加复杂的图案绘制，四条边界线
		int s = m * n;
		if (2 * n * x + 2 * m * y >= s
				&& 2 * n * x - 2 * m * y <= s 
				&& -2 * n * x + 2 * m * y <= s
				&& 2 * n * x + 2 * m * y <= 3 * s) {
			return true;
		}
		return false;
	}
}
