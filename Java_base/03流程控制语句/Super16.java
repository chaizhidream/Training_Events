import java.util.Scanner;

/*
16���������������� m �� n���������Լ������С������
 */
public class Super16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������m��n");
		while (sc.hasNext()) {
			int m = sc.nextInt();
			int n = sc.nextInt();
			System.out.println("���Լ��Ϊ��" + divisor(m, n));
			System.out.println("��С������Ϊ��" + multiple(m, n));
			System.out.println("������m��n");
		}
		sc.close();
	}

	private static int divisor(int x, int y) {
		// �����Լ��,շת�����
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
		// ����С������
		return x * y / divisor(x, y);
	}

}
