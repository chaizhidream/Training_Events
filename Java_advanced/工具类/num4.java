import java.util.Scanner;

/*4���ֱ��ڿ���̨�����ַ��������ַ������������ַ��������ַ������ֵĴ�����*/
public class num4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("�������ַ���");
		String s1 = sc.nextLine();
		System.out.println("�������Ӵ�");
		String s2 = sc.nextLine();
		if (s1.equals("") || s2.equals("")) {
			System.out.println("��û�������ַ������Ӵ�,�޷��Ƚ�!");
			System.exit(0);
		}

		sum(s1, s2);

		sc.close();
	}

	private static void sum(String s1, String s2) {
		int sum = 0;
		for (int i = 0; i < s1.length() - s2.length(); i++) {
			if (s1.substring(i, s2.length() + i).equals(s2)) {
				//// ���ֱȷ������⣬����"aaa"������2��"aa"�Ӵ���
				sum++;
			}
		}
		System.out.println(sum);
	}

}
