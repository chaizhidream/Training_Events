
import javax.swing.JOptionPane;

public class Super3 {
	/*
	 * 3���� n ��������ʹ��ǰ�����˳������� m ��λ�ã���� m ���������ǰ��� m ������ ���� 1 2 3 4 5 6 7 �ƶ� 4
	 * ���ͱ�� 4 5 6 7 1 2 3
	 */

	public static void main(String[] args) {

		int[] n = new int[10];
		for (int i = 0; i < n.length; i++) {
			n[i] = (int) (Math.random() * 10);
		}
		System.out.print("�ƶ�ǰ������Ϊ��");
		for (int i : n) {
			System.out.print(i+" ");
		}
		int m = Integer.valueOf(JOptionPane.showInputDialog("������Ҫ�ƶ���m��ֵ��"));
		move(n, m);
		System.out.println("");
		System.out.print("�ƶ��������Ϊ��");
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