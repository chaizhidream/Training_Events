import java.util.Scanner;

/*1����дһ������ʵ�ִ������в�������һ�ַ�����ͳ�Ƹ��ַ������ַ���e�����ֵĴ�����*/
public class num1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while (sc.hasNext()) {
		sum(sc.next());
		}
		sc.close();

	}

	private static void sum(String s) {
		int sum=0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i)=='e') {
				sum++;
			}
		}
		System.out.println("�ַ���e�����ֵĴ���Ϊ�� "+sum);
	}

}
