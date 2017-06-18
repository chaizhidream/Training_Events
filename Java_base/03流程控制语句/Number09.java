

import java.util.Scanner;

public class Number09 {
	/*
	 * 9． 编写一个程序，计算邮局汇款的汇费。
	 * 如果汇款金额小于 100 元，汇费为一元，
	 * 如果金额在 100 元与 5000 元之间，按 1%收取汇费，
	 * 如果金额大于 5000 元，汇费为 50 元。汇款金额由命令行输入。
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int n = sc.nextInt();
			if (n<100) {
				System.out.println("汇费为"+1+"元");
			}else if (n>=100&&n<5000) {
				System.out.println("汇费为"+n*0.01+"元");
			}else {
				System.out.println("汇费为"+50+"元");
			}
			
		}
		sc.close();
	}
}
