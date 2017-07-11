import java.util.Scanner;

/*4、分别在控制台输入字符串和子字符串，并计算字符串中子字符串出现的次数。*/
public class num4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("请输入字符串");
		String s1 = sc.nextLine();
		System.out.println("请输入子串");
		String s2 = sc.nextLine();
		if (s1.equals("") || s2.equals("")) {
			System.out.println("你没有输入字符串或子串,无法比较!");
			System.exit(0);
		}

		sum(s1, s2);

		sc.close();
	}

	private static void sum(String s1, String s2) {
		int sum = 0;
		for (int i = 0; i < s1.length() - s2.length(); i++) {
			if (s1.substring(i, s2.length() + i).equals(s2)) {
				//// 这种比法有问题，如会把"aaa"看成有2个"aa"子串。
				sum++;
			}
		}
		System.out.println(sum);
	}

}
