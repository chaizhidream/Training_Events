


import java.util.Scanner;

public class Number06 {
	/*
	 * 6．输入三个整数 x,y,z，请把这三个数由小到大输出
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		sc.close();
		
		int temp;
		if (a > b) {
			temp=a;
			a=b;
			b=temp;
		}
		if (a > c) {
			temp=a;
			a=c;
			c=temp;
		}
		if (b > c) {
			temp=b;
			b=c;
			c=temp;
		}
		System.out.println("从小到大依次是" + a + " " + b + " " + c);
	}

}
