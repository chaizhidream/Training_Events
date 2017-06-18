
/*
10���ڿ���̨�������ͼ��
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
		// �������Թ滮��ʵ�ָ��Ӹ��ӵ�ͼ�����ƣ������߽���
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
