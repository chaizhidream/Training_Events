

import java.util.Scanner;

public class Number03 {
/*
 * 3． 判断一个数字是否能被 5和 6同时整除（打印能被 5和 6整除），
 * 或只能被5整除（打印能被 5整除），
 * 或只能被 6整除，（打印能被 6 整除），
 * 不能被 5 或 6 整除，（打印不能被 5 或 6 整除）
 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			  //这里是主要的代码块
			int x=sc.nextInt();
			if (x%30==0) {
				System.out.println(x+"能被 5和 6整除");
			}
			if ((x%5==0)&&(x%6!=0)) {
				System.out.println(x+"只能被 5整除");
			}
			if ((x%5!=0)&&(x%6==0)) {
				System.out.println(x+"只能被 6整除");
			}
			if (x%30!=0) {
				System.out.println(x+"不能被 5和 6整除");
			}
		}
		sc.close();

	}

}
