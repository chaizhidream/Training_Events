
import javax.swing.JOptionPane;

public class Super3 {
	/*
	 * 3．有 n 个整数，使其前面各数顺序向后移 m 个位置，最后 m 个数变成最前面的 m 个数。 例如 1 2 3 4 5 6 7 移动 4
	 * 个就变成 4 5 6 7 1 2 3
	 */

	public static void main(String[] args) {

		int[] n = new int[10];
		for (int i = 0; i < n.length; i++) {
			n[i] = (int) (Math.random() * 10);
		}
		System.out.print("移动前的数组为：");
		for (int i : n) {
			System.out.print(i+" ");
		}
		int m = Integer.valueOf(JOptionPane.showInputDialog("请输入要移动的m的值："));
		move(n, m);
		System.out.println("");
		System.out.print("移动后的数组为：");
		for (int i : n) {
			System.out.print(i+" ");
		}
	}

	private static int[] move(int[] n, int m) {
		int[] temp = new int[n.length];
		int t = 0;
		for (int i = m; i < temp.length; i++) {
			temp[t++] = n[i];
		}
		for (int i = 0; i < m; i++) {
			temp[t++] = n[i];
		}
		for (int i = 0; i < n.length; i++) {
			n[i] = temp[i];
		}
		return n;
	}

}