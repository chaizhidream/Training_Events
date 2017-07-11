import java.util.Scanner;

/*1、编写一个程序，实现从命令行参数输入一字符串，统计该字符串中字符“e”出现的次数。*/
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
		System.out.println("字符“e”出现的次数为： "+sum);
	}

}
