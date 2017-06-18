

import java.util.Scanner;

public class Number02 {
	/*
	 * 2． 编写程序， 判断一个变量 x 的值，
	 * 如果是 1，输出 x=1，
	 * 如果是 5，输出 x=5，
	 * 如果是 10，输出 x=10，
	 * 除了以上几个值，都输出 x=none。
	 */	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			  //这里是主要的代码块
			int x=sc.nextInt();
			if (x==1) {
				System.out.println("x=1");
			}else if (x==5) {
				System.out.println("x=5");
			}else if (x==10) {
				System.out.println("x=10");
			}else {
				System.out.println("x="+x);
			}
		}
		sc.close();
	}
}
